// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.autorest.fluent.mapper;

import com.azure.autorest.extension.base.model.codemodel.OperationGroup;
import com.azure.autorest.extension.base.plugin.JavaSettings;
import com.azure.autorest.extension.base.plugin.PluginLogger;
import com.azure.autorest.fluent.FluentGen;
import com.azure.autorest.fluent.model.FluentType;
import com.azure.autorest.fluent.model.WellKnownMethodName;
import com.azure.autorest.fluent.util.TypeConversionUtils;
import com.azure.autorest.fluent.util.Utils;
import com.azure.autorest.mapper.MethodGroupMapper;
import com.azure.autorest.model.clientmodel.ClientMethod;
import com.azure.autorest.model.clientmodel.GenericType;
import com.azure.autorest.model.clientmodel.IType;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class FluentMethodGroupMapper extends MethodGroupMapper {

    private static final Logger LOGGER = new PluginLogger(FluentGen.getPluginInstance(), FluentMethodGroupMapper.class);

    private static final FluentMethodGroupMapper INSTANCE = new FluentMethodGroupMapper();

    public static FluentMethodGroupMapper getInstance() {
        return INSTANCE;
    }

    @Override
    protected List<IType> supportedInterfaces(OperationGroup operationGroup, List<ClientMethod> clientMethods) {
        if (!JavaSettings.getInstance().isFluentLite()) {
            return findSupportedInterfaces(operationGroup, clientMethods);
        } else {
            return Collections.emptyList();
        }
    }

    List<IType> findSupportedInterfaces(OperationGroup operationGroup, List<ClientMethod> clientMethods) {
        List<IType> interfaces = new ArrayList<>();
        Optional<IType> classTypeForGet = supportGetMethod(clientMethods);
        Optional<IType> classTypeForList = supportListMethod(clientMethods);
        Optional<IType> classTypeForDelete = supportDeleteMethod(clientMethods);

        classTypeForGet.ifPresent(iType -> interfaces.add(FluentType.InnerSupportsGet(iType)));
        classTypeForList.ifPresent(iType -> interfaces.add(FluentType.InnerSupportsList(iType)));
        classTypeForDelete.ifPresent(iType -> interfaces.add(FluentType.InnerSupportsDelete(iType)));

        if (!interfaces.isEmpty()) {
            LOGGER.info("Method group '{}' support interfaces {}",
                    Utils.getJavaName(operationGroup),
                    interfaces.stream().map(IType::toString).collect(Collectors.toList()));
        }
        return interfaces;
    }

    private Optional<IType> supportGetMethod(List<ClientMethod> clientMethods) {
        return clientMethods.stream()
                .filter(m -> WellKnownMethodName.GET_BY_RESOURCE_GROUP.getMethodName().equals(m.getName())
                        && checkNonClientRequiredParameters(m, 2))
                .map(m -> m.getReturnValue().getType())
                .findFirst();
    }

    private Optional<IType> supportDeleteMethod(List<ClientMethod> clientMethods) {
        return clientMethods.stream()
                .filter(m -> WellKnownMethodName.DELETE.getMethodName().equals(m.getName())
                        && checkNonClientRequiredParameters(m, 2))
                .map(m -> m.getReturnValue().getType())
                .findFirst();
    }

    private Optional<IType> supportListMethod(List<ClientMethod> clientMethods) {
        Optional<IType> listType = clientMethods.stream()
                .filter(m -> WellKnownMethodName.LIST.getMethodName().equals(m.getName())
                        && checkNonClientRequiredParameters(m, 0))
                .map(m -> m.getReturnValue().getType())
                .findFirst();

        Optional<IType> listByResourceGroupType =clientMethods.stream()
                .filter(m -> WellKnownMethodName.LIST_BY_RESOURCE_GROUP.getMethodName().equals(m.getName())
                        && checkNonClientRequiredParameters(m, 1))
                .map(m -> m.getReturnValue().getType())
                .findFirst();

        Optional<IType> commonListType = (listType.isPresent() && listByResourceGroupType.isPresent() && Objects.equals(listType.get().toString(), listByResourceGroupType.get().toString()))
                ? listType
                : Optional.empty();

        return commonListType.filter(TypeConversionUtils::isPagedIterable)
                .map(t -> ((GenericType) t).getTypeArguments()[0]);
    }

    private boolean checkNonClientRequiredParameters(ClientMethod clientMethod, int requiredCount) {
        final boolean countRequiredParametersOnly = JavaSettings.getInstance().getRequiredParameterClientMethods();
        return requiredCount == clientMethod.getParameters().stream()
                .filter(p -> (!countRequiredParametersOnly || p.getIsRequired()) && !p.getIsConstant() && !p.getFromClient())
                .count();
    }
}

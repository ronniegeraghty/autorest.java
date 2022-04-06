// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex.generated;

import com.azure.core.util.BinaryData;
import fixtures.bodycomplex.models.ReadonlyObj;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ReadonlyObjTests {
    @Test
    public void testDeserialize() {
        ReadonlyObj model =
                BinaryData.fromString("{\"id\":\"opvkmijcm\",\"size\":962982014}").toObject(ReadonlyObj.class);
        Assertions.assertEquals(962982014, model.getSize());
    }
}
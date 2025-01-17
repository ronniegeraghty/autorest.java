// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package fixtures.bodycomplex.generated;

import com.azure.core.util.BinaryData;
import fixtures.bodycomplex.models.Cookiecuttershark;
import fixtures.bodycomplex.models.Fish;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CookiecuttersharkTests {
    @Test
    public void testDeserialize() {
        Cookiecuttershark model =
                BinaryData.fromString(
                                "{\"fishtype\":\"cookiecuttershark\",\"age\":1999845889,\"birthday\":\"2021-11-09T22:26:22Z\",\"species\":\"tcj\",\"length\":45.168953,\"siblings\":[{\"fishtype\":\"Fish\",\"species\":\"vndhkrwpdapp\",\"length\":43.59222,\"siblings\":[]},{\"fishtype\":\"Fish\",\"species\":\"vwrwj\",\"length\":48.286907,\"siblings\":[]},{\"fishtype\":\"Fish\",\"species\":\"hutje\",\"length\":87.67903,\"siblings\":[]},{\"fishtype\":\"Fish\",\"species\":\"dhugjzzdatqxhocd\",\"length\":25.122803,\"siblings\":[]}]}")
                        .toObject(Cookiecuttershark.class);
        Assertions.assertEquals("tcj", model.getSpecies());
        Assertions.assertEquals(45.168953f, model.getLength());
        Assertions.assertEquals("vndhkrwpdapp", model.getSiblings().get(0).getSpecies());
        Assertions.assertEquals(43.59222f, model.getSiblings().get(0).getLength());
        Assertions.assertEquals(1999845889, model.getAge());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-09T22:26:22Z"), model.getBirthday());
    }

    @Test
    public void testSerialize() {
        Cookiecuttershark model =
                new Cookiecuttershark(45.168953f, OffsetDateTime.parse("2021-11-09T22:26:22Z"))
                        .setSpecies("tcj")
                        .setSiblings(
                                Arrays.asList(
                                        new Fish(43.59222f).setSpecies("vndhkrwpdapp").setSiblings(Arrays.asList()),
                                        new Fish(48.286907f).setSpecies("vwrwj").setSiblings(Arrays.asList()),
                                        new Fish(87.67903f).setSpecies("hutje").setSiblings(Arrays.asList()),
                                        new Fish(25.122803f)
                                                .setSpecies("dhugjzzdatqxhocd")
                                                .setSiblings(Arrays.asList())))
                        .setAge(1999845889);
        model = BinaryData.fromObject(model).toObject(Cookiecuttershark.class);
        Assertions.assertEquals("tcj", model.getSpecies());
        Assertions.assertEquals(45.168953f, model.getLength());
        Assertions.assertEquals("vndhkrwpdapp", model.getSiblings().get(0).getSpecies());
        Assertions.assertEquals(43.59222f, model.getSiblings().get(0).getLength());
        Assertions.assertEquals(1999845889, model.getAge());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-09T22:26:22Z"), model.getBirthday());
    }
}

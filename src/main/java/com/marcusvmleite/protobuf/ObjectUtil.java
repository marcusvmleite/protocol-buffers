package com.marcusvmleite.protobuf;

import com.marcusvmleite.PersonProto;

import java.util.Arrays;

public class ObjectUtil {

    public static PersonProto.Person getPersonProto() {
        return PersonProto.Person.newBuilder()
                .setAge(35)
                .setEyeColour(PersonProto.Person.EyeColour.BROWN)
                .setFirstName("Marcus")
                .addAllPhoneNumbers(Arrays.asList("1", "2"))
                .build();
    }

}

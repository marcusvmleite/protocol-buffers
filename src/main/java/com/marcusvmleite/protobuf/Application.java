package com.marcusvmleite.protobuf;

import util.PersonOuterClass;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        PersonOuterClass.Person person = PersonOuterClass.Person.newBuilder()
                .setAge(35)
                .setEyeColour(PersonOuterClass.Person.EyeColour.BROWN)
                .setFirstName("Marcus")
                .addAllPhoneNumbers(Arrays.asList("1", "2"))
                .build();
    }

}

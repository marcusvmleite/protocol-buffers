package com.marcusvmleite.protobuf;

import com.marcusvmleite.PersonProto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class PersonProtoFile {

    public static void main(String[] args) throws IOException {
        writePersonToFile();
        readPersonFromFile();
    }

    private static void writePersonToFile() throws IOException {
        PersonProto.Person person = PersonProto.Person.newBuilder()
                .setAge(35)
                .setEyeColour(PersonProto.Person.EyeColour.BROWN)
                .setFirstName("Marcus")
                .addAllPhoneNumbers(Arrays.asList("1", "2"))
                .build();
        FileOutputStream fos = new FileOutputStream("person.bin");
        person.writeTo(fos);
        fos.close();
    }

    private static void readPersonFromFile() throws IOException {
        FileInputStream fis = new FileInputStream("person.bin");
        PersonProto.Person person = PersonProto.Person.parseFrom(fis);
        System.out.println(person);
    }

}

package com.marcusvmleite.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;
import com.marcusvmleite.PersonProto;

public class PersonProtoJson {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        fromJson(toJson());
    }

    private static void fromJson(String json) throws InvalidProtocolBufferException {
        PersonProto.Person.Builder backBuilder = PersonProto.Person.newBuilder();
        JsonFormat.parser().merge(json, backBuilder);
        PersonProto.Person backPerson = backBuilder.build();
        System.out.println(backPerson);
    }

    private static String toJson() throws InvalidProtocolBufferException {
        PersonProto.Person person = ObjectUtil.getPersonProto();
        String json = JsonFormat.printer().print(person);
        System.out.println(json);
        return json;
    }

}

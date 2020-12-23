package com.tabachenko.task6;

import java.io.InvalidObjectException;

public class Main {
    public static void main(String[] args) {
        //JsonConstructor jsonConstructor = new JsonConstructor();
      /*  jsonConstructor.setOrgId("BMCOPS");
        jsonConstructor.setName("CIS - Windows Server 2012 R2 MS");
        jsonConstructor.getLastUpdate(15680394);
        jsonConstructor.setUserGroupId("IDMService");
        jsonConstructor.setUserId("IDMServiceUser");
        jsonConstructor.setDescription("This Policy is created based on the recommended settings defined by Microsoft Windows Server 2012 R2 Security Configuration Benchmark Version 2.2.0, published on April 28th, 2016\nReference#:\nhttp://cisecurity.org");
        jsonConstructor.setVersion("1.0");
        jsonConstructor.setDocumentVersion(1);*/


        Serializetor serializetor = new Serializetor();

        try {
            JsonConstructor jsonConstructor = serializetor.deserializatior();
          //  System.out.println(jsonConstructor.getUserId());

        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }

    }
}

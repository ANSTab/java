package com.tabachenko.task5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileM {

    public static void main(String[] args) throws IOException {
        File foz = new File("D:\\TestDir\\pictures");
        List<String> stringList = Arrays.asList(foz.list());
        System.out.println(stringList);
        FileOutputStream fos = new FileOutputStream("D:\\TestDir\\pictures\\АрхивБля.zip");
        ZipOutputStream zipOutputStream = new ZipOutputStream(fos);
        for (String asd : stringList) {

            try (FileInputStream fis = new FileInputStream(asd)) {
                File fileToZip = new File(asd);
                ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
                zipOutputStream.putNextEntry(zipEntry);
                byte[] bytes = new byte[10240];
                int lenght;
                while ((lenght = fis.read(bytes)) >= 0) {
                    zipOutputStream.write(bytes, 0, lenght);
                }
                fis.close();
            } catch (FileNotFoundException e){

            }
        }
        zipOutputStream.close();
        fos.close();

    }
}




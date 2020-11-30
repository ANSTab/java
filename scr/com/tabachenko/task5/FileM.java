package com.tabachenko.task5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileM {

    public static void main(String[] args) throws IOException {
        File foz = new File("D:\\TestDir\\pictures");
        List<String> stringList = Arrays.asList(foz.list());
        List<String> strings = new ArrayList<>();
        for (String s : stringList) {
            String pathToS = String.valueOf(Paths.get(s).toAbsolutePath());
            //String pathToS = "D:\\TestDir\\pictures" + s;
            strings.add(pathToS);
        }
        System.out.println(strings);
        FileOutputStream fos = new FileOutputStream("D:\\TestDir\\АрхивБля.zip");
        ZipOutputStream zipOutputStream = new ZipOutputStream(fos);
        for (String asd : strings) {
            File fileToZip = new File(asd);
            FileInputStream fis = new FileInputStream(fileToZip);
            ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
            zipOutputStream.putNextEntry(zipEntry);
            byte[] bytes = new byte[1024];
            int lenght;
            while ((lenght = fis.read(bytes)) >= 0) {
                zipOutputStream.write(bytes, 0, lenght);
            }
            fis.close();
        }
        zipOutputStream.close();
        fos.close();
    }


}





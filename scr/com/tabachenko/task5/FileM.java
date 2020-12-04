package com.tabachenko.task5;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileM {

    public static void main(String[] args) throws IOException {

        List<String> strings = new ArrayList<>();
        File foz = new File("D:\\TestDir\\pictures\\");
        Path path = null;
        List<String> stringList = Arrays.asList(foz.list());

       /*  for (String s : stringList) {
            String pathToS = String.valueOf(Paths.get(s).toAbsolutePath());
            strings.add(pathToS);*/
        System.out.println(strings);

        FileOutputStream fos = new FileOutputStream("D:\\TestDir\\arhive.zip");
        ZipOutputStream zipOutputStream = new ZipOutputStream(fos);
        for (String asd : stringList) {
            File fileToZip = new File("D:\\TestDir\\pictures\\" + asd);

            System.out.println(fileToZip.getAbsolutePath());
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





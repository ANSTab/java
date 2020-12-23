package com.tabachenko.task5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


public class test3 {
    public static void main(String[] args) throws IOException {


       // List<String> srcFiles = Arrays.asList("D:\\TestDir\\text\\test\\qw.txt", "D:\\TestDir\\text\\test\\s.txt");
        List<String> srcFiles = new ArrayList<>();
        srcFiles.add("D:\\TestDir\\text\\test\\qw.txt");
        srcFiles.add("D:\\TestDir\\text\\test\\s.txt");
        srcFiles.add("D:\\TestDir\\Shlak\\Новий текстовий документ (2).txt");
        FileOutputStream fos = new FileOutputStream("D:\\TestDir\\text\\multiCompressed111.zip");
        ZipOutputStream zipOut = new ZipOutputStream(fos);
        for (String srcFile : srcFiles) {
            File fileToZip = new File(srcFile);
            FileInputStream fis = new FileInputStream(fileToZip);
            ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
            zipOut.putNextEntry(zipEntry);
            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >= 0) {
                zipOut.write(bytes, 0, length);
            }
            fis.close();
        }
        zipOut.close();
        fos.close();
    }
}


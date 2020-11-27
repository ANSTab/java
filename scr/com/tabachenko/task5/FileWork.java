package com.tabachenko.task5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class FileWork {

    public static void main(String[] args) throws IOException {

        File dir0 = new File("D:\\TestDir\\Shlak");
        File dir = new File("D:\\TestDir\\musikNew");
        File dir1 = new File("D:\\TestDir\\pictures");
        File dir2 = new File("D:\\TestDir\\text");

        if (!dir.exists() && !dir1.exists() && !dir2.exists()) {
            dir.mkdir();
            dir1.mkdir();
            dir2.mkdir();
            System.out.println("Сортування проведене");
        } else {
            System.out.println("вже є такі дерикторії");
        }
        try {
            for (File f : dir1.listFiles()) {

                if (f.getName().toLowerCase().endsWith(".jpg")) {
                    File qFile = new File("D:\\TestDir\\pictures\\" + f.getName());
                    Files.copy(f.toPath(), qFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    List<String> arr = new ArrayList<>();
                    arr.add(String.valueOf(f.toPath()));
                    System.out.println(arr);
                    FileOutputStream fos = new FileOutputStream("D:\\TestDir\\multy.zip", true);
                    ZipOutputStream zipOutputStream = new ZipOutputStream((fos));
                    for (String q : arr) {
                        File fileToZip = new File(String.valueOf(q));
                        try (FileInputStream fis = new FileInputStream(fileToZip)) {
                            ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
                            zipOutputStream.putNextEntry(zipEntry);
                            byte[] bytes = new byte[fis.available()];
                            int lenght;
                            while ((lenght = fis.read(bytes)) >= 0) {
                                zipOutputStream.write(bytes, 0, lenght);
                            }
                            fis.close();
                        } catch (FileNotFoundException e) {

                        }
                    }
                    zipOutputStream.closeEntry();
                    fos.close();
                }

            }
        } catch (NullPointerException e) {
        }

    }
}



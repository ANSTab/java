package com.tabachenko.task5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class FileMeneger {

    public static void main(String[] args) throws IOException {

        File dir0 = new File("C:\\Users\\otabachenko\\Downloads");
        File dir = new File("D:\\Льоха\\musikNew");
        File dir1 = new File("D:\\TestDir\\pictures");
        File dir2 = new File("D:\\TestDir\\text");

        if (!dir.exists() && !dir1.exists() && !dir2.exists()) {
            dir.mkdir();
            //dir1.mkdir();
            //dir2.mkdir();
            System.out.println("Сортування проведене");
        } else {
            System.out.println("вже є такі дерикторії");
        }
        try {
            for (File f : dir0.listFiles()) {
                if (f.getName().toLowerCase().endsWith(".mp3")) {
                    File qFile = new File("D:\\Льоха\\musikNew\\" + f.getName());

                    Files.copy(f.toPath(), qFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    f.delete();
                }
              /*  if (f.getName().toLowerCase().endsWith(".txt")) {
                    File qFile = new File("D:\\TestDir\\text\\" + f.getName());
                    Files.copy(f.toPath(), qFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                   // f.delete();
                }
                if (f.getName().toLowerCase().endsWith(".jpg")) {
                    File qFile = new File("D:\\TestDir\\pictures\\" + f.getName());
                    Files.copy(f.toPath(), qFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                   // f.delete();
                }*/
               /* if (!f.exists()) {
                    dir0.delete();
                }*/
            }
        } catch (NullPointerException e) {
        }

    }
}



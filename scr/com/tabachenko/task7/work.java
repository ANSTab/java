package com.tabachenko.task7;

import java.io.*;
import java.sql.Array;
import java.util.ArrayList;

public class work {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\java\\qw.json");
        String s = "asdad";
        try (FileOutputStream fos = new FileOutputStream(file)) {
            fos.write(s.getBytes());
            fos.close();

        }catch (IOException e){
            e.printStackTrace();

        }

        try (FileInputStream fis = new FileInputStream("D:\\java\\qw.json")) {
            int b = 0;
     while ((b= fis.read())!=-1){
         System.out.print((char)b);

     }



        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


    }
}

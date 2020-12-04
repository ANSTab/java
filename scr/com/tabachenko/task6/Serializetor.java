package com.tabachenko.task6;

import java.io.*;

public class Serializetor {


    public boolean serializetion (Auto auto)  {


        boolean flag = false;
        File file = new File("D:\\java\\AutoFile.json");
        ObjectOutputStream oos = null;

        try {
            FileOutputStream fos = new FileOutputStream(file);

            if (fos!=null){
                oos = new ObjectOutputStream(fos);
                oos.writeObject(auto);
                flag = true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }
}

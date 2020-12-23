package com.tabachenko.task7;

import java.io.*;

public class IFfromJson {
    public boolean serializetion(String infoTask) {
        boolean flag = false;
        File file = new File("D:\\java\\jSonFile.json");
        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream(file);

            if (fos != null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(infoTask);
                flag = true;
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        } catch (
                IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }

    public StringBuilder deserializatior() throws InvalidObjectException {
           File file = new File("D:\\java\\responce.json");
        String InfoTask = null;
        StringBuilder stringBuilder = new StringBuilder();

        try {
            FileInputStream fis = new FileInputStream(file);
            if (fis != null) {
                int b = 0;
                while ((b = fis.read()) != -1) {
                    InfoTask = Character.toString(b);
                    stringBuilder.append(InfoTask);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return stringBuilder;
    }
}


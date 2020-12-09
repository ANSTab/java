package com.tabachenko.task7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

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
        //  File file = new File("D:\\java\\jSonFile.json");
        File file = new File("D:\\java\\responce.json");
        ObjectInputStream ois = null;
        String InfoTask = null;
        StringBuilder stringBuilder = new StringBuilder();
        List<String> list = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(file);
            if (fis != null) {
                int b = 0;
                while ((b = fis.read()) != -1) {
                    // ois = new ObjectInputStream(fis);
                    // String InfoTask = (String) ois.readObject();
                    InfoTask = Character.toString(b);
                    stringBuilder.append(InfoTask);
                    //System.out.println(stringBuilder);
                    //System.out.print(InfoTask);
                    //System.out.print((char)b);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        /*finally {
          /*  try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        //  throw new InvalidObjectException(" Object fail");
        //System.out.println(InfoTask);
        return stringBuilder;
    }
}


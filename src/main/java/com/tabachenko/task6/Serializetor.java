package com.tabachenko.task6;

import java.io.*;

public class Serializetor {


    public boolean serializetion(JsonConstructor jsonConstructor) {


        boolean flag = false;
        File file = new File("D:\\java\\jSonTest.json");
        ObjectOutputStream oos = null;

        try {
            FileOutputStream fos = new FileOutputStream(file);

            if (fos != null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(jsonConstructor);
                flag = true;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
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

    public JsonConstructor deserializatior() throws InvalidObjectException {
        File file = new File("D:\\java\\jSonTest.json");
        ObjectInputStream ois = null;

        try {
            FileInputStream fis = new FileInputStream(file);
            if (fis != null) {
                ois = new ObjectInputStream(fis);
                JsonConstructor jsonConstructor = (JsonConstructor) ois.readObject();
                return jsonConstructor;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }throw new InvalidObjectException(" Object fail");

    }

    }

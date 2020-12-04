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

    public String deserializatior() throws InvalidObjectException {
        File file = new File("D:\\java\\jSonFile.json");
       // File file = new File("D:\\java\\responce.json");
        ObjectInputStream ois = null;

        try {
            FileInputStream fis = new FileInputStream(file);
            if (fis != null) {
                ois = new ObjectInputStream(fis);
                String InfoTask = (String) ois.readObject();
                return InfoTask;
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
        }
        throw new InvalidObjectException(" Object fail");

    }

}


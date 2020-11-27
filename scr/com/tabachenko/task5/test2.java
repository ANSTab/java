package com.tabachenko.task5;
import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

    public class test2 {
        public static void main(String[] args) throws Exception {
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream("D:\\TestDir\\text\\archive1.zip"));

            File file = new File("D:\\TestDir\\text\\test");

            doZip(file, out);

            out.close();
        }

        private static void doZip(File dir, ZipOutputStream out) throws IOException {
            for (File f : dir.listFiles()) {
                if (f.isDirectory())
                    doZip(f, out);
                else {
                    out.putNextEntry(new ZipEntry(f.getPath()));
                    write(new FileInputStream(f), out);
                }
            }
        }

        private static void write(InputStream in, OutputStream out) throws IOException {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = in.read(buffer)) >= 0)
                out.write(buffer, 0, len);
            in.close();
        }
    }


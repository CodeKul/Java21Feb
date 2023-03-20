package filehandling;

import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {

        try {
//            File file = new File("");
//            file.createNewFile();

            FileOutputStream fileOutputStream = new FileOutputStream("Sample.txt");
            String str = "Welcome";
            byte b[]  = str.getBytes();
            fileOutputStream.write(b);

            fileOutputStream.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("Sample.txt");
            int i = fileInputStream.read();
            while (i != -1){
                System.out.print((char)i);
                i = fileInputStream.read();
            }
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package filehandling;

import java.io.*;

public class BufferDemo {

    public static void main(String[] args) {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("test1.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write("pune".getBytes());

            System.out.println("file write successfully");
            bufferedOutputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("test1.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int i = bufferedInputStream.read();
            while (i != -1) {
                System.out.print((char) i);
                i = bufferedInputStream.read();
            }
            bufferedInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

package filehandling;

import java.io.*;

public class FileWriterReaderDemo {

    public static void main(String[] args) {
//character stream

        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter("/home/vaibhav/JavaBatches/Feb21Java/src/filehandling/test.txt");
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("\"FUNCTION: public.fn_service_rate_m\"");

            System.out.println("file write successfully");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("/home/vaibhav/JavaBatches/Feb21Java/src/filehandling/test.txt");
            bufferedReader = new BufferedReader(fileReader);
            int i = bufferedReader.read();

            while (i != -1) {
                System.out.print((char) i);
                i = bufferedReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}

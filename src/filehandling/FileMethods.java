package filehandling;

import java.io.File;

public class FileMethods {

    public static void main(String[] args) {

        try {
            File file = new File("/home/vaibhav/JavaBatches/Feb21Java/test3.pdf");
            if(file.createNewFile()){
                System.out.println("File created");
            }else {
                System.out.println("file is already created");
            }

            System.out.println(file.isFile());
            System.out.println(file.getTotalSpace());
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.canExecute());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.exists());
            System.out.println(file.getCanonicalPath());
            System.out.println(file.getName());
            System.out.println(file.isDirectory());
//            File d1 = new File("d1");
//            d1.mkdir();
            File  f = new File("non_existing_dir/someDir");
//            System.out.println(f.mkdir());
            System.out.println(f.mkdirs());


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

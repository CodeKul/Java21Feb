package stringdemo;

import javax.print.DocFlavor;

public class StringBufferDemo {
    public static void main(String[] args) {

        String str ="Hello";
//        System.out.println(new StringBuilder(" ").capacity());
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer.append("Mumbai");
//        System.out.println(stringBuffer);

//        System.out.println(stringBuffer.reverse());
//        System.out.println(stringBuffer.insert(2,'e'));
//        System.out.println(stringBuffer.replace(2,3,"i"));
//        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer);
//        System.out.println(stringBuffer.delete(1,3));
        System.out.println(stringBuffer.deleteCharAt(0));


        StringBuilder stringBuilder = new StringBuilder("Pune");
        stringBuilder.append("Mumbai");
//        System.out.println(stringBuilder);

    }
}

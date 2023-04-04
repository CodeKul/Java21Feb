package stringdemo;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Mumbai";


        String str = "pune";
        str = str.concat("hii");

        System.out.println(str);

        System.out.println(str.getBytes());


        String str2 = "abcrtryryr1em  ";
        String str4 = "abcdef";
        System.out.println(str2.trim());

//        System.out.println(str2==str4);
//        System.out.println(str2.equals(str4));

        System.out.println(str2.compareTo(str4));

//        System.out.println(str4.startsWith("u"));
//        System.out.println(str4.indexOf("b"));
//        System.out.println(str4.charAt(4));

//        System.out.println(str4.contains("c"));
//        str4 = str4.concat("d");
//        str4= str4.replace('c','f');
        str4 = str4.substring(3, 6);
        System.out.println(str4);

        String str6 = "8";
        Integer i = Integer.valueOf(str6);
        System.out.println(i);
    }
}

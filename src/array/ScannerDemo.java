package array;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[4];
        int num;
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter any number");
            num = scanner.nextInt();
            arr[i] = num;
        }

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

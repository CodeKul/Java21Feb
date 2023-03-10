package controlflowstatement;

import java.util.Arrays;
import java.util.List;

public class ForLoop {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
        System.out.println();
        for (int i:arr) {//enhanced for loop
            System.out.println(i);
        }
        System.out.println();

        List<Integer> list = Arrays.asList(1,2,3,4);

        list.forEach(s->{
            System.out.println(s);
        });

        for(int i =1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i =1;i<=4;i++){
            for (int j=i;j<=4;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/**
 *    * * * * *
 *    * * * * *
 *    * * * * *
 *    * * * * *

 */

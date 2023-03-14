package controlflowstatement;

import java.util.Scanner;

public class DoWhileDemo {

    public static void main(String[] args) {

        int i = 10;
//        while (i >= 11){
//            System.out.println(i);
//            i--;
//        }

        int num;
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        char choice;
        do{
            System.out.println("Enter value");
            num = scanner.nextInt();
            sum = sum + num;
            System.out.println("Do you want to continue");
            choice = scanner.next().charAt(0);
        } while (choice=='Y' || choice=='y');

        System.out.println("sum=>"+sum);
    }
}
//random value - 1 to 100 - 34
// int i = (int) (Math.random()*100) +1
//20
//30
//40
//34
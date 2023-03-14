package controlflowstatement;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

        int num1, num2;
        char operator;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1,num2,operator");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
            default:
                System.out.println("not mathches");
        }

    }
}

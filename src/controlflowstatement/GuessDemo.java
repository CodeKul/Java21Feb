package controlflowstatement;

import java.util.Scanner;

public class GuessDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num, guess, attempt = 0;
        num = (int) (Math.random() * 100) + 1;

        do {
            System.out.println("Enter number");
            guess = scanner.nextInt();
            attempt++;
            if (num > guess) {
                System.out.println("Number is greater");
            } else if (num < guess) {
                System.out.println("Number is smaller");
            } else {
                System.out.println("You guess correct at attempt " + attempt);
            }
        } while (num != guess);
    }
}

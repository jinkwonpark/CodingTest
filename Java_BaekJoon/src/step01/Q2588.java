package step01;

import java.util.Scanner;

public class Q2588 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int num21 = num2 / 100;
        int num22 = (num2 / 10) - (num21 * 10);
        int num23 = num2 - (num21 * 100) - (num22 * 10);

        System.out.println(num1 * num23);
        System.out.println(num1 * num22);
        System.out.println(num1 * num21);
        System.out.println(num1 * num2);
    }
}

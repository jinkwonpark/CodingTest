package step01;

import java.util.Scanner;

public class Q11382 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] values = input.split(" ");

        long A = Long.parseLong(values[0]);
        long B = Long.parseLong(values[1]);
        long C = Long.parseLong(values[2]);

        System.out.println(A + B + C);
    }
}

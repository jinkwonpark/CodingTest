package step01;

import java.util.Scanner;

public class Q10430 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();

            String values[] = input.split("\\s+");

            int A = Integer.parseInt(values[0]);
            int B = Integer.parseInt(values[1]);
            int C = Integer.parseInt(values[2]);

            System.out.println((A + B) % C);
            System.out.println(((A % C) + (B % C)) % C);
            System.out.println((A * B) % C);
            System.out.println(((A % C) * (B % C)) % C);
    }
}

package pl.arczi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        char[] chars = name.toCharArray();

        Scanner number1 = new Scanner(System.in);
        Scanner number2 = new Scanner(System.in);
        int first = number1.nextInt();
        int second = number2.nextInt();

        for (int i = first; i < second; i++) {
            System.out.print(chars[i]);
        }
    }
}

package week1;

import java.util.Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int number2 = Integer.parseInt(reader.nextLine());
        System.out.println("The bigger of the two numbers given was: " + Math.max(number1, number2));
    }
}

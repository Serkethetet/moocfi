package week1;

import java.util.Scanner;

public class GreaterNumber {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type first number: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type second number: ");
        int number2 = Integer.parseInt(reader.nextLine());

        if (number1 > number2) {
            System.out.println("Greater number: " + number1);
        } else if (number2 > number1) {
            System.out.println("Greater number: " + number2);
        } else if (number1 == number2) {
            System.out.println("The numbers are equal!");
        }
    }
}

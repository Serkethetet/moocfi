package week1;

import java.util.Scanner;

public class Usernames {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.print("Type your password: ");
        String pw = reader.nextLine();

        if ((name.equals("alex") && pw.equals("mightyducks")) || (name.equals("emily") && pw.equals("cat"))) {
            System.out.println("Youe are now logged into the system!");
        } else {
            System.out.println("Your username or password is invalid!");
        }
    }
}

package week1;

public class SecondsPerYear {
    public static void main(String[] args) {
        int seconds = 60;
        int minutes = 60;
        int hours = 24;
        int days = 365;
        int sum = seconds * minutes * hours * days;
        System.out.println("There are " + sum + " seconds in a year.");
    }
}

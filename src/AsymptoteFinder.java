import java.util.Scanner;

public class AsymptoteFinder {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a m value:");
        int m = keyboard.nextInt();
        System.out.println("Please enter a n value:");
        int n = keyboard.nextInt();
        keyboard.close();

        if (n == m) {
            System.out.println("The asymptote is horizontal.");
        } else if (n > m) {
            System.out.println("The asymptote is the x-axis.");
        } else {
            if (m - n == 1) {
                System.out.println("The asymptote is linear.");
            } else if (m - n == 2) {
                System.out.println("The asympote is quadratic.");
            } else if (m - n == 3) {
                System.out.println("The asympote is cubic.");
            } else if (m - n == 4) {
                System.out.println("The asympote is quartic.");
            } else if (m - n == 5) {
                System.out.println("The asympote is quintic.");
            } else if (m - n == 6) {
                System.out.println("The asympote is sextic.");
            } else if (m - n == 7) {
                System.out.println("The asympote is septic.");
            } else if (m - n == 8) {
                System.out.println("The asympote is octic.");
            } else if (m - n == 9) {
                System.out.println("The asympote is nonic.");
            } else if (m - n == 10) {
                System.out.println("The asympote is decic.");
            }
        }
    }
}
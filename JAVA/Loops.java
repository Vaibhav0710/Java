import java.util.*;

public class Loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        /*
         * Print Number from 1 to n
         */
        System.out.println("Print number from 1 to N");
        System.out.print("N = ");
        int counter = sc.nextInt();
        int i = 1;
        while (i <= counter) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println(" ");
        /*
         * Print the sum of first N natural number
         */
        System.out.println("Print the sum of first N natural number");
        System.out.print("N = ");
        int N = sc.nextInt();
        int counters = 1;
        int Total = 0;
        while (counters <= N) {
            Total += counters;
            counters++;
        }
        System.out.println("Total = " + Total);
        /*
         * Print Square pattern
         */
        System.out.println("Print Square pattern");
        System.out.print("Line = ");
        int Line = sc.nextInt();
        for (int z = 1; z <= Line; z++) {
            for (int j = 1; j <= Line; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        /*
         * Print reverse of the number
         */
        System.out.println("Print reverse of the number");
        System.out.print("Number = ");
        int Number = sc.nextInt();
        int rev = 0;
        while (Number > 0) {
            int lastdigit = Number % 10;
            rev = (rev * 10) + lastdigit;
            Number /= 10;
        }
        System.out.print("Reverse number = ");
        System.out.println(rev);
        /*
         * Check if the number is prime or not
         */
        System.out.println("Check if the number is prime or not");
        System.out.print("Number = ");
        int input = sc.nextInt();
        if (input == 2 || input == 3) {
            System.out.println("Number is Prime");
        } else {
            boolean isPrime = true;
            for (int I = 2; I <= Math.sqrt(input); I++) {
                if (input % I == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("Number is Prime");
            } else {
                System.out.println("Number is not prime");
            }
        }
        sc.close();
    }
}
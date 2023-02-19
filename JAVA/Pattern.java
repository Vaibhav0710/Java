import java.util.*;

public class Pattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        /*
         * Print star pattern
         */
        System.out.println("Print Star pattern");
        System.out.print("Line = ");
        int Line = sc.nextInt();
        for (int i = 1; i <= Line; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
         * Print reverse star pattern
         */
        System.out.println("Print reverse Star pattern");
        System.out.print("Line = ");
        int Line2 = sc.nextInt();
        for (int i = 1; i <= Line2; i++) {
            for (int j = Line2; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
         * Print half pyramid pattern(number)
         */
        System.out.println("Print half pyramid pattern(number)");
        System.out.print("Line = ");
        int Line3 = sc.nextInt();
        for (int i = 1; i <= Line3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        /*
         * Print Character pattern
         */
        System.out.println("Print Character pattern");
        System.out.print("Line = ");
        int Line4 = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i <= Line4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        sc.close();
    }
}

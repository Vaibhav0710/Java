import java.util.*;

public class Pattern2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        {
            /*
             * Print Hollow pattern
             */
            System.out.println("Print Hollow pattern");
            System.out.print("Rows = ");
            int Row = sc.nextInt();
            System.out.print("Cols = ");
            int Col = sc.nextInt();
            for (int i = 1; i <= Row; i++) {
                for (int j = 1; j <= Col; j++) {
                    if (i == 1 || j == 1 || i == Row || j == Col) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        {
            /*
             * Print inverted & rotated half pattern
             */
            System.out.println("Print Inverted & Rotated Half Pattern");
            System.out.print("Rows = ");
            int Row = sc.nextInt();
            for (int i = 1; i <= Row; i++) { // Outer
                for (int j = 1; j <= Row - i; j++) { // Spaces
                    System.out.print("  ");
                }
                for (int z = 1; z <= i; z++) { // Stars
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        {
            /*
             * Print Floyds Number pattern
             */
            System.out.println("Print Floyds Number pattern");
            System.out.print("Rows = ");
            int Row = sc.nextInt();
            int num = 1;
            for (int i = 1; i <= Row; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
                }
                System.out.println();
            }
        }
        {
            /*
             * Print 1 & 0 pattern
             */
            System.out.println("Print 1 & 0 pattern");
            System.out.print("Rows = ");
            int Row = sc.nextInt();
            int num = 0;
            for (int i = 1; i <= Row; i++) {
                for (int j = 1; j <= i; j++) {
                    num++;
                    if (num % 2 == 0) {
                        System.out.print("0 ");
                    } else {
                        System.out.print("1 ");
                    }
                }
                System.out.println();
            }
        }
        {
            /*
             * Print inverted half pyramid with number pattern
             */
            System.out.println("Print inverted half pyramid with number pattern");
            System.out.print("Rows = ");
            int Row = sc.nextInt();
            for (int i = Row; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
        {
            /*
             * Print Butterfly pattern
             */
            System.out.println("Print Butterfly pattern");
            System.out.print("Rows = ");
            int Row = sc.nextInt();
            // Part 1
            for (int i = 1; i <= Row; i++) {
                // First stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                // Spaces
                for (int j = Row; j >= i + 1; j--) {
                    System.out.print("    ");
                }
                // Second star
                for (int z = 1; z <= i; z++) { // Stars
                    System.out.print("* ");
                }
                System.out.println("  ");
            }
            // Part 2
            for (int i = Row; i >= 1; i--) {
                // First stars
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                // Spaces
                for (int j = Row; j >= i + 1; j--) {
                    System.out.print("    ");
                }
                // Second star
                for (int z = 1; z <= i; z++) { // Stars
                    System.out.print("* ");
                }
                System.out.println("  ");
            }
        }
        {
            /*
             * Solid Rhombus Pattern
             */
            System.out.println("Print Solid Rhombus Pattern");
            System.out.print("Rows = ");
            int Row = sc.nextInt();
            for (int i = Row; i >= 1; i--) {
                // Spaces
                for (int j = 1; j <= i; j++) {
                    System.out.print("  ");
                }
                // Stars
                for (int j = 1; j <= Row; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        {
            /*
             * Hollow Solid Rhombus Pattern
             */
            System.out.println("Print Hollow Solid Rhombus Pattern");
            System.out.print("Rows = ");
            int Row = sc.nextInt();
            for (int i = Row; i >= 1; i--) {
                // Spaces
                for (int j = 1; j <= i; j++) {
                    System.out.print("  ");
                }
                // Stars
                for (int j = 1; j <= Row; j++) {
                    if (i == 1 || j == 1 || i == Row || j == Row) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
        {
            /*
             * Diamond Pattern
             */
            System.out.println("Print Diamond Pattern");
            System.out.print("Rows = ");
            int Row = sc.nextInt();
            // Part 1
            for (int i = 1; i <= Row; i++) {
                // Spaces
                for (int j = Row; j >= i + 1; j--) {
                    System.out.print("  ");
                }
                // Stars
                for (int j = 1; j <= (2 * i) - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println("  ");
            }
            // Part 2
            for (int i = Row; i >= 1; i--) {
                // Spaces
                for (int j = Row; j >= i + 1; j--) {
                    System.out.print("  ");
                }
                // Stars
                for (int j = 1; j <= (2 * i) - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println("  ");
            }
        }
        sc.close();
    }
}
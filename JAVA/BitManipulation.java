public class BitManipulation {
    public static void main(String args[]) {
        {
            /*
             * swaping number using Bit Manipulation
             */
            int x = 3, y = 4;
            System.out.println("Before swap: x = " + x + " and y = " + y);
            // swap using xor
            x = x ^ y;
            y = x ^ y;
            x = x ^ y;
            System.out.println("After swap: x = " + x + " and y = " + y);
        }
        {
            /*
             * Add 1 to an integer using Bit Manipulati
             */
            int x = 6;
            System.out.println(x + " + " + 1 + " is " + -~x);
            x = -4;
            System.out.println(x + " + " + 1 + " is " + -~x);
            x = 0;
            System.out.println(x + " + " + 1 + " is " + -~x);
        }
        {
            /*
             * This question is based on a trick, please directly look at the solution.
             * Convert uppercase characters to lowercase using bits.
             */
            // Convert uppercase character to lowercase
            for (char ch = 'A'; ch <= 'Z'; ch++) {
                System.out.print((char) (ch | ' '));
                // prints abcdefghijklmnopqrstuvwxyz
            }
        }
    }
}
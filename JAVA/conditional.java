import java.util.*;

public class conditional {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        /*
         * To find bigger number
         */
        System.out.println("To find bigger number");
        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " is greater then " + b);
        } else {
            System.out.println(b + " is greater than " + a);
        }
        /*
         * To print if input is even or odd
         */
        System.out.println("To print if the number is even or odd");
        System.out.print("input= ");
        int input = sc.nextInt();
        if (input % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        /*
         * Income Tax calculator
         */
        System.out.println("Income Tax calculator");
        System.out.print("Income= ");
        int Income = sc.nextInt();
        int Tax;
        if (Income < 500000) {
            Tax = 0;
        } else if (Income >= 500000 && Income <= 1000000) {
            Tax = (int) (0.2 * Income);
        } else {
            Tax = (int) (0.3 * Income);
        }
        System.out.println("Your Tax is " + Tax);
        /*
         * To Print largest of 3 numbers
         */
        System.out.println("To Print largest of 3 numbers");
        System.out.print("A= ");
        int A = sc.nextInt();
        System.out.print("B= ");
        int B = sc.nextInt();
        System.out.print("C= ");
        int C = sc.nextInt();
        if (A >= B && A >= C) {
            System.out.println(A + " is largest number");
        } else if (B >= C) {
            System.out.println(B + " is largest number");
        } else {
            System.out.println(C + " is largest number");
        }
        /*
         * To print if input is even or odd using Ternary operator
         */
        System.out.println("To print if input is even or odd using Ternary operator");
        // variable = condition ? statement1 : statement2;
        System.out.print("number= ");
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        /*
         * To find if student is pass or false
         */
        System.out.println("To find if student is pass or Fail");
        System.out.print("marks= ");
        int marks = sc.nextInt();
        if (marks >= 33) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        sc.close();
    }
}
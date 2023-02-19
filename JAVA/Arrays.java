import java.util.*;

public class Arrays {
    /*
     * Pair in Arrays
     */
    public static void PairArray(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int current = num[i];
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + current + ", " + num[j] + ")");
            }
            System.out.println(" ");
        }
    }

    /*
     * Reverse Array
     */
    public static void ReverseArray(int num[]) {
        int first = 0, last = num.length - 1;
        while (first < last) {
            // Swap
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;
            first++;
            last--;
        }
    }

    /*
     * Binary Search
     */
    public static int BinarySearch(int num[], int key) {
        int start = 0, end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // Comparions
            if (num[mid] == key) {
                return mid;
            }
            if (num[mid] < key) {// Right
                start = mid + 1;
            } else {// Left
                end = mid - 1;
            }
        }
        return -1;
    }

    /*
     * Finding largest number
     */
    public static int getlargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }

    /*
     * Finding Smallest number
     */
    public static int getsmallest(int num[]) {
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        return smallest;
    }

    /*
     * Linear search
     */
    public static int linear(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    /*
     * Updating array in function
     */
    public static void update(int num[]) {
        for (int i = 0; i < num.length; i++) {
            num[i] = num[i] + 1;
        }
    }

    public static void main(String[] args) {
        /*
         * Creation of Arrays
         */
        int marks[] = new int[50];
        int num[] = { 1, 2, 5, 6, 9, 15, 46, 50, 60, 82 };
        /*
         * Input from user
         */
        System.out.println("Input from user");
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        /*
         * Print arrays
         */
        System.out.println("Printing marks Arrays");
        System.out.println("marks1: " + marks[0]);
        System.out.println("marks2: " + marks[1]);
        System.out.println("marks3: " + marks[2]);
        /*
         * Print Arrays in for loop
         */
        System.out.println("Printing arrays in for loop");
        for (int i = 0; i < num.length; i++) {
            System.out.print("num are: " + num[i] + " ");
        }
        System.out.println(" ");
        /*
         * Update marks in for loop and in different function and also print it
         */
        System.out.println("Updating marks in for loop and in different function and also print it");
        update(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print("num are: " + num[i] + " ");
        }
        System.out.println(" ");
        /*
         * Linear search
         */
        System.out.println("Linear search of a key");
        int key = 6;
        int index = linear(num, key);
        System.out.println("index is: " + index);
        /*
         * Getting largest and Smallest number in the array
         */
        System.out.println("Printing Largest and Smallest num in the array");
        System.out.println("Largest number is: " + getlargest(num) + " And Smallest number is: " + getsmallest(num));
        /*
         * Binary Search
         */
        System.out.println("Binary search");
        System.out.println("index of " + key + " is " + BinarySearch(num, key));
        /*
         * Reverse Array
         */
        System.out.println("Reverse Array");
        ReverseArray(num);
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println(" ");
        /*
         * Pair in Arrays
         */
        System.out.println("Printing the pair of arrys");
        PairArray(num);
        sc.close();
    }
}
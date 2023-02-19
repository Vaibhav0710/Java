import java.util.*;

public class operation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b = 5;
        System.out.println("add = " + (a + b));
        System.out.println("sub = " + (a - b));
        System.out.println("multi = " + (a * b));
        System.out.println("div = " + (a / b));
        System.out.println("remainder = " + (a % b));
        System.out.println("unary(a++) = " + (a++) + (" ") + (a));
        System.out.println("unary(a--) = " + (a--) + (" ") + (a));
        System.out.println("(++b)unary = " + (++b) + (" ") + (b));
        System.out.println("(--b)unary = " + (--b) + (" ") + (b));
        sc.close();
    }
}
/*
 * Relation operators (it returns True or False)
 * a==b (for check a is equal to b) "False"
 * a!=b (for check a is not equal to b) "True"
 * a>b (for check a is greater than b) "True"
 * a<b (for check a is less than b) "False"
 * a>=b (for check a is greater than or equal to b) "True"
 * a<=b (for check a is lesser than or equal to b) "False"
 */

/*
 * Logical opreators (it returns True or False)
 * statement1 && statement2 (Logical AND)
 * "if both statement is true then only the o/p will be True otherwise False"
 * statement1 || statement2 (Logical OR)
 * "if both statement is false then only the o/p will be False otherwise True"
 * !statement1 (Logical NOT)
 * "it will convert True statement into False vise versa"
 */

/*
 * Assignment operator
 * a+=10 (a = a + 10)
 * a-=10 (a = a - 10)
 * a*=10 (a = a * 10)
 * a/=10 (a = a / 10)
 * a%=10 (a = a % 10)
 */
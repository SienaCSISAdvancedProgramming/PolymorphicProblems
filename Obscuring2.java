/*
 * Example Obscuring2: obscuring of a constant
 *
 * @author Darren Lim
 */

class A {
    static int MIN_PRIORITY = 59;
};

public class Obscuring2 {
    static A Thread;

    public static void main(String args[]) {

        // print value of class
        // variable Thread.MIN_PRIORITY

        System.out.println(Thread.MIN_PRIORITY);

        // print value of
        // java.lang.Thread.MIN_PRIORITY

        System.out.println(java.lang.Thread.MIN_PRIORITY);
    }
}

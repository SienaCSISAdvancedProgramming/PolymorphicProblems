/*
 * Example Obscuring: what does this do?!
 *
 * @author Darren Lim
 *
 */

public class Obscuring {

    public static Obscuring System, out;
    
    public static void println(Object s)
    {
        java.lang.System.out.println("ME");
    }
    
    public static void main(String args[])
    {
        System.out.println("Hello World");
    }
}

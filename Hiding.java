/**
 * An example demonstrating hiding caused by a subclass having a field
 * of the same name as its superclass.
 * 
 * @author Jim Teresco
 * @version Spring 2022
 */
public class Hiding {

    public static void main(String args[]) {
        A a = new A();
        a.setX(30);
        System.out.println(a);

        B b = new B();
        b.setX(40);
        System.out.println(b);
    }
}

class A {
    protected int x;

    public A() {

        x = 10;
    }

    public void setX(int x) {

        this.x = x;
    }

    @Override
    public String toString() {
        return "A: x = " + x;
    }
}

class B extends A {
    protected int x;

    public B() {
        super();
        x = 20;
    }

    @Override
    public String toString() {
        return "B: x = " + x + ", super.x = " + super.x;
    }
}

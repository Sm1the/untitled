
class A{
    void f(B b){System.out.print("C");}
    void f(A a){System.out.print("A");}
}
class B extends A{
    void f(B b){System.out.print("B");}
}

public class MainClass {
    public static void main(String[] args) {
        A a = new B();
        B b = new B();
        a.f(b);
        b.f(b);
    }
}

package Study_SE.Outer_Inner;


public class Application {
    public static void main(String[] args) {

        Outer outer = new Outer();

        Outer.Inner inner = outer.new Inner();

        outer.run();
        inner.run();
        outer.out();
        inner.in();
        inner.getId();

    }
}

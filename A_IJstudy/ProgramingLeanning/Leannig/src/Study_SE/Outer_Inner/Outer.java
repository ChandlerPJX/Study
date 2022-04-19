package Study_SE.Outer_Inner;

public class Outer {

    private int id = 10;

    public void run() {
        System.out.println("out is  run");
    }

    public void out() {
        System.out.println("this is out");
    }

    class Inner {
        public void in() {
            System.out.println("this is in");
        }


        public void run() {
            System.out.println("in is run");

        }

        public void getId() {
            System.out.println(id);
        }
    }
}

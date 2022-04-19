package Study_SE.TestStuff;

import java.util.Scanner;

public class Box {
    //设计一个立方体类Box，定义三个属性，分别是长，宽，高。定义二个方法，分别计算并输出立方体的体积和表面积
    double length;
    double width;
    double height;
    public Box() {
        Scanner sc = new Scanner(System.in);
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        double d3 = sc.nextDouble();
        setBox(d1,d2,d3);
        sc.close();
    }
    public void setBox(double length, double width, double height) {
        this.height = height;
        this.length = length;
        this.width = width;
    }
    public double volume(Box box) {
        return box.length * box.width *box.height;
    }
    public double area(double length, double width, double height) {
        return 2 * (length * width + length * height + width * height);
    }
    public static void main(String[] args) {
        System.out.println("请输入长宽高");
        Box box = new Box();
        System.out.println("结果:"+box.volume(box));
    }

}

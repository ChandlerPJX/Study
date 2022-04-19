package Study_SE.TestStuff;

public class Complex {
    /*

    1.复数
复数概念如下：
每个复数都有实部和虚部。例如，3 + 5i，3 为实部，5i 为虚部。其中，i
称为虚数单位，有i*i = -1。
两个复数进行加法运算，运算时实部与实部相加，虚部与虚部相加。例如：
(1.5 – 3i) + (2.3 + 2.4i) =
(1.5+2.3) + (-3 + 2.4)i = 3.8 – 0.6i
两个复数进行减法运算，与加法运算类似。
两个复数进行乘法运算，其过程如下：
(a+bi) * (c + di) = ac + adi + bci + bd(i*i) = (ac-bd) + (ad+bc)i
例如：
（3+5i）*（4+6i）= （3*4-5*6）+（3*6+4*5）i = -18 + 38i
1.
写一个类Complex，用来表示复数。这个复数类具有两个属性：
double real， 表示实部；
double im，表示虚部。
2.
并为Complex 类增加add、sub、mul 方法，

分别表示复数的加法、减法和乘法运算。
其中，add 方法的声明如下：
public Study_SE.sdasd.Complex add(Study_SE.sdasd.Complex c)
//表示当前Complex 对象与参数c对象相加


public Study_SE.sdasd.Complex add(double real) //表示当前 Study_SE.sdasd.Complex 对象与实数 real 相
加

减法和乘法也各自写两个方法重载，并写main进行测试
*/


    double real; // 实
    double im; // 虚

    public Complex() {

    }

    //赋值
    public Complex(double real, double im) {
        this.real = real;
        this.im = im;
    }

    public Complex add(Complex c) {
        Complex ad = new Complex();
        ad.real = real + c.real;
        ad.im = im + c.im;
        return ad;
    }

    public Complex sub(Complex c) {
        Complex ad = new Complex();
        ad.real = real - c.real;
        ad.im = im - c.im;
        return ad;
    }

    // (a+bi) * (c + di) = ac + adi + bci + bd(i*i) = (ac-bd) + (ad+bc)i
    public Complex mul(Complex C) {
        Complex complex = new Complex();
        double a = real;
        double b = im;
        double c = C.real;
        double d = C.im;
        complex.real = (a * c) + (b * d) * -1;
        complex.im = a * d + b * c;
        return complex;
    }

/*
2 编写学员成绩管理类
保存三个班级的学生成绩，完成以下方法，并写main方法进行测试
A 录入所有班级的学生成绩
B 录入指定班级的学生成绩
C 计算指定班级的总分
D 计算所有班级的总分
E 计算指定班级的均分
F 计算所有班级的均分
     */


}

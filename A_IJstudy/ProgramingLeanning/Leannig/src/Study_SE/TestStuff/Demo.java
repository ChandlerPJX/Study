package Study_SE.TestStuff;

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

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Student demo = new Student();
        System.out.println("A 录入所有班级的学生成绩\n" +
                "B 录入指定班级的学生成绩\n" +
                "C 计算指定班级的总分\n" +
                "D 计算所有班级的总分\n" +
                "E 计算指定班级的均分\n" +
                "F 计算所有班级的均分\n");
        int[][] grade = new int[3][1000];
        while (true) {
            System.out.println("-------------------");
            Scanner scanner = new Scanner(System.in);
            String ch = scanner.nextLine();
            switch (ch) {
                case "A":
                    System.out.println("调用A");
                    demo.A(grade);
                    break;
                case "B":
                    System.out.println("指定的班级:");
                    int b = scanner.nextInt();
                    demo.B(b, grade);
                    scanner.nextLine();
                    break;
                case "C":
                    System.out.println("指定的班级:");
                    int c = scanner.nextInt();
                    demo.C(c, grade);
                    scanner.nextLine();
                    break;
                case "D":
                    demo.D();
                    break;
                case "E":
                    demo.E();
                    break;
                case "F":
                    demo.F();
                    break;
                default:
                    break;
            }
        }

    }

}

class Student {
    String name;
    double grade;

    //A 录入所有班级的学生成绩 存入二位数组(i,j)  i 班级 j 成绩
    public void A(int[][] nums) {
        for (int i = 0; i < 3; i++) {
            System.out.println("输入班级：" + (i + 1));
            System.out.println("输入班级人数:");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println("输入成绩:");
            for (int j = 0; j < num; j++) {
                nums[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }
    }

    //B 录入指定班级的学生成绩
    public void B(int classNo, int[][] nums) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入人数：");
        int len = sc.nextInt();
        System.out.println("输入成绩:");
        for (int i = 0; i < len; i++) {
            nums[classNo][i] = sc.nextInt();
        }
    }

    //C 计算指定班级的总分
    public void C(int classNo, int[][] nums) {
        System.out.println("调用C");
        int sum = 0;
        for (int i = 0; ;) {
            if (nums[classNo][i] > 0) {
                sum += nums[classNo][i];
                i++;
            }else break;
        }
        System.out.println(sum);
    }

    //D 计算所有班级的总分
    public void D() {
        System.out.println("调用D");
    }

    //E 计算指定班级的均分
    public void E() {
        System.out.println("调用E");

    }

    //F 计算所有班级的均分
    public void F() {

    }
}

package Study_SE.TestStuff;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomerBiz cb1 = new CustomerBiz();
        while (true) {
            System.out.println("请选择服务：");
            System.out.println("1.增加客户\n" +
                    "2.显示客户信息列表\n" +
                    "3.修改客户姓名\n" +
                    "\t输入0结束服务");
            System.out.println("请选择：");

            int num = sc.nextInt();
            sc.nextLine();
            switch (num) {
                case 0:
                    return;
                case 1:
                    Customer ct1 = new Customer();
                    System.out.print("请输入客户id：");
                    ct1.setId(sc.nextInt());
                    sc.nextLine();
                    System.out.print("请输入客户姓名：");
                    ct1.setName(sc.nextLine());
                    System.out.print("请输入客户积分：");
                    ct1.setScore(sc.nextInt());
                    cb1.addCustomer(ct1);
                    break;
                case 2:
//                    cb1.sortById();
                    cb1.showInfo();
                    break;
                case 3:
                    System.out.print("请输入即将修改的客户姓名：");
                    String name1 = sc.nextLine();
                    System.out.print("请输入新名字：");
                    String name2 = sc.nextLine();
                    cb1.updateCustomerName(name2,name1);
                    break;
                default:
                    System.out.println("请重新输入：");
                    break;
            }
        }
    }
}

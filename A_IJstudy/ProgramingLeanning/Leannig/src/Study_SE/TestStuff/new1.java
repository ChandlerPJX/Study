package Study_SE.TestStuff;

import java.util.Scanner;

public class new1 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Customer customer1 = new Customer(1, "liming", 30);
        Customer customer2 = new Customer(100, "w", 30);
        Customer customer3 = new Customer(12, "l", 40);
        Customer customer4 = new Customer(14, "z", 20);
        Customer customer5 = new Customer(6, "s", 10);
//        Scanner scanner = new Scanner(System.in);
        CustomerBiz cb1 = new CustomerBiz();
        cb1.addCustomer(customer1);
        cb1.addCustomer(customer2);
        cb1.addCustomer(customer3);
        cb1.addCustomer(customer4);
        cb1.addCustomer(customer5);
        String oldname = scanner.nextLine();
        String newname = scanner.nextLine();
        System.out.println(oldname + " " + newname);

        cb1.updateCustomerName(newname,oldname);
        cb1.showInfo();


        System.out.println("--------------------");
        cb1.sortById();
        cb1.showInfo();

    }
}

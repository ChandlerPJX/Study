package Study_SE.TestStuff;

public class CustomerBiz {

    Customer customers[] = new Customer[20];

    //增加客户
    public void addCustomer(Customer customer) {
        // 找到为空的位置
        if (customers[19] != null) {
            System.out.println("full");
        }
        int i = 0;
        while (i < 20) {
            if (customers[i] == null) {
                customers[i] = customer;
                break;
            }
            i++;
        }
    }

    //显示客户信息列表
    public void showInfo() {
        System.out.println("id\t\tName\t\tScore\t\t");
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                System.out.println(customers[i].getId() + "\t" + customers[i].getName() + "\t" + customers[i].getScore());
            }
        }
    }

    //修改客户姓名
    public void updateCustomerName(String newName, String oldName) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                String name = customers[i].getName();
                if (name.equals(oldName)) {
                    customers[i].setName(newName);
                    System.out.println("修改成功！");
                    break;
                }
            }
        }
    }
    //针对客户信息进行排序(根据编号做升序排列)
    public void sortById() {
        for (int i = 0; i < customers.length - 1; i++) {
            for (int j = 0; j < customers.length - 1 - i; j++) {
                if (customers[j] != null && customers[j + 1] != null) {
                    if (customers[j].getId() > customers[j + 1].getId()) {
                        Customer temp = new Customer();
                        temp = customers[j];
                        customers[j] = customers[j + 1];
                        customers[j + 1] = temp;
                    }
                }
            }
        }
    }


}

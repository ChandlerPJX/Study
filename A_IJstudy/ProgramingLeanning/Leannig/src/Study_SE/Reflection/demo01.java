package Study_SE.Reflection;


// 什么是反射
public class demo01 {


    public static void main(String[] args) throws ClassNotFoundException {

        Class c1 = Class.forName("Study_SE.Reflection.user");
        Class c2 = Class.forName("Study_SE.Reflection.user");
        Class c3 = Class.forName("Study_SE.Reflection.user");
        Class c4 = Class.forName("Study_SE.Reflection.user");

        //一个类在内存里只有一个class对象,他们的hashcode相同
        System.out.println(c1.hashCode() + "  " + c2.hashCode()
                + " " + c3.hashCode() + " " + c4.hashCode());

        System.out.println(c1);
    }

}

// 实体类
class user {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public user() {

    }

    public user(String name, int id) {
        name = this.name;
        id = this.id;
    }


}
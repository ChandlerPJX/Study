package Study_SE.Demo_inteface;


// 类实现接口， 使用implements
// 实现接口的类，要重写接口中的方法。
// 由接口实现多继承。
public class UserServiceImpl implements UserService, TimeService {
    @Override
    public void add(String name) {
        System.out.println("add : " + name);
    }

    @Override
    public void timer() {
        System.out.println("time is 00:00:00");

    }

    @Override
    public void delete(String name) {
        System.out.println("delete: " + name);
    }

    @Override
    public void update(String name) {

        System.out.println("update: " + name);
    }

    @Override
    public void query(String name) {
        System.out.println("query: " + name);
    }
}

package Study_SE.Demo_inteface;


public interface UserService {

    // 接口中的定义都是 public abstract
    //接口都要有实现类;
    void add(String name);

    void delete(String name);

    void update(String name);

    void query(String name);

}

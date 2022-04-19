package Study_SE.others;

public class Singleton {
/*
        双重校验下的单例模式(对象单例)
        过程如下：
                1.为 uniqueInstance 分配内存空间
                2.初始化 uniqueInstance
                3.将 uniqueInstance 指向分配的内存地址

        需要注意 uniqueInstance 采用 volatile 关键字修饰也是很有必要。(使用 volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行。)
        <-- synchronized 关键字解决的是多个线程之间访问资源的同步性，
        synchronized关键字可以保证被它修饰的方法或者代码块在任意时刻只能有一个线程执行。-->

    private volatile static Study_SE.Singleton uniqueInstance;

    private Study_SE.Singleton() {
    }

    public static Study_SE.Singleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (Study_SE.Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Study_SE.Singleton();
                }
            }
        }
        return uniqueInstance;
    }

 */


    //------------------------------------


    private static Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }

    private void ShowMessage(){
        System.out.println("easy singleton");
    }

    public static void main(String[] args) {
        Singleton object = Singleton.getInstance();
         object.ShowMessage();
    }

}

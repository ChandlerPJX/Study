package Study_SE.Exception_Demo;

public class Application {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        // 捕获多个异常， 要从小到大去写.
        try {

            if (b == 0){
                // 主动抛出异常，一般用在方法中.   throw throws
                throw  new Exception(); // 抛出异常
            }
            System.out.println(a / b);
            new Application().a();
        } catch (Exception e) {
            System.out.println("不能除以0");
        } catch (Error e) {
            System.out.println("循环调用错误");
        } finally {
            // try catch 必须要有，finally 可以不写。
            // finally 一般用于 I/O 用用于 close() 等 善后工作.
            System.out.println("无论如何，finally的代码都会执行。");
        }
    }

    public void a() {
        b();
    }

    private void b() {
        a();
    }
}

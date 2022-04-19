package Study_SE.Demo_inteface;

public class Application {
    public static void main(String[] args) {


        UserServiceImpl userService = new UserServiceImpl();
        userService.timer();
        userService.add("lili");
        userService.update("wangming");
        userService.delete("lili");
        userService.query("xixi");
    }
}

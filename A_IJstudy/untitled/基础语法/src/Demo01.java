package src;

public class Demo01 {
    public static void main(String[] args) {
        //所有表示富符以字母或者$与_开头 其他的均不可
        String Aname = "lili";
        String aname = "Lolo";

        // 8大类型
        int a = 10;             // int 4字节（32位）
        float b = 10.1f;        // float 4字节（32）    必须要一个F
        Long c = 12321312L;     // long 8字节（64）     Long要加一个L
        short d = 10;           //short 2字节 （16位）
        double e = 10.21312123123213124123123123;   // double 8字节（64位）
        char f = 'a';           // char 字节()只能包含一个字符，类似于 char name = 'ab' 就会报错
        boolean g = true;       // boolean 占1位只能赋值 true or false
        byte h = 10;            // byte 1字节（8位）


    }
}

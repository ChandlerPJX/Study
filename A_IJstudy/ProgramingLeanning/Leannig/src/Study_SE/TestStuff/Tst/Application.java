package Study_SE.Tst;

public class Application {
    public static void main(String[] args) {
        T t = new T();
        T t1 = new T_T1();
        T t2 = new T_T2();
        T_T1 t_t1 = new T_T1();
        T_T2 t_t2 = new T_T2();
        T_T1_T1 t_t1_t1 = new T_T1_T1();
        T_T2_T1 t_t2_t1 = new T_T2_T1();
        System.out.println(t instanceof T);
        System.out.println(t1 instanceof T);
        System.out.println(t_t1 instanceof T);
        System.out.println(t_t1_t1 instanceof T);
        System.out.println(t_t2 instanceof T);
        System.out.println(t_t2_t1 instanceof T);

        System.out.println("====================");
        System.out.println(t instanceof T_T1);
        System.out.println(t_t1_t1 instanceof T_T1);
        System.out.println(t_t1 instanceof T_T1);

    }

}

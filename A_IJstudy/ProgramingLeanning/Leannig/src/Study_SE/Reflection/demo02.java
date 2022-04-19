package Study_SE.Reflection;


// class类的 创建方式
public class demo02 {

    public static void main(String[] args) throws ClassNotFoundException {

        Person person = new Student();
        System.out.println("this is :" + person.name);

        // 1 通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        //2 通过forName获得
        Class c2 = Class.forName("Study_SE.Reflection.Student");
        System.out.println(c2.hashCode());

        //3 类名.class
        Class c3 = Student.class;
        System.out.println(c3.hashCode());
        
    }


}

class Person {
    String name;

    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person {
    public Student() {
        this.name = "student";
    }
}

class Teacher extends Person {
    public Teacher() {
        this.name = "teacher";
    }
}

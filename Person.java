public class Person {
    public static void main(String[] args) {
        Student mg = new Student();
        mg.name = "mg mg";
        mg.age = 20;

        Student ag = new Student();
        ag.name = "ag ag";
        ag.age = 13;

        mg.greet();
        ag.greet();
    }
}

class Student {
    String name;
    int age;

    void greet() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);

    }
}
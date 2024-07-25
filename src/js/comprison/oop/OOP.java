package js.comprison.oop;

public class OOP {
    public static void main(String[] args) {
//        new Employee();
//        new Manager();
        System.out.println(new Manager("Maxim"));
    }
}

class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
        System.out.println("Создался Employee");
    }

//    public Employee() {
//    }
}

class Manager extends Employee {
//    public Manager() {
//        super();
//    }

    public Manager(String name) {
        super(name);
        System.out.println("Создался Manager");
    }


    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                '}';
    }
}

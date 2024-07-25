package js.comprison.oop;

public class Interfaces {
    public static void main(String[] args) {
        new E().read();
    }
}

interface A {
    default void read() {
        System.out.println('A');
    }
}

interface B {
    default void read() {
        System.out.println('B');
    }
}

class C implements A, B {

    // Класс обязан реализовать, неоднозначная ситуация
    @Override
    public void read() {
        B.super.read();
    }
}

interface D extends B {
    @Override
    default void read() {
        System.out.println("D");
    }
}

class E implements D {

}

package js.comprison.basics;

class A implements Cloneable {
    public A() {
    }

    @Override
    public A clone() {
        return new A();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    void doNothing() {

    }
}

class B extends A {
    @Override
    public A clone() {
        return super.clone();
    }

    @Override
    public void doNothing() {
        super.doNothing();
    }
}

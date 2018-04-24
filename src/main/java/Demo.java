public class Demo {

    public void execute(){
        A.execute();

        A a = new A();
        a.bar();
        IFoo iFoo = new B();
        iFoo.bar();
    }

}


class A {
    public static int execute(){
        return 1+2;
    }

    public int bar(){
        return 1+2;
    }
}

class B implements IFoo {

    @Override
    public int bar() {
        return 1+2;
    }
}


interface IFoo {
     int bar();
}


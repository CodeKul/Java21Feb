package abstraction.abstractdemo;

public abstract class AbsSport {

    protected abstract void show();//method declared //incomplete method

    private void display(){

    }
    public void gym(){ //concrete method //defined method

        System.out.println("in Gym");
    }
}

/**
 *         abstract                                                                 interface
 *
 * 1.abstract keyword is used to declared abstract class                    1. interface
 *
 * 2.you can declared private,protected,public,default methods              2.only public
 *
 * 3.declared and concrete methods are allowed                              3.only declared
 *
 * 4. partially abstraction                                                 4.100% abstraction
 *
 *
 */
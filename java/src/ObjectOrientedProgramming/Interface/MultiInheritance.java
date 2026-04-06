package ObjectOrientedProgramming.Interface;

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends

interface Z{

    void show();
    void config();
}

interface X
{
    void run();
}
interface Y extends X
{

}

class C implements Z,Y
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in cofing");
    }
    public void run()
    {
        System.out.println("running...");
    }
}

public class MultiInheritance {
    public static void main(String[] args) {

         Z obj;
        obj=new C();

        obj.show();
        obj.config();

        X obj1=new C();
        obj1.run();

        

    }
}

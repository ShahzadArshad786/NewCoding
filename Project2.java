

interface Parent 
{

    // Bydefault public and abstract method 
     void show();

    // Bydefault public, static, and final 
    int x = 10 ;

    
    public static void fun1()
    {
        System.out.println(x);
    }

    public default void fun2()
    {
        fun3();

    }

     private void fun3()
    {
        System.out.println("Private Method");
    }

}

class Child implements Parent{

    public void show()
    {
        System.out.println("Implement Abstract Method");
    }

}

public class Project2 {
    
    public static void main(String[] args) {
        
        Child obj = new Child();

        obj.show();
        obj.fun2();
        
    }
}

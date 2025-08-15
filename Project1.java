

class Demo extends Thread
{
    public void run()
    {
        try
        {
            for (int i = 1 ; i <=5 ; i++)
            {
                System.out.println("Child Thread");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ex)
        {

        }
    }
}

public class Project1 {
    public static void main(String[] args) throws InterruptedException
    
    {
        Demo obj = new Demo();
        obj.start();

        for(int i = 1 ; i <= 5 ; i++)
        {
            System.out.println("Main Thread");
            Thread.sleep(1000);
        }
    }
}

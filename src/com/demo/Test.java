package com.demo;
class Sleep extends Thread
{
    @Override
    public void run()
    {

        for(int i=1; i<=10; i++)
        {
            System.out.println("i value is :"+i);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.err.println("Thread interrupted "+e);
            }
        }
    }

}
public class Test
{
    public static void main(String[] args)
    {
        Sleep s = new Sleep();
        s.start();

    }
}
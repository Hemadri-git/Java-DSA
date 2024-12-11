package com.demo;

class A extends Thread{
   public void run(){
       String name = Thread.currentThread().getName();
       System.out.println(name);
   }
}
class B extends Thread{
    public void run(){
        String name = Thread.currentThread().getName();
        System.out.println(name);
    }
}
public class Test
{
    public static void main(String[] args) throws Exception
    {


        A a = new A();
        B b = new B();

        a.start();
        b.start();

        String name = Thread.currentThread().getName();
        System.out.println(name);

    }

}
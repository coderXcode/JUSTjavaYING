/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */import java.lang.*;
class a11 extends Thread
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {

            System.out.println(Thread.currentThread().getPriority());
        }System.out.println();
    }
}
class b111 extends Thread
{
    public void run()
    {
        for(int j=0;j<5;j++)
        {
            System.out.println("thread 2");
        }
    }
}
class c1 extends Thread
{
    public void run()
    {
        for(int j=0;j<5;j++)
        {
            System.out.println("thread 3");
        }
    }
}
public class multithread
{
    public static void main(String args[])
    {


    a11 obj=new a11();
    b111 obj1=new b111();
    c obj2=new c();
    obj.start();
    obj2.setPriority(Thread.MAX_PRIORITY);
    obj2.start();
    obj1.start();

}
}
 
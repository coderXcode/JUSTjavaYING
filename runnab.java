/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */
class a implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("thread 1");
        }System.out.println();
    }
}
class b implements Runnable
 {
    public void run()
    {
        for(int j=0;j<5;j++)
        {
            System.out.println("thread 2");
        }
    }
}

public class runnab
{
    public static void main(String args[])
    {
    a obj=new a();
 b obj1=new b();
 Thread obj4=new Thread(obj1);
 obj4.start();
    Thread obj3=new Thread(obj);
     obj3.start();
    }
}

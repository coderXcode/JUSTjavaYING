/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */ 
class print
{
    void printing(String name)
    {
        System.out.print("["+name);
        Thread.yield();
        System.out.println(" ]");
    }
 }
class MyThread implements Runnable
{
    String name;
    print target;
    MyThread(print t)
    {
        target=t;
    }
    public void run()
    {
        name=Thread.currentThread().getName();
        target.printing(name);
    }
}
public class yield {
public static void main(String args[])
        {
    print t=new print();
 for(int i=0;i<5;i++)
   
    new Thread(new MyThread(t)).start();
    
    }

}



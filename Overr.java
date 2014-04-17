/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */
class over
{
    int i,j;
    over(int a,int b)
    {
        i=a;
        j=b;
    }
  
    void disp()
    {
        System.out.println(i*j);
    }
}
class overr1 extends over
{
    int z;
 overr1(int a,int b,int c)
    {
     super(a,b);
      z=c;
    }
 void disp()
    {
     System.out.println(z);
   }
}
 public class Overr {
public static void main(String args[])
     {
    over obj=new overr1(10,20,30);//calling thru main class object
    obj.disp();
}
}

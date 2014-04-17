/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */
class a1
{
  int x, y;
  a1(int m,int n)
    {
     x=m;
     y=n;
    }
     void disp()
    {
     System.out.println(x*y);
    }
 }
 interface b1
 {
     int con=54;
     void compute(int f,int g);
     void compute2(int k,int l);
 }
 class c extends a1 implements b1
 {
     c(int m,int n)
     {
         super(m,n);
     }
 public void compute(int x,int y)
     {
      System.out.println("inside compute"+(x*y));
     }
   public void compute2(int k,int l)//all methods within interface must be in sub class
     {
         System.out.println("inside compute2"+(con*(k/2*l)));
     }
 }
public class interfMUlti {
public static void main(String args[])
    {
    c obj1=new c(1,2);
    obj1.compute(20,34);
  obj1.compute2(24,30);
    }

}


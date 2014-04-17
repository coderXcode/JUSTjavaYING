/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */class Box
{
     double width;
     double height;
     double depth;
     Box(double w,double h,double d)
    {width=w;
     height=h;
     depth=d;
    }
     public String toString()
    {
         return "dimensions are"+width+"by"+depth+"by"+height+".";
     }

 }
public class toStringDemo {
    public static void main(String args[])
    {
        Box b=new Box(10,12,14);
        String S="Box b:"+b;
        System.out.println(b);
        System.out.println(S);
    }

}

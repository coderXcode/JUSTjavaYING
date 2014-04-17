/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */class overl

{ int r,h,l;
     overl()
    {
     r=0;
     h=0;
     l=0;
 }
  public static void area(int x)
    {System.out.println("area="+(3.14*x*x));
  }
  public static void area(int x,int y )
    {
      System.out.println("volume"+(3.14*x*x*y));
  }
  public static int area(int x,int y,int z)
    { int h=x*y*z;
      return h;
   }
}
public class funcOverload {
    public static void main(String args[])
    { overl obj=new overl();
     obj.area(2,3);
     obj.area(2);
     int c=obj.area(2,3,4);
     System.out.println(c);


    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */
abstract class l
{
    double dim1,dim2;
    l(int x,int y)
    {
        dim1=x;
        dim2=y;
    }
    abstract double area();
}
class rec extends l
{
    rec(int x,int y)
    {
        super(x,y);
    }
    double area()
    {
        return (dim1*dim2);
    }
}
class trin extends l
{
    trin (int x,int y)
    {
        super(x,y);
    }  
    double area()
    {
        return (dim1/2*dim2);
    }
}
 public class abstrct {
     public static void main(String args[])
     {
       //  a obj=new a(); cannot be made as abstract

rec obj1=new rec(10,20);
trin obj2=new trin(20,30);
l ref;
ref=obj1;
ref=obj2;
System.out.println(obj1.area());

System.out.println(obj2.area());
     }
     }





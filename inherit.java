/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */
class r//super
{
    int l,b;
    r(int x,int y)
    {
        l=x;
        b=y;
    }
    int disp()
    {
     return(l*b);
    }
}
class s extends r //sub
{
    int c;
    s(int x, int y,int z)
    {
        super(x,y);
        c=z;
    }
    int disp1()
    {
        return (c*c*c);
    }

    }


public class inherit {
public static void main(String args[])
    { s obj=new s(10,20,30);
    System.out.println(+obj.disp());
     System.out.println(+obj.disp1());
}

}

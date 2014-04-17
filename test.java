/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */
class abc{
    int l,b;
    abc(int x,int b)
    {
        l=x;
         this.b=b;
    }
    abc(int x)
    {
        l=b=x;
    }
    int disp()
    {
        return(l*b);
    }
}
public class test {
    public static void main(String args[])
    {
        abc obj=new abc(10,20);
        System.out.println(+obj.disp());
        abc obj1=new abc(10);
        System.out.println(+obj1.disp());
    }

}

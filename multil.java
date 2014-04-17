/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @author g1.test1
 **/
class figure
{
    int l, b;
    figure(int x,int y)
    {
       l=x;
       b=y;

    }
}
 class rect extends figure
{

    rect(int x,int y)
    {
        super(x,y);

    }
    int disp()
    {
        return (l*b);
    }
}
 class tri extends rect
 {

     tri(int x,int y)
     {
         super(x,y);
     }
     int disp()
     {
         return (l*(b/2));
     }

 }
public class multil {
    public static void main(String args[])
    {tri obj=new tri(4,5);
     System.out.println(obj.disp());
     rect obj2=new rect(3,4);
     System.out.println(obj2.disp());
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 *
 * @author g1.test1
 **/
class figure1
{
    int l, b;
    figure1(int x,int y)
    {
       l=x;
       b=y;
 System.out.println("inside super"+l+b);
    }
}
 class rect1 extends figure1
{
    
    rect1(int x,int y)
    {
        super(x,y);//don't need to give instance var coz super makes variables x &y
        
    }
    int disp()
    {
        System.out.println("inside rect");
        return (l*b);

    }
}
 class trin1 extends figure1
 {
     int c;
   
     trin1(int x,int y,int z)
     {
        super(x,y);
        c=z;
        System.out.println("inside tri construct");
     }
     int disp()
     {
         System.out.println("inside tri");
         return (l*(b/2));
     }
     
 }
public class hierar {

    public static void main(String args[])
    {
     tri obj=new tri(4,5,6);
     System.out.println(obj.disp());
     rect obj2=new rect(3,4);
     System.out.println(obj2.disp());
    }

}

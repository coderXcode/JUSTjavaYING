/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */
public class except3 extends Exception
        {except3(String msg)
    {
             super(msg);
         }

 }
class Test
{
    public static void main(String args[])
    {int x=5,y=1000;
        float z=(float)x/(float)y;
        
        try
        {
            
            if(z<0.01)
            {
                throw new except3("number is too small");
            }

        }
        catch(except3 e)
        {String m=e.getMessage();
            System.out.println(m);
        }
    }
}

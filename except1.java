/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */
public class except1 {
    public static void main(String args[])
    {
        int a=10;
        int b=5;
        int c=5;
        int x,y;
        try{

        x=a/(b-c);
        y=a/(b-c);
         System.out.println(x);
        }
        catch(ArithmeticException e)
        {
            System.out.println("division by zero");
         }
      
        
        
    }

}

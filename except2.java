/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */
import java.io.*;
public class except2 {
    public static void main(String args[])throws Exception
    {
        BufferedReader i=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input two numbers");

      try{
         int a=Integer.parseInt(i.readLine());
          int b=Integer.parseInt(i.readLine());
      }
      catch(NumberFormatException d)
              {
          System.out.println("no characters");
      }

}
}

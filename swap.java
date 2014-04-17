/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */
import java.io.*;
public class swap {
    public static void main(String args[])throws Exception
    {
        BufferedReader i=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter two numbers");
        int a=Integer.parseInt(i.readLine());
         int b=Integer.parseInt(i.readLine());
         System.out.println("before swap");
         System.out.println(a+" "+b);
          b=b-a;
          a=a+b;
          b=a-b;
          System.out.println("after swap");
          System.out.println(a+" "+b);
    }

}

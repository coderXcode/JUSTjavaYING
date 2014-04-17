/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */
import java.io.*;
public class leapYear {
    public static void main(String args[])throws Exception
    {BufferedReader i=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter the year");
     double m=Integer.parseInt(i.readLine());
     if((m%4)==0)
         System.out.println("it is a leap year");
     else
         System.out.println("not a leap year");
}
}

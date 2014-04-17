/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */
import java.io.*;
public class calculator {
public static void main(String args[])throws Exception
    {
    BufferedReader i=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the two integers");
    int a=Integer.parseInt(i.readLine());
    int b=Integer.parseInt(i.readLine());
    System.out.println("1 for add \n 2 for subtract \n 3 for mult \n 4 for divide");
    int c=Integer.parseInt(i.readLine());
   // int d=0;
    switch(c)
    {
        case 1:
        {
            System.out.println(+(a+b));
         break;
        }
        case 2:
        {//d=a-b;
         break;
        }
        case 3:
        {//d=a*b;
         break;
        }
        case 4:
        {//d=a/b;
        }
        //System.out.println("result="+d);

        }
   }
}

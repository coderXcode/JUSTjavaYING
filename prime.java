/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */
import java.io.*;
public class prime {
    public static void main(String args[])throws Exception
    {BufferedReader i=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("enter the number");
     int a=Integer.parseInt(i.readLine());
     int m=a;
     int c=0;
     for(int j=1;j<=a;j++)
     {if(m%j==0)
          c=c+1;

     }
     if(c==2)
     {System.out.println(m+" is "+"a prime number");
    }
 else
     System.out.println(m+" is "+"not a prime number");
    }
}

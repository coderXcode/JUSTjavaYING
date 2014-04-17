/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */import java.io.*;
public class swapp {
    public static void main(String args[])throws Exception
    {
        BufferedReader i=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the two numbers");
        int a=Integer.parseInt(i.readLine());
        int b=Integer.parseInt(i.readLine());
        System.out.println("before swap"+a+" "+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swap"+a+" "+b);
        
    }

}

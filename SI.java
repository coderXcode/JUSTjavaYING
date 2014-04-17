/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */
import java.io.*;
public class SI {
    public static void main(String args[])throws Exception
    {
        BufferedReader i=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of people");
        int n=Integer.parseInt(i.readLine());
        double s=0;
        int m=1;
        do
        { 
            System.out.println("enter the value of p,r,t");
            double p=Integer.parseInt(i.readLine());
            double r=Integer.parseInt(i.readLine());
            double t=Integer.parseInt(i.readLine());
            s=(p*r*t)/100;
            System.out.println("Simple interest is"+s);
             m++;
        }while(m<=n);

    }


}

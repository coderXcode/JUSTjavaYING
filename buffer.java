/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */import java.io.*;
 import java.lang.*;
public class buffer {
    public static void main(String args[])throws Exception
    {BufferedReader i=new BufferedReader(new InputStreamReader(System.in));
     String s="";
       // try{
         System.out.println("enter String");
          s=i.readLine();
       StringBuffer a=new StringBuffer();
     a.append(s);
     System.out.println(a);
   a.append("hello");
    System.out.println(a);

    a.insert(5, "wo");
    System.out.println(a);
    System.out.println(a.charAt(4));
    a.setCharAt(5,'T');
    System.out.println(a);
    a.deleteCharAt(6);
    System.out.println(a);
     System.out.println(a.reverse());
      System.out.println(a.length());
       System.out.println(a.capacity());
        System.out.println("value of a after reverse"+a);
         System.out.println("substring "+ a.substring(2, 4));
          System.out.println("value of a after substring"+a);
}



}


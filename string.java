/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */
public class string {
    public static void main(String args[])
    {
        String s="Hello World";
        char a='l';
        char b='o';
        String str=new String("Hello");
        System.out.println("length of str="+str.length());
        System.out.println("character at 3rd position="+str.charAt(4));
        char buf[]=new char[b-a];
        s.getChars(2, 4, buf, 0);
        System.out.println(buf);
        char c[]=s.toCharArray();
        System.out.println("equals"+s.equals(str));
        System.out.println("equal ignore case"+s.equalsIgnoreCase(str));
        System.out.println("region matches"+s.regionMatches(true, 0, str, 0, 5));//check
        System.out.println("=="+(s==str));
        System.out.println("startwith"+s.startsWith(str, 0));
        System.out.println("index of llo"+s.indexOf("llo"));
        System.out.println("last index of l"+s.lastIndexOf('l'));
        System.out.println("substring from 3 to 8"+s.substring(3, 8));
        System.out.println("concat"+s.concat(str));
        System.out.println("replace"+s.replace('o', 'm'));
        System.out.println("trim"+s.trim());
        System.out.println("copyvalue of"+s.copyValueOf(buf));
        System.out.println("compareTo"+s.compareToIgnoreCase(str));
    }


}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */
public class nestedTry {
public static void main(String args[])
    {
    int arr[]={1,5};
    char arr2[]={'x'};
    try{
        System.out.println("in outer try");
        try
        {
            System.out.println("in inner try");
            arr[5]=4;
        }
        finally{
            System.out.println("in inner finally");
        }
    }
    catch(ArrayIndexOutOfBoundsException a)
    {
        System.out.println("range out of bounds");
    }
    finally{
        System.out.println("inside outer finally");
    }
}
}

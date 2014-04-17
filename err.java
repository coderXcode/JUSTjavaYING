/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */
public class err {
public static void main(String args[])
    {
    int arr[]={1,5};
    char arr2[]={'x'};
      System.out.println("in outer try");
        try
        {
            System.out.println("in inner try");
            System.out.println(arr2[0]);
            arr[5]=4;
            
        }


    catch(ArrayIndexOutOfBoundsException a)
    {
        System.out.println("range out of bounds");
    }

}
}

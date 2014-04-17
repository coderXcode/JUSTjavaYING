/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */
public class factoriaRecur {
    int fact(int i)
    {
      int m=1;
      if(i>1)
     m=i*fact(i-1);
     return m;
    }
public void main(String args[])
    {
    int m=fact(5);
    System.out.println("factorial is="+m);
    

}
}

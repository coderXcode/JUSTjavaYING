/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author g1.test1
 */
class students
{
     int rollNo;
     void set(int n)
    {
         rollNo=n;
     }
     void putNo()
    {
         System.out.println("roll no="+rollNo);
     }
 }
 class test extends students
 {
     float part1,part2;
     void getMarks(float m1,float m2)
     {
         part1=m1;
         part2=m2;
     }
     void putMarks()
     {
         System.out.println("marks obtained");
         System.out.println(part1);
         System.out.println(part2);
     }
}
 interface sport
 {
     float sport_wt=6.0f;
     void putwt();
  }
 class result extends test implements sport
 {
     float total;
     public void putwt()
     {
         System.out.println("sport wt="+sport_wt);
     }
  void display()
     {
      total=part1+part2+sport_wt;
      putNo();
      putMarks();
      putwt();
      System.out.println("total score"+total);
  }

 }


public class sports {
    public static void main(String args[])
    {
       result stud1=new result();
        stud1.set(23);
        stud1.getMarks(47.5f,93.0f);
        stud1.display();
    }

}

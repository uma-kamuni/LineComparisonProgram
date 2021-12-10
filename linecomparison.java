import java.util.Scanner;

import static java.lang.Math.sqrt;

public class LineComparison {
   public static void main (String[] args)
   {
     Scanner sc = new Scanner(System.in);
     System.out.print("enter coordinates of x1: ");  //x axis coordinates of line1
     int x1= sc.nextInt();
    System.out.print("enter coordinates of x2: ");  //x axis coordinates of line1
     int x2= sc.nextInt();
    System.out.print("enter coordinates of y1: ");  //y axis coordinates of line1
     int y1= sc.nextInt();
    System.out.print("enter coordinates of y2: ");  //y axis coordinates of line1
     int y2= sc.nextInt();
    double length1= Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
    System.out.print("total length is :"+length1);

}
}

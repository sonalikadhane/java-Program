//write a program to find perimeter of rectangle
import java.util.*;
public class Perimeter
{
    public static void main(String args[])
    {
        int perimeter,length,breadth;
        Scanner sc=new Scanner(System.in);//to accept the user input
        System.out.println("Enter the length of rectangle ");
        length=sc.nextInt();

        System.out.println("Enter the breadth of rectangle");
        breadth=sc.nextInt();
        //to calculate perimeter
        perimeter=2*(length+breadth);
        System.out.println("Perimeter of rectangle is : "+ perimeter);
    }
}
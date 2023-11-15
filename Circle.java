//write a program to accept a number 
import java.util.*;
public class Circle
{
    public static void main(String args[])
    {
        double radius,area,circumference;
        Scanner sc=new Scanner(System.in);//to accept the user input
        System.out.println("Enter the radius");
        radius=sc.nextInt();
        //to calculate area of circle
        area=Math.PI*(radius*radius);
        System.out.println("the area of circle is:"+area);
        //to calculate circumference
        circumference=Math.PI*2*radius;
        System.out.println("the circumference of circle is:"+circumference);

    }
}
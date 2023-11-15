//write a program for if statement
import java.util.*;
public class IfStatement
{
    public static void main(String args[])
  {  
    int num;
    Scanner sc=new Scanner(System.in);//to accept the user input
    System.out.println("Enter the number:");
    num=sc.nextInt();
    if(num<20)
    {
        System.out.println("number is less than 20");
    }
  }
}
import java.util.*;
public class IfElseStatement
{
    public static void main(String args[])
  {  
    int num;
    Scanner sc=new Scanner(System.in);//to accept the user input
    System.out.println("Enter the number:");
    num=sc.nextInt();
    if(num%2==0)
    {
        System.out.println("number is even");
    }
    else
    {
      System.out.println("number is odd");
    }
  }
}
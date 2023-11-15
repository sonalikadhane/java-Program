//write a program for Assignment operator
import java.util.Scanner;
class Assignment
{
  public static void main(String args[])
  {  
    int num1;
    int value;
    Scanner sc=new Scanner(System.in);//to accept the user input
    System.out.println("Enter the number:");
    num1=sc.nextInt();
    value=sc.nextInt();
    System.out.println("value using=:"+value);

    value +=num1;
    System.out.println("value using+=:"+value);

    value *=num1;
    System.out.println("value using*=:"+value);
  }
}

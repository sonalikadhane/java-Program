//write a program for Arithmatic operator
import java.util.Scanner;

class Arithmatic
{
  public static void main(String args[])
  {
    int num1;
    int num2;
    Scanner sc=new Scanner(System.in);//to accept the user input
    System.out.println("Enter two number:");

    num1=sc.nextInt();
    num2=sc.nextInt();
    //addition
    System.out.println("addition for two number:"+(num1+num2));
    //substraction
    System.out.println("substraction for two number:"+(num1-num2));
    //multiplication
    System.out.println("multiplication for two number:"+(num1*num2));
    //divistion
    System.out.println("division for two number:"+(num1/num2));
    //modules
    System.out.println("mod for two number:"+(num1%num2));
  }
}
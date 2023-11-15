// write a program for comparision opeartor
import java.util.Scanner;

class Compare{
public static void main(String args[]){
int num1;
int num2;
Scanner sc=new Scanner(System.in);//to accept the user input
System.out.println("Enter two number:");
num1=sc.nextInt();
num2=sc.nextInt();
System.out.println("number is greater than number two:"+(num1>num2));

System.out.println("number is less than number two:"+(num1<num2));

System.out.println("number is greater than equal to number two:"+(num1>=num2));

System.out.println("number is less than equal to number two:"+(num1<=num2));
}
}
import java.util.Scanner;

class Logical{
public static void main(String args[]){
int num1;
int num2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two number:");
num1=sc.nextInt();
num2=sc.nextInt();
System.out.println((num1>num2)&&(num2>num1));

System.out.println((num1>num2)||(num2>num1));

System.out.println(!(num1>num2)&&(num2>num1));
}
}
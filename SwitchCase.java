//wite a program for switch case
import java.util.*;
public class SwitchCase
{
    public static void main(String args[])
  {  
   
     int count=1,choice;
     Scanner sc=new Scanner(System.in);//to accept the user input
     System.out.println("Enter the choice:\n1) Addition\n2)Substaction\n3) multiplication\n4)division");
     choice=sc.nextInt();
     switch(choice)
      {
         case 1:
            System.out.println("Addition of numbers:");
         break;
         case 2:
            System.out.println("Substraction of numbers:");
         break;
         case 3:
            System.out.println("multiplication of numbers:");
         break;
         case 4:
            System.out.println("Division of numbers:");
         break;
         default:
            System.out.println("Enter valid case only:");
         break;
      }
  }
}
import java.util.Scanner;
public class LabExer1B{
public static void main (String [] args){
Scanner sc = new Scanner (System.in);
System.out.println("Enter numbah");
int var =sc.nextInt();
int  a = var + 10;
int  b = var + 100; 
int  c = var + 1000;
System.out.println(var + " plus 10 is "+a);
System.out.println(var + " plus 100 is "+b);
System.out.println(var + " plus 1000 is "+c);
}
}
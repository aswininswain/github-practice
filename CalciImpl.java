import java.util.Scanner;
 interface Calci
{
 int getSum(int n1,int n2);
}
 public class CalciImpl implements Calci
{
public int getSum(int n1,int n2)
{
return n1+n2;
}
}
 class CalciDriver
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter 2 number to find sum");
int n1 = s.nextInt();
int n2 = s.nextInt();
CalciImpl c = new CalciImpl();
int sum = c.getSum(n1,n2);
System.out.println(n1+"+"+n2+"="+sum);
}
}
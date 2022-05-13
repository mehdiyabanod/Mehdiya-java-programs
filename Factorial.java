package p1;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		int i,num,factorial=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		num=sc.nextInt();
		i=num;
		while(i>1)
		{
			factorial=factorial*i;
			i=i-1;
			
		}
		System.out.println("factorial is="+factorial);
		}

}

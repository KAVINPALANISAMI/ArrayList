package project1;

import java.util.Arrays;
import java.util.Scanner;
class pro{
	final static int startvalue=2;
	int a[]=new int[startvalue],count=0,n=startvalue;
	void add(int data)
	{
		if(n==count)
			increment();
		a[count++]=data;
	}
	void increment()
	{
		a=Arrays.copyOf(a, n*2);
		n=n*2;
	}
	void show()
	{
		for(int i=0;i<count;i++)
			System.out.print(a[i]+" ");
	}
	
}

public class ArrayList {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		pro ob=new pro();
		int n=sc.nextInt();
		ob.add(n);
		n=sc.nextInt();
		ob.add(n);
		ob.add(n);
		ob.add(n);
		ob.add(n);
		ob.show();
	
}

}

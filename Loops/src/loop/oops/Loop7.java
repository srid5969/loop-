package loop.oops;

import java.util.Scanner;

//to find factorial of given number
public class Loop7 {
public static void main(String[] args) {
	int count=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number to find factorial number"+"\n");
	int num = sc.nextInt();
	for(int i=1;i<=num;i++) {
		System.out.println(i);
		count*=i;
	}
	System.out.println("\n"+count);
}
}

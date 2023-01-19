package JavaProgramForSelenium;

import java.util.Scanner;

public class Exceptionmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
if (a<=0) {
	System.out.println("java.lang.Exception: Breadth and height must be positive");
}
else {
	System.out.println(a);
}

	}

}

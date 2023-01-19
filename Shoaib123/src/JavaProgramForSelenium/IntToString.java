package JavaProgramForSelenium;

import java.util.Scanner;

public class IntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
String b="";
b=Integer.toString(a);
if (a==Integer.parseInt(b)) {
	System.out.println("Good job");
}
	}

}

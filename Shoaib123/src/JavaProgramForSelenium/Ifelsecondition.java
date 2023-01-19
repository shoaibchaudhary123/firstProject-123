package JavaProgramForSelenium;

import java.util.Scanner;

public class Ifelsecondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


try {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	String b="";
	if (a%2==1) {
		b="Weird";
	}
	else {
		if(a>=2 && a<=5) {
			b="Not Weird";
		}
		else if (a>=6 && a<=20) {
			b="Weird";
		}
		else if (a>=20) {
			b="Not Weird";
		}
	}
	System.out.println(b);
	
} catch (Exception e) {
	// TODO: handle exception
	System.out.println("Please input integer value");
}
	}

}

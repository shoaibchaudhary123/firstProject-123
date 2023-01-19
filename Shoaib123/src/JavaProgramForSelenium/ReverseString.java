package JavaProgramForSelenium;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
if (s.equalsIgnoreCase(new StringBuffer(s).reverse().toString())) {
	System.out.println("Yes");
}
else {
	System.out.println("No");
}
	}

}

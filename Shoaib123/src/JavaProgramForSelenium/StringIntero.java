package JavaProgramForSelenium;

import java.util.Scanner;

public class StringIntero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
String b=sc.nextLine();

String c=a.concat(b);
System.out.println(c.length());
if (b.length()<a.length()) {
	System.out.println("No");
}
else {
	System.out.println("Yes");
}
System.out.println("Hello" + "Java");
//System.out.println(a);
//System.out.println(b);
	}

}

package String;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StringuseofSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
//		String a[]=s.trim().split("[ !,?._'@]+");
//		ArrayList<String>listofstring=new ArrayList<String>(Arrays.asList(a));
//		System.out.println(listofstring.size());
//		for (String string : listofstring) {
//			System.out.println(string);
		String a[]=s.trim().split("[ !,?._'@]+");
		ArrayList<String>listofstring=new ArrayList<String>(Arrays.asList(a));
		System.out.println(listofstring.size());
		for (String string : listofstring) {
			System.out.println(string);
		}
//		}
	}

}

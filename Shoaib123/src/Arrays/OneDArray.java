package Arrays;

import java.util.Iterator;
import java.util.Scanner;

public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b[]=new int[a];
		for (int i = 0; i <a; i++) {
			b[i]=sc.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}

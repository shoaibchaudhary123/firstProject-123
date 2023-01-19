package JavaPractice;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
//		for (int i = 0; i <t; i++) {
//			int x=sc.nextInt();
//			int y=sc.nextInt();
//			if (x>=y) {
//				System.out.println(x);
//			}else {
//				System.out.println(y);
//			}
//		}
//		for (int i = 0; i <t; i++) {
//			int a=sc.nextInt();
//			int b=sc.nextInt();
//			if (a>=b) {
//				System.out.println("Yes");
//			}else {
//				System.out.println("No");
//			}
//		}
		for (int i = 0; i < t; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			if (a>b) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
		}

	}

}

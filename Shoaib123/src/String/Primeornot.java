package String;

import java.math.BigInteger;
import java.util.Scanner;

public class Primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
BigInteger a=sc.nextBigInteger();
if (a.isProbablePrime(1)) {
	System.out.println("Prime");
}else {
	System.out.println("Not Prime");
}
	}

}

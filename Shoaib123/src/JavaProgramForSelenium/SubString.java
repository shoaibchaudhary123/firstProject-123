package JavaProgramForSelenium;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int start  = scan.nextInt();
        int end    = scan.nextInt();
        scan.close();
        
        System.out.println(str.substring(start, end));
	}

}

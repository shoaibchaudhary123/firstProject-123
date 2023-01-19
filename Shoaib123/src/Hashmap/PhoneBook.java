package Hashmap;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
public class PhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> hm = new HashMap<String, String>();
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		sc.nextLine();
		for (int i = 0; i <number; i++) {
			String name=sc.nextLine();
			String phone=sc.nextLine();
			hm.put(name, phone);
			String inputName = sc.nextLine();
		if (hm.containsKey(inputName)) {
			System.out.println("Not found");
		}else {
			System.out.println(inputName + "=" + hm.get(inputName));
		}
		}
		
	}

}

package Set;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet  hs = new HashSet ();
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < numCases;i++){
            if(hs.add(sc.nextLine())){
                count++;
            }
            System.out.println(count);
        }
	}

}

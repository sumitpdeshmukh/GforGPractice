import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		ArrayList<Integer> arrPrime = new ArrayList<>();
		while (cases > 0) {
    		 int num = in.nextInt();
    		 int kprime = in.nextInt();
    		 arrPrime.clear();
    		 int index = 0;
    	     while(num %2 == 0) {
    	         num = num / 2;
    	         arrPrime.add(2);
    	     } 
	     
             for (int i = 3; i <= Math.sqrt(num); i+=2) {
                 while (num % i == 0) {
                     num = num / i;
                     arrPrime.add(i);
                 }
             }
             if (num > 2 ) {
                arrPrime.add(num);  
             }
         /*for (int i = 0; i < arrPrime.size(); i++) {
		     System.out.print(" " + arrPrime.get(i));
		 }*/
    		 if (kprime > arrPrime.size()) {
    		     System.out.println(-1);
    		 } else {
    		    System.out.println(arrPrime.get(kprime -1));
    		 }
		    --cases;
		 }

	}
}

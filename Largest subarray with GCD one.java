// http://www.practice.geeksforgeeks.org/problem-page.php?pid=1659

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int cases = in.nextInt();
		while (cases > 0) {
		    int size = in.nextInt();
		    int i = 0;
		    int[] arr = new int[size];
		    while(i < size) {
		        arr[i] = in.nextInt();
		        i++;
		    }
		    Arrays.sort(arr); // Sort to pass the minimum number as divisor to function
		    int gcd = arr[0];
		    for (int j = 1; j < size; j++) {
		        gcd = CheckGCD(arr[j], gcd);
		    }
		    System.out.println(gcd == 1 ? size : -1);
		    cases--;
		}
		
	}
	
	public static int CheckGCD(int x, int y) {
	    int r = y;
	    while(x % y != 0) {
	       r =  x % y;
	       x = y;
	       y = r;
	    }
	    return r;
	}
}

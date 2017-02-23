/* http://www.practice.geeksforgeeks.org/problem-page.php?pid=1667 */
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
		while (tests > 0) {
		    int mileN = in.nextInt();
		    System.out.println(CalculateSpeed(mileN));
		    tests--;
		}
	}
	
	public static long CalculateSpeed(int mileN) {
	    if (mileN % 2 == 0) {
	        return (long) Math.pow(3, ((mileN/2) - 1)) * 7;
	    } else {
	        int terms = (mileN + 1) / 2;
	        long sum = ((1 + mileN) * terms) / 2;
	        return (long) Math.pow(sum,2);
	    }
	}
}

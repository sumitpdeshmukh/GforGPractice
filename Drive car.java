// http://www.practice.geeksforgeeks.org/problem-page.php?pid=1657

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static int extra = 0;
	
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
		while (tests > 0) {
		    int tracks = in.nextInt();
		    int mileage = in.nextInt();
		    int i = 0;
		    int[] arr = new int[tracks];
		    while(i < tracks) {
		        arr[i] = in.nextInt();
		        i++;
		    }
		    Arrays.sort(arr);
		    int ans = mileage - arr[tracks - 1];
		    System.out.println(ans > 0 ? -1: ans * -1);
		    tests--;
		}
	}
}

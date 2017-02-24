//http://www.practice.geeksforgeeks.org/problem-page.php?pid=1661

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
		while (tests > 0) {
		    int M = in.nextInt();
		    int N = in.nextInt();
		    long ans = 0;
            while (Math.min(M,N) > 0 ) {
                ans += (M*N);
                M--;
                N--;
            }
		    System.out.println(ans);
		    tests--;
		}
	}

}

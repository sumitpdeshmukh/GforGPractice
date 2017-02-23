// Problem statement at
/* http://www.practice.geeksforgeeks.org/problem-page.php?pid=1669 */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
		while (tests > 0) {
		    int station = in.nextInt();
		    String direct = in.next(); 
		    System.out.println(GetTime(station,direct.toCharArray()[0]));
		    tests--;
		}
	}
	
	public static int GetTime(int station, char direct) {
		    if (direct == 'D') {
		        if (station >= 11)
		            return station - 11;
		        else
		            return (11 - station) + (2 * station);
		    } else {
		        if (station <= 11)
		            return 11 - station;
		        else
		            return (19 - station)*2 + (station - 11);
		    }
	}
}

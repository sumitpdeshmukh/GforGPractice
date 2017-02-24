//http://www.practice.geeksforgeeks.org/problem-page.php?pid=1652

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner in = new Scanner(System.in);
		int tests = in.nextInt();
		while (tests > 0) {
		    int size = in.nextInt();
		    int index = 0;
		    int[] arr = new int[size];
		    while(index < size) {
		        arr[index] = in.nextInt();
		        index++;
		    }
		    Arrays.sort(arr);
		    int count = 0;
		    int i =0, j = i + 1, k = j + 1;
		    
		    for (i = 0; i < j; i++) {
    		    for (j = i +1; j < k; j++) {
    		        for (k = j +1; k < size ; k++) {
        		        if (arr[i] + arr[j] > arr[k]) {
        		            count += 1;
        		            System.out.print(arr[i] + " ");
        		            System.out.print(arr[j]+ " ");
        		            System.out.println(arr[k]);
        		        }
    		        }
		        }
		    }
		    System.out.println(count);
		    tests--;
		}
	}
}

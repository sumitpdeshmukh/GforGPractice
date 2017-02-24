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
		    long startime = System.nanoTime();
		    int size = in.nextInt();
		    int index = 0;
		    int n = size;
		    int[] arr = new int[size];
		    while(index < size) {
		        arr[index] = in.nextInt();
		        index++;
		    }
		    Arrays.sort(arr);
		    int count = 0;
		    int i =0, j = i + 1, k = j + 1;
		    
		    for (i = 0; i < size - 2; ++i) {
		        k = i + 2;
    		    for (j = i +1; j < size; ++j) {
    		        while(k < size && arr[i] + arr[j] > arr[k])
    		            k++;
        		    count += k - j -1;
		        }
		    }
		    
		    System.out.println(System.nanoTime() - startime);
		    System.out.println(count);
		    tests--;
		}
	}
}

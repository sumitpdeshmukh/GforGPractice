/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplepractice;

/**
 *
 * @author sumitdeshmukh
 */
public class ThreadClass extends Thread {
    
    public void run() {  
        System.out.println("My thread is in running state.");
        printPrimeList(15485863);
    } 
    
    public void printPrimeList(int n) {
        boolean[] arr = new boolean[n + 1];
        int[] data = new int[n + 1];
        int p = 2;
        int k = 1;
        while (p <= n) {
            arr[p] = true;
            data[p] = p++;
        }

        for (int i = 2; i * i <= n; i++) {
            if (arr[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    arr[j] = false;
                }
            }
        }
        p = 2;
        while (p <= n) {
            if (arr[p]) {
                System.out.println(k +"]]] " + data[p]);
                k++;
            }
            p++;
        }
    }
}

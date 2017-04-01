/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samplepractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author sumitdeshmukh
 */
public class SamplePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

       int[] array = {31000, 144, 114, 106, 164, 105, 136, 239, 209, 170, 213, 196, 246, 10000};
//        int[] ar2 = {2, 3, 8, 13};
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
 //       bubbleSort(array);
        //insertionSort(array);
        //quickSort(array, 0, array.length - 1);
        //System.out.println("Factorial of 5 : " + factorialNumber(5));
        //printNPrime(10);
        //mergeSort(array);
        //Dog d = new Dog();
        // this checks to see if d is of type Animal
//        if (d instanceof Animal) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }
//        Dog d = new Dog("Rocky");
//        HashMap<Dog,Integer> map = new HashMap<>();
//        map.put(d, 100);
//        d.setName("antic");
//        
//        System.out.println(map.get(d));
//        
//        System.out.println(map.containsKey(d));
//        
//        Iterator itr = map.entrySet().iterator();
//        if (itr.hasNext()) {
//            Object dog = itr.next();
//            System.out.println(dog.equals(d));
//        }
//        spiralPrint(6);
        //printPrimeList(100);
        //printNPrime(10001);
        Fibonacci_Iterative(40);
        //System.out.println(palindrome("asaa"));
        //System.out.println(squareRootBS(3));
        //System.out.println(Math.sqrt(3));

//        TestJoinMethod1 t1 = new TestJoinMethod1();
//        TestJoinMethod1 t2 = new TestJoinMethod1();
//        TestJoinMethod1 t3 = new TestJoinMethod1();
//        t1.start();
//        try {
//            t1.join();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//        t2.start();
//        t3.start();

    }
//    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.head = new Node(1);
//        Node second = new Node(2);
//        Node third = new Node(3);
//        list.head.next = second;
//        second.next = third;
//
//        list.printList();
//        char[] array = {'{', '}', '(', '(', ')', '{', ')', ')'};
//        String abc = "{{{{{{}}}}}}}}}{{()()()()((((())()()))(";
//        
//        if (checkBrackets(abc.toCharArray())) {
//            System.out.println("Balanced Char array");
//        } else {
//            System.out.println("Unbalanced Char array");
//        }
//        
//        abc = "Information Technology";
//        System.out.println(stringRev(abc.toCharArray()));

//    }
    public static void bubbleSort(int[] arr) {
        int temp = 0, j = 0;
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }

            }
        }
        System.out.println("after bubble sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void insertionSort(int[] arr) {
        int key = 0, j = 0;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            while (arr[j] > key) {
                arr[i] = arr[j];
                arr[j] = key;
                j++;
            }

        }

        System.out.println("after insertion sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static void quickSort(int arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            partition(arr, left, index - 1);
        }
        if (right > index) {
            partition(arr, index, right);
        }

        System.out.println("after quick sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int partition(int arr[], int left, int right) {
        int i = left, j = right;
        int tmp, pivot = arr[(left + right) / 2];
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }

        return i;
    }

    public static boolean checkBrackets(char[] arr) {
        if (arr.length % 2 == 1) {
            return false;
        }

        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '}' && !s1.empty()) {
                if (s1.peek() == '{') {
                    s1.pop();
                } else {
                    s1.push(arr[i]);
                }
            } else if (arr[i] == '{') {
                s1.push(arr[i]);
            } else if (arr[i] == ')' && !s2.empty()) {
                if (s2.peek() == '(') {
                    s2.pop();
                } else {
                    s2.push(arr[i]);
                }
            } else {
                s2.push(arr[i]);
            }
        }

        return s1.empty() && s2.empty();
    }

    public static String stringRev(char[] arr) {
        StringBuilder str = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            str.append(arr[i]);
        }

        return str.toString();
    }
    
    public static String recursiveRev(String str) {
        if (str.length() == 0)
            return str;

        return recursiveRev(str.substring(1)) + str.charAt(0);
    }
    
    public static boolean palindrome(String str) {
        int i =0, start = 0, end = str.length() - 1, middle = (start + end)/2;
        for (i=0; i <= middle; i++) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                break;
            }
        }
        return i == middle + 1 ? true : false;
    }

    public static void printPrimeList(int n) {
        boolean[] arr = new boolean[n + 1];
        int[] data = new int[n + 1];
        int p = 2;
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
                System.out.println(data[p]);
                if (checkifPrime(data[p])) {
                    System.out.println("prime");
                } else {
                    System.out.println("composite");
                }
            }
            p++;
        }
    }

    public static boolean checkifPrime(int n) {
        if (n < 4) {
            return n > 1;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i < n; i += 6) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printNPrime(int n) {
        if (n >= 1) {
            System.out.println("First " + n + " Prime numbers is/are: 2");
        }
        int num = 3, status = 1, sum = 0;
        for (int i = 2; i <= n;) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }

            if (status != 0) {
                System.out.println(i + ">>> " + num);
                sum = sum + num;
                System.out.println(sum);
                i++;
            }
            num++;
            status = 1;
        }
    }

    

    public static double factorialNumber(double n) {
        if (n < 0) {
            System.out.println("not a valid input");
            return -1;
        }
        if (n <= 1) {
            return 1;
        }
        double fact = n * factorialNumber(n - 1);
        return fact;
    }
    
    public static void Fibonacci_Iterative(int len)
    {
        int a = 0, b = 1, c = 0;
        System.out.print(a + " " + b);

        for (int i = 2; i < len; i++)
        {
            c= a + b;
            System.out.print(" "+ c);
            a= b;
            b= c;
        }
   }

    public static void asciiMain() throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the char:");
        String str1 = buff.readLine();
        String str = "sumit";
        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            int j = (int) c;// your work is done here
            System.out.println("ASCII OF " + c + " = " + j + ".");
        }
    }

    public static float squareRoot(float number) {
        if (number < 0f) {
            return -1;
        }
        if (number == 0f || number == 1f) {
            return number;
        }

        float root = 1;
        float square = root;
        while (square < number) {
            root = root + 0.0000001f;
            square = root * root;
        }
        return root;
    }

    public static float squareRootBS(int number) {
        if (number < 0f) {
            return -1;
        }
        if (number == 0f || number == 1f) {
            return number;
        }

        float start = 0, end = number, mid = 0;
        float precision = 0.00000000000001f;
        Float difference = (float) Math.abs(start * start - number);
        while (difference.compareTo(precision) >= 0) {
            mid = (start + end) / 2.0f;

            if (mid * mid > number) {
                end = mid;
            } else {
                start = mid;
            }

            difference = (float) Math.abs(start * start - number);
        }
        return mid;
    }

    public static void spiralPrint(int n) {
        if (n == 0) {
            return;
        }

        int[][] array = new int[n][n];
        int top = 0;
        int down = n - 1, right = n - 1;
        int left = 0;
        int var = 1;
        while (true) {
            // Print top row
            for (int j = left; j <= right; ++j) {
                array[top][j] = var;
                var++;
            }
            top++;
            if (top > down || left > right) {
                break;
            }
            //Print the rightmost column
            for (int i = top; i <= down; ++i) {
                array[i][right] = var;
                var++;
            }
            right--;
            if (top > down || left > right) {
                break;
            }
            //Print the bottom row
            for (int j = right; j >= left; --j) {
                array[down][j] = var;
                var++;
            }
            down--;
            if (top > down || left > right) {
                break;
            }
            //Print the leftmost column
            for (int i = down; i >= top; --i) {
                array[i][left] = var;
                var++;
            }
            left++;
            if (top > down || left > right) {
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

}

class TestJoinMethod1 extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}

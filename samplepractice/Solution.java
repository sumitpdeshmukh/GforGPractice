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
public class Solution {

    String[] onedigitwords = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    String[] twodigitwords = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tenswords = {"Zero", "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    String hundred = "Hundred";
    String[] thousandwords = {"Thousand"};

    public String numberToWords(int num) {
        StringBuilder sb = new StringBuilder(200);
        int times = num / 100;
        int remainder = num % 100;
        if (times == 1) {
            if (remainder == 0) {
                sb.append(onedigitwords[times] + hundred);
            } else {
                sb.append(onedigitwords[times] + hundred + twodigitwords[remainder]);
            }
        } else if (times == 0) {
            times = num / 10;
            remainder = num % 10;
            if (times == 1) {
                sb.append(twodigitwords[remainder]);
            } else if (times == 0) {
                sb.append(onedigitwords[remainder]);
            } else if (remainder == 0) {
                sb.append(tenswords[times]);
            } else {
                sb.append(tenswords[times] + " " + onedigitwords[remainder]);
            }
        }
        return sb.toString();
    }
    
    public void numberToWord(int num) {
        char[] arrnumber = String.valueOf(num).toCharArray();
        int length = arrnumber.length;
        if (length > 3) {
            
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        for (int i = 0; i < 100; i++) {
            System.out.println(sol.numberToWords(i));
        }
    }
}

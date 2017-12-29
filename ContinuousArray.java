/* https://www.geeksforgeeks.org/check-array-contains-contiguous-integers-duplicates-allowed/ */
import java.util.HashSet;
import java.util.Set;

public class ContinuousArray {

    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        int[] arr = {10, 14, 10, 12, 12, 13, 15, 11};
        if (checkIfContinous(arr))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }

    private static boolean checkIfContinous(int[] arr)
    {
        int maxint =  arr[0];
        int minint = arr[0];

        Set aset = new HashSet();
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] <= minint) {
                minint = arr[i];
            }
            if (arr[i] >= maxint ) {
                maxint = arr[i];
            }
            aset.add(arr[i]);
        }

        if (maxint - minint == aset.size() - 1)
            return true;
        else
            return false;
    }
}

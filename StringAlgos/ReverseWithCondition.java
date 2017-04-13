//Reverse an array without affecting special characters

class ReverseArray
{
	// Driver method
	public static void main(String[] args)
	{
	    String str = "Ab,c,de!$";
	    char[] arr = str.toCharArray();
	    char temp;
	    for (int i=0, j= arr.length -1; i < j;) {
	        if (Character.isLetter(arr[i]) && Character.isLetter(arr[j])) {
	            temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            i++; j--;
	        } else if (! Character.isLetter(arr[j])) {
	            j--;
	        } else if (! Character.isLetter(arr[i])) {
	            i++;
	        }
	    }
	    
	    System.out.println(String.valueOf(arr));
	}
}

// Given a string, print all possible palindromic partitions
class AllPalindrome
{
	// Driver method
	public static void main(String[] args)
	{
	    String str = "geeks";
	    char[] arr = str.toCharArray();
	    int len = str.length();
	    int pass = 0;
	    while (pass < len) {
    	    for (int i = 0; i <= len - pass; i++) {
    	            String mystr = str.substring(i, pass + i);
    	            if(isPalindrome(mystr)) {
    	                System.out.print(mystr + " ");
    	            }
    	    }
    	    System.out.println();
    	    pass++;
    	}
	    //System.out.println(String.valueOf(arr));
	}
	
	public static boolean isPalindrome(String str) {
	    char[] arr = str.toCharArray();
	    int i=0;
	    int j= arr.length -1;

        while (i < j && arr[i] == arr[j]) {
            i++;
            j--;
        }
        
        if (j <= i)
            return true;
        else
            return false;
	}
}

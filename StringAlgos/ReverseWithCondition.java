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

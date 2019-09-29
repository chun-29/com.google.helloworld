/**
* Description: Array binary search
* Author:      chun
* Date:        2019-9-29
*/
import java.util.Arrays;
public class BinarySearch {
    int[] Array;
	public void binarySearch(int[] Array) {
        this.Array = Array;
    }
	public static void main(String args[]) {
	    int array[] = {23,76,34,13,67,45,90,111,87,54};
		Arrays.sort(array);
		for(int i = 0;i < array.length;i++)
		    System.out.println(array[i] + " ");
	    
		BinarySearch binarySearch = new BinarySearch();
	    binarySearch.binarySearch(array);
	    
		System.out.println();
	    System.out.println("Search: ");
	    int i;
    	i=Arrays.binarySearch(array,23);
        System.out.println(i);
	}
	int binarySearch(int max,int min,int val) {
        int mid = (max + min) / 2;
        if(val == Array[mid]) {
            return mid;
        }
        else if(val > Array[mid]) {
            return binarySearch(max,mid,val);
        }
        else if(val < Array[mid]){
            return binarySearch(mid,min,val);
        }
        return -1;
	}
 }

  
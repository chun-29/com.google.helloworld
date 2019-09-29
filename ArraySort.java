/**
* Description: Array sort
* Author:      chun
* Date:        2019-9-29
*/
import java.util.Arrays;
public class ArraySort {
    public static void main(String args[]) {
		int array[] = {3,2,6,4,5,9,8,7};
		Arrays.sort(array);
		for(int i = 0;i < array.length;i++)
		    System.out.println(array[i] + " ");
	}
}
/**
* Description: Copy the array
* Author:      chun
* Date:        2019-9-29
*/
public class ArrayCopy {
    public static void main(String[] args) {
	int array1[] = {3,4,5,7,8,10,11,15,13,11};
	int array2[] = {0,0,0,0,0,0,0,0,0,0};
	System.arraycopy(array1,0,array2,1,6);
	System.out.println("array2: ");
	for(int i = 0;i < array2.length;i++)
            System.out.print(array2[i] + " ");
    }
}

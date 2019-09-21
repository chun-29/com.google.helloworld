/**
* Description: Enter the number of layers of the pyramid to print the pyramid pattern
* Author:      chun
* Date:        2019-9-16
*/
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        //the number of layers of the pyramid
        int m;
        Scanner scan = new Scanner(System.in);
	System.out.println("Enter m: ");
	int n = scan.nextInt();
	for(int i = 1;i < = n;i++) {
            //控制空格的个数
	    for(int k = 1;k < = n - i;k++) {
	        System.out.printf(" ");
	    }
	    //控制*的个数
	    for(int j = 1;j < = (2 * i - 1);j++) {
	        System.out.printf("*");
	    }
	    System.out.println();
	}
    }   
}

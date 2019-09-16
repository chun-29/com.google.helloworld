/**
* Descripton: Enter the number of layers of the pyramid to print the pyramid pattern
* Author:     chun
* Date:       2019-9-16
*/
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
	    int m;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter m: ");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++){
		    for(int k=1;k<=n-i;k++){
			    System.out.printf(" ");
			}
			for(int j=1;j<=(2*i-1);j++){
			    System.out.printf("*");
			}
			System.out.println();
		}
	}   
}
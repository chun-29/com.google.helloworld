/**
* Description: Judging whether the address is a young sister or a old sister by the entered age
* Author:      chun
* Date:        2019-9-23
*/
import java.util.Scanner;
public class Age {
	public static void main(String[] args) {
		System.out.println("Enter age: ");
	    Scanner scan = new Scanner(System.in);
	    int age = scan.nextInt();
		age = age / 18;
	    switch(age) {
			case 0:
		        System.out.println("young sister");
			    break;
		    default:
		        System.out.println("old sister");
			    break;
	    }
	}	
}
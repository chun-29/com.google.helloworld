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
	// 以18岁为分界，做判断
	age = age / 18;
	switch(age) {
            // 小于18岁的称呼小姐姐
	    case 0:
		System.out.println("young sister");
	        break;
	    // 大于等于18岁的称呼大姐姐
	    default:
		System.out.println("old sister");
	        break;
	}
    }	
}

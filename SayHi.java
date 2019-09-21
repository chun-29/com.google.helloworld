/**
* Description: Say Hi and Calculate the sum of 1 to 10
* Author:      chun
* Date:        2019-9-11
*/
public class SayHi {
    public static void main(String[] args) {
	SayHi sayHi=new SayHi();
	sayHi.sayHi(sayHi.sum());
    }
    public void sayHi(int sum) {
	System.out.println("Say Hi!" + sum());
    }
    public int sum() {
	//给sum赋初值为零
	int sum = 0;
	//在i<=100的前提条件下，i递增
        for(int i = 0;i < = 100;i++) {
	    //将1-100的累加和赋值给sum
	    sum + = i;
	}
	return sum;
    }
}

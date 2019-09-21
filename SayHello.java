/**
* Description: Say Hello and Calculate the sum of 1 to 10 
* Author:      chun
* Date:        2019-9-11
*/
public class SayHello{
    public static void main(String[] args){
	System.out.println("Below is the function of sayhello");
	SayHello();
    }
    public static void SayHello(){
	System.out.println("say hello!" + Sum());
    }
    public static int Sum(){
	int i;
	//给sum赋初值为零
	int sum = 0;
	//利用for循环语句，在i<=100的条件下，i递增
        for(i = 1;i < = 100;i++){
	    //1-100累加
	    sum = sum + i;
	}
	return sum;
    }
}

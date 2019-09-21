/**
* Description: Aligning Output of the 99 Multiplication Table
* Author:      chun
* Date:        2019-9-16
*/
public class MulTable {
    public static void main(String[] args){
        //控制九九乘法表只有九行    
	for(int i = 1;i < = 9;i++){
	    //控制第i行有i条乘法算式
            for(int j = 1;j < = i;j++){
	        System.out.printf(i + "*" + j + "=" + j * i + " ");
	    }
	    System.out.println(" ");
	} 
    }   
}

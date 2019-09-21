/**
* Description: Calculate and output the values of the ten formulas give
* Author:      chun
* Date:        2019-9-15
*/
public class ThirdQuestion {
    public static void main(String[] args) {
	int res;
	int n1 = 12;
	int n2 = 24;
	int n3 = 16;
	int n4 = 3;
	double d;
	double v1 = 10.0;
	double v2 = 3.1416;
	res = n1 / n4;
	System.out.println("res = n1 / n4 =" + res);
	d = n1 / n4;
	System.out.println("d = n1 / n4 =" + d);
	res = n3 / n4;
	System.out.println("res = n3 / n4 =" + res);
	d = n3 / n4;
	System.out.println("d = n3 / n4 =" + d);
	d = v1 / n4;
	System.out.println("d = v1 / n4 =" + d);
	d = v1 / v2;
	System.out.println("d = v1 / v2 = " + d);
	res = n1 / n2;
	System.out.println("res = n1 / n2 =" + res);
	d = (double)n1 / n2;
	System.out.println("d = (double)n1 / n2 =" + d);
	d = n1 / (double)n2;
	System.out.println("d = n1 / (double)n2 =" + d);
	d = (double)(n1 / n2);
	System.out.println("d = (double)(n1 / n2) =" + d);
    }
}

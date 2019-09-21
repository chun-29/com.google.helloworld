/**
* Description: Calculate and output the values of the ten formulas give
* Author:      chun
* Date:        2019-9-15
*/
public class ThreeQuestion {
    public static void main(String[] args) {
	System.out.println("Below is the function of ThreeQuestion");
	ThreeQuestion();
    }
    public static void ThreeQuestion() {
	//Output the value of the first formul
	System.out.println("Three Question:" + x());
	//Output the value of the second formul
	System.out.println("Three Question:" + y());
	//Output the value of the third formul
	System.out.println("Three Question:" + a());
	//Output the value of the forth formul
	System.out.println("Three Question:" + b());
	//Output the value of the fifth formul
	System.out.println("Three Question:" + m());
	//Output the value of the sixth formul
	System.out.println("Three Question:" + z());
	//Output the value of the seventh formul
	System.out.println("Three Question:" + s());
	//Output the value of the eighth formul
	System.out.println("Three Question:" + t());
	//Output the value of the ninth formul
	System.out.println("Three Question:" + c());
	//Output the value of the tenth formul
	System.out.println("Three Question:" + k());
    }
    public static int x() {
	int x;
        int res;
	int n1 = 12;
	int n4 = 3;
	x = res = n1 / n4;
	return x;
    }
    public static double y() {
        int n1 = 12;
	int n4 = 3;
	double y;
	double d;
	y = d = n1 / n4;
	return y;
    }
    public static int a() {
	int a;
	int res;
	int n3 = 16;
	int n4 = 3;
	a = res = n3 / n4;
	return a;
    }
    public static double b() {
	int n3 = 16;
	int n4 = 3;
        double b;
	double d;	
	b = d = n3 / n4;
	return b;
    }
    public static double m() {
	int n4 = 3;
	double m;
	double d;
	double v1 = 10.0;
	m = d = v1 / n4;
	return m;
    }
    public static double z() {
	double z;
	double d;
        double v1 = 10.0;
        double v2 = 3.1416;
	z = d = v1 / v2;
	return z;
    }
    public static int s() {
	int s;
        int res;
        int n1 = 12;
	int n2 = 24;
	s = res = n1 / n2;
	return s;
    }
    public static double t() {
	int n1 = 12;
	int n2 = 24;
	double t;
	double d;
	t = d = (double)n1 / n2;
	return t;
    }
    public static double c() {
	int n1 = 12;
	int n2 = 24;
	double c;
	double d;
	c = d = n1 / (double)n2;
	return c;
    }
    public static double k() {
	int n1 = 12;
	int n2 = 24;
	double k;
	double d;
	k = d = (double)(n1 / n2);
	return k;
    }
}

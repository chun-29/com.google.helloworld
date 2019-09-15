public class TwoQuestion{
    public static void main(String[] args){
	    System.out.println("Below is the function of TwoQuestion");
		TwoQuestion();
	}
	public static void TwoQuestion(){
	    System.out.println("Two Question:"+count());
	}
	public static int count(){
	    int count=10;
		count*=count+2;
		count/=100;
		count++;
		return count;
	}
}
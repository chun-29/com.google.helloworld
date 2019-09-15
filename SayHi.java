public class SayHi{
    public static void main(String[] args){
	    SayHi sayHi=new SayHi();
		sayHi.sayHi(sayHi.sum());
	}
	public void sayHi(int sum){
	    System.out.println("Say Hi!"+sum());
	}
	public int sum(){
	    int sum=0;
		for(int i=0;i<=100;i++){
		    sum+=i;
		}
		return sum;
	}
}
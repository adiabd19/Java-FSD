package methods;

public class CallByValue {

	int num=50;

	void operation(int num) {
		this.num=num*10/100;
		
	}
	public static void main(String[] args) {
		
		CallByValue obj= new CallByValue();
		
		System.out.println("Value of num before function call: "+obj.num);
		
		obj.operation(100);
		System.out.println("Value of num after function call: "+obj.num);
	}
}

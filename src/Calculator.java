public class Calculator {

	public static void main(String[] args) {
		System.out.println("starting Calculator");
		run();		
		
	}

	public static void run() {
			
		DoArithmetic a = new DoArithmetic();
		double result = a.Add(2, 2);
		
		System.out.println(result);

	}
	
}
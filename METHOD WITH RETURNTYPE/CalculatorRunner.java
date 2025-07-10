class CalculatorRunner{
 public static void main(String []calc){
	System.out.println("MAIN STARTED");
	int total = Calculator.add(7,2);
	Calculator.add(7,3);
	System.out.println(total);
	Calculator.sub(10,5);
	Calculator.div(10,2);
	Calculator.mod(10,3);
	Calculator.mult(2,5);
	System.out.println("MAIN ENDED");
	}
}
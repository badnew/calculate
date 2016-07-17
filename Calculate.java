public class Calculate {
	public static void main(String[] args) {

		System.out.println("\nCalculate...");
		
		double first = Double.valueOf(args[0]);
		double second = Double.valueOf(args[1]);

		System.out.println("Sum: " + (first + second));
		System.out.println("Difference: " + (first - second));
		System.out.println("Product: " + (first * second));
		System.out.println("Ratio: "+ (first / second));
		System.out.println("Power:  " + Math.pow(first, second));
	}
}
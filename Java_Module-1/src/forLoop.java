public class forLoop {

	public static void main(String[] args) {

		// Write a program to print 10 even numbers and 10 odd numbers.
		String evenNumbers = "";
		String oddNumbers = "";
		for (int i = 1; i <= 20; i++) {
			if ((i >= 2) && (i % 2 == 0)) {
				evenNumbers = evenNumbers + i + ",";
			} else {
				oddNumbers = oddNumbers + i + ",";
			}
		}

		System.out.println("Even Numbers : " + evenNumbers);
		System.out.println("Odd Numbers : " + oddNumbers);

		// Write a program to find factorial of a number.

		int FactorailOf = 4;
		int Fact = 1;
		for (int f = 1; f <= FactorailOf; f++) {
			Fact = Fact * f;
		}

		System.out.println("Factorail of " + FactorailOf + " is " + Fact);
		
		//Write a program to generate tables of 10.
		
		for(int t = 1 ; t <= 10; t++)
		{
			System.out.println("10  X " + t + " = " + 10 * t);
		}
		
//		//Write a program to add the digits of a number.
//		String inputNumber = "23232323";
//		int k=0;
//		for(int c = 0; c < inputNumber.length(); c++)
//		{
//			k = k+c;
//		}
//		System.out.println("Sum of digits " + inputNumber + " is " + k);
//		
//		//Write a program to reverse the digits of a number.
//		String rNumber = "23232323";
//		
//		for(int c = 0; c < rNumber.length(); c++)
//		{
//			c = 
//		}
//		System.out.println("Sum of digits " + inputNumber + " is " + k);
	}
}

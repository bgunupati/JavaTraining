public class IfConsition {

	public static void main(String[] args) {

		// Write a program to check if a candidate iseligible for voting or not.
		// (Hint: Check age)
		// int age = 17;
		int age = 18;
		if (age > 18) {
			System.out.println("The person is allowed to vote.");
		} else {
			System.out.println("This person is not allowed to vote.");
		}

		// Write a program to check if the number is positive or negative
		int inputNumber = -10;

		if (inputNumber > 0) {
			System.out.println(inputNumber + " is a positive number");
		} else {
			System.out.println(inputNumber + " is a negtive number");
		}

		// Extend the previous program to check whether the given number is
		// positive, zero or negative. (Hint: use if-else conditions)

		int inputNumberOther = -0;

		if (inputNumberOther > 0) {
			System.out.println(inputNumberOther + " is a positive number");
		} else if (inputNumberOther < 0) {
			System.out.println(inputNumberOther + " is a negtive number");
		} else {
			System.out.println(inputNumberOther + " is zero");
		}

		//Write a program to find largest of two numbers.
		int x = 5, y = 10;
		
		if(x > y)
		{
			System.out.println( x + " is greather than " + y);
		}
		else
		{
			System.out.println( y + " is greather than " + x);
		}
		
		//Write a program to check given number is even or odd. (Hint: use % operator)
		
		int checkEvenOrOdd = 11;
		
		if(checkEvenOrOdd % 2 == 0)
		{
			System.out.println("The number " + checkEvenOrOdd + " is even");
		}
		else
		{
			System.out.println("The number " + checkEvenOrOdd + " is odd");
		}
	}
}


public class ArithmeticOperators{

	public static void main(String[] args)
	{
		int x = 5; 
		int y = 4;
		int z;
		
		//Addition
		z = x + y;
		System.out.println("Addition of numbers - " + x + " + "  +  y + " = " + z);
		
		//Subtraction
		z = x - y;
		System.out.println("Subtraction of numbers - " + x + " - "  +  y + " = " + z);
		
		//Multiplication
		z = x * y;
		System.out.println("Multiplication of numbers - " + x + " * "  +  y + " = " + z);
		
		//To handle decimal point defined the variables double.
		double a = 5; 
		double b = 4;
		double c;
		//Division
		c = a / b;
		System.out.println("Division of numbers - " + a + " / "  +  b + " = " + c);
		
		//Incremental Operation
		int age = 27;
		System.out.println("Age of person with "+ age  +" years in next birthday will be " + age++);
		
		//decrement operator
		int month = 11;
		month = month--;
		System.out.println("Previous month of " + month + " is " + month--);
	}
}

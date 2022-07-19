import java.util.Date;
import java.util.Arrays;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Scanner;

public class tutorial1 {
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		// Reference Data type (Non Primitive data type)
		// need to allocate memory with new keyword
		Date now = new Date();
		System.out.println(now);
		// now.getTime(); 
		// we can access the member of object with (.) dot operator
		
		// Elements are independent of each other in java
		byte x = 1;
		byte y = x;
		x = 3;
		System.out.println(y);
		
		// Point in java (The values are not independent of each other)
		Point point1 = new Point(1, 1); // Point(x:1, y:1);
		Point point2 = point1;
		
		point1.x = 2;
		point1.y = 3;
		System.out.println(point2);
		
		// String in java is a Reference data type (but syntax is like primitive data type)
		// we can access the string methods as it is an object
		// with the help of (.) dot operator
		
		// Strings are immutable in java
		String message = "Hello World" + "!!";
		System.out.println(message);
		
		
		// Escape sequences (\)
		String name = "Brad \"Pitt\""; // Adding double quotes
		System.out.println(name);
		
		name = "c:\\Windows\\src"; // Adding Backslash
		System.out.println(name);
		
		// similarly \n = new line, \t = for tab
		
		
		// Arrays are refrence type. Hence, we need to allocate memory with (new) keyword
		int[] number = new int[]  {1, 2, 3, 4, 5};
		for(int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		// Multi-Dimensional Array
		// it is 3x3 Matrix (3 rows, 3 columns)
		int[][] num = {{1,2,3},{4,5,6}};
		System.out.println(Arrays.deepToString(num));
		
		
		// Constant (final) Variable in java
		// meaning we cannot change the variable
		final float pie = 3.14F;
		System.out.println(pie);
		
		// priority of Operators
		int y1 = 10 + 3 * 2; // Answer will be 16 cause the multiplication & division has high priority 
		System.out.println(y1);
		
		// but we can make it with paranthesis
		int y2 = (10 + 3) * 2;
		System.out.println(y2);
		
		// Order of Operator 
			// 1. () paranthesis
			// 2. */ multiplication & division
			// 3. +- addition & subtraction
		
		// Casting
		// 1. Implicit Casting - means java compiler automatically convert data type 
		short x1 = 1;
		int y3 = x1 + 2;
		System.out.println(y3); // here, the ineteger value (2) is automatically converted to short
		
		// 2. Explicit Casting
		double x2 = 1.2;
		int x3 = (int)x2 + 2;
		System.out.println(x3); // here, the double is converted to integer value1
		
		
		// Math Functions
		int func1 = Math.round(1.1F);  // return the rounded value
		System.out.println(func1);
		
		int func2 = (int)Math.ceil(1.2F);  // return the greatest integer near it  (2)
		System.out.println(func2);
		
		int func3 = (int)Math.floor(1.2F);  // return the smallest integer   (1)
		System.out.println(func3);
		
		// random() function returns the random value between 0 to 1
		int func4 =(int)(Math.random() * 100);  // this will return number between 0 to 100
		System.out.println(func4);
		
		
		// Formatting Numbers using NumberFormat Package
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String result = currency.format(45323.877); // it take String as type
		System.out.println(result);
		
		// It will format the number as the percentage
		NumberFormat percent = NumberFormat.getPercentInstance();
		String result1 = percent.format(0.2); // it take String as type
		System.out.println(result1);
		
		
		// Method Chaining (One Liner)
		String percentage = NumberFormat.getPercentInstance().format(0.2);
		System.out.println(percentage);
		
		// Input from the User (java.util.Scanner) package
		Scanner scanner = new Scanner(System.in);
		System.out.print("Age: ");
		byte age = scanner.nextByte();
		System.out.println("You are " + age);  // here, the type conversoin automatically done by the java compiler 
												// byte to string and concatenate 
		Scanner sc = new Scanner(System.in);
		System.out.print("name: ");
		String hello  = sc.next();   // next() only take one token (which means one word)
		System.out.println("You are " + hello); 
	
		Scanner sc2 = new Scanner(System.in);
		System.out.print("name: ");
		String hello2  = sc2.nextLine().trim();   // nextLine() will take as an input of entire line
											// also we can add trim() method to remove the unnecessary spaces while input
		System.out.println("You are " + hello2);
		
		
		// ----- Project -> Mortgage Calculator -------
		
		final byte PERCENT = 100;
		final byte MONTHS_IN_YEAR = 12;
		
		// Taking Inputs
			// -> Principal Amount 
			// -> Rate of Interest
			// -> Period in years
		Scanner scanner1 = new Scanner(System.in);
		
		System.out.print("Principal: ");
		int principal = scanner1.nextInt();
		
		
		System.out.print("Rate of Interest: ");
		float annualInterest = scanner1.nextFloat();
		float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
		
		System.out.print("Period (Years) : ");
		byte years = scanner1.nextByte();
		int numberOfPayments = years * MONTHS_IN_YEAR;
		
		
		double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
										/(Math.pow(1 + monthlyInterest, numberOfPayments ) - 1);
		
		
		String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
		System.out.println("The Mortgage per Month is : " + mortgageFormatted);
		
		scanner1.close();
	}
}

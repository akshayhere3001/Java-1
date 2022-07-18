import java.util.Date;
import java.awt.*;

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
	}
}

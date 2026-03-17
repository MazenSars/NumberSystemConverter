package numberSystemConverter;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ConverterContext context= new ConverterContext();
	        while (true) {
	            System.out.print("Enter system name: ");
	            String userInput = scanner.nextLine();
	            
	            System.out.print("Enter number: ");
	            int number = scanner.nextInt();
	            // Consume the leftover newline character to avoid the mixed int and line error
	            scanner.nextLine(); 
	            System.out.println(context.map.get(userInput).convert(number));
	        }
	}
}
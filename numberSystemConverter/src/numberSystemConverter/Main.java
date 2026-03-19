package numberSystemConverter;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	        ConverterContext context= new ConverterContext();
	        boolean system, number;
	        String userInput = "";
	        int numberInput = 0;
	        while (true) {
	        	Scanner scanner = new Scanner(System.in);
	        	system= false;
	        	number= false;
	            	while (system==false) {
	            		System.out.println("Choose a valid system:");
	            		System.out.println(context.map.keySet());
	    	            userInput = scanner.nextLine();
	    	            for (String key: context.map.keySet()) {
	    	            	if (userInput.equals(key)) {
	    	            	system= true;
	    	            }
	            	}
	            	}
	            while (number== false) {
	            	System.out.println("Enter a valid number");
	            	try {
	            		numberInput= scanner.nextInt();
	            		if (numberInput>0) {
	            		number= true;
	            		}
	            	}
	            	catch (Exception e) {
	            		scanner.next();
	            	}
	            }
	        	
	            System.out.println(context.map.get(userInput).convert(numberInput));
	}
}
}
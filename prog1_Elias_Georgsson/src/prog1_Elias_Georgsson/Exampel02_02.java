package prog1_Elias_Georgsson;

import java.util.Scanner;

public class Exampel02_02 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner( System.in );
		
		System.out.print("Skriv namn: " );
		
		String namn=input.nextLine();
		
	    System.out.println("Hej "+namn+"!");
	    
	    System.out.println("Skriv ålder: " );
	    int ålder = input.nextInt();
	    
	    System.out.println("skriv längd: ");
	    Double längd = input.nextDouble();
	    
	    System.out.println( namn+" är "+ ålder+ "år gammal och "+längd+" m lång.");
	    
	    System.out.println( "Mycket fin" );
	    
	    
	    
	    
	    
	 
		
		

		
		
	}

}

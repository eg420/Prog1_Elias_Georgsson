package prog1_Elias_Georgsson;

import java.util.Scanner;

public class Exampel02_02 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner( System.in );
		
		System.out.print("Skriv namn: " );
		
		String namn=input.nextLine();
		
	    System.out.println("Hej "+namn+"!");
	    
	    System.out.println("Skriv �lder: " );
	    int �lder = input.nextInt();
	    
	    System.out.println("skriv l�ngd: ");
	    Double l�ngd = input.nextDouble();
	    
	    System.out.println( namn+" �r "+ �lder+ "�r gammal och "+l�ngd+" m l�ng.");
	    
	    System.out.println( "Mycket fin" );
	    
	    
	    
	    
	    
	 
		
		

		
		
	}

}

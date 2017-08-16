import java.util.Scanner;

/*
 * Brendan Howell
 * CSC-151
 * 
 * Bar Chart
 * This program asks the user for sales numbers
 * from five stores and then prints them in a bar 
 * chart using asterisks to represent every $100
 */
public class BarChart {

	public static void main(String[] args) {
		//  Declare variables
		double store1, store2, store3, store4, store5;
		double asterisk = 0.00;
		
		// instance of scanner
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Please enter the sales "
						+ "for store 1:");
		store1 = input.nextDouble();
		
		System.out.println("Please enter the sales "
				+ "for store 2:");
		store2 = input.nextDouble();

		System.out.println("Please enter the sales "
				+ "for store 3:");
		store3 = input.nextDouble();

		System.out.println("Please enter the sales "
				+ "for store 4:");
		store4 = input.nextDouble();

		System.out.println("Please enter the sales "
				+ "for store 5:");
		store5 = input.nextDouble();
		
		//  Create chart
		System.out.println("SALES BAR CHART");
		
		System.out.print("Store 1: ");
		for (asterisk = store1/100; asterisk >0; asterisk--){
			System.out.print("*");				
			}
		
		System.out.println("");
		System.out.print("Store 2: ");	
		for (asterisk = store2/100; asterisk >0; asterisk--){
			System.out.print("*");				
			}
		
		System.out.println("");
		System.out.print("Store 3: ");	
		for (asterisk = store3/100; asterisk >0; asterisk--){
			System.out.print("*");				
			}
		
		System.out.println("");
		System.out.print("Store 4: ");	
		for (asterisk = store4/100; asterisk >0; asterisk--){
			System.out.print("*");				
			}
		
		System.out.println("");
		System.out.print("Store 5: ");	
		for (asterisk = store5/100; asterisk >0; asterisk--){
			System.out.print("*");				
			}
			
	}  //  End Main

}  //  End Class

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/*
 * Brendan Howell
 * CSC-151
 * 
 * Uppercase File Converter Project
 * This program asks the user to open a read
 * and a write file.  Then convert all letters to
 * uppercase
 */
public class UppercaseFileConverter {

	public static void main(String[] args) throws FileNotFoundException {
		//  Declare variable
		String filename;  // first file name
		String filename2; // second file name
			
		//  instance of scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Get File Names
		System.out.println("What is the name of the first file"
				+ " you want to open?");
		filename = keyboard.nextLine();
		
		System.out.println("What is the name of the second file"
				+ " you want to open?");
		filename2 = keyboard.nextLine();
		
				
		File myFile = new File(filename); 
		Scanner input = new Scanner(myFile);
		PrintWriter outputFile = new PrintWriter(filename2);
				
		while (input.hasNext()){  
			String fileRead = input.nextLine();
			String upperFileinput = fileRead.toUpperCase();
			outputFile.println(upperFileinput);
		}  //  End while
				
		//  close the file
		input.close();
		outputFile.close();

	}  //  End Main

}  //  End Class

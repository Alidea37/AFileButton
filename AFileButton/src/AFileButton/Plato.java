package AFileButton;


import java.io.*;
import java.util.Scanner;
import java.nio.file.*;

public class Plato{

	public static void myPlato() throws IOException{
		Scanner myreader;
		
		myreader = new Scanner(Paths.get("Platolog.txt"));
	
		String ethicsP[];
		ethicsP = new String[10];
		int i=0;
		
		while (myreader.hasNext()) {
			ethicsP[i] = myreader.nextLine();
			i=i+1;
		}			//prints forward
				for (int j=0; j<i; j++) {
					System.out.printf("%n" +ethicsP[j]);		
		}
				{		// prints backward
					for (int c = ethicsP.length-1; c>=0; c--){
							System.out.printf("%n" + ethicsP[c] + "%n");
				}
				
					System.out.printf("%n" + ethicsP[1] + "%n");
					
				System.out.println("Plato");
			
		myreader.close();
	
		}
	}
}
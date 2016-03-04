package AFileButton;
import java.io.*;
import java.util.Scanner;
import java.nio.file.*;


public class Epicurus {
	
	public static void myEpicurus() throws IOException{
		Scanner myreader;
		Scanner myscan = new Scanner(System.in);
		
		
		myreader = new Scanner(Paths.get("Curuslog.txt"));
		String ethics[];
		ethics = new String[10];
		int i=0;
		
		
		
		while (myreader.hasNext()) {
			ethics[i] = myreader.nextLine();
			i=i+1;
		}
		
				for (int j=0; j<i; j++) {
					System.out.printf("%n" + ethics[j]);
					
		}
				System.out.printf("%n" + ethics[0] + "%n" + ethics[3] + "%n");
				
			System.out.println("Epecurus");
			
			
		myreader.close();
		myscan.close();
	}
}
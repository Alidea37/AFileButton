package AFileButton;

import java.io.*;
import java.util.Scanner;
import java.nio.file.*;

public class Aristotle {
	public static void myAristotle() throws IOException{
		Scanner myreader;
		Scanner myscan = new Scanner(System.in);
		
		
		myreader = new Scanner(Paths.get("Stotlelog.txt"));
	
		String ethicsA[];
		ethicsA = new String[10];
		
		
		int i=0;
		
		while (myreader.hasNext()) {
			ethicsA[i] = myreader.nextLine();
			i=i+1;
		}
			//prints forward
				for (int j=0; j<i; j++) {
					System.out.printf("%n" + ethicsA[j]);	
		}
				{		// prints backward
					for (int c = ethicsA.length-1; c>=0; c--){
							System.out.println(ethicsA[c]);
				}
					System.out.println("Aristotle");
		
		myreader.close();
		myscan.close();
				}
			}
	}


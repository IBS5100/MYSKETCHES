import java.util.*;
import java.lang.*;
import java.io.*;

public class ProjectedGrade {
	public static void main(String[] args) {
		List <File> gradeFiles = GetGrades.getGradeFiles();
		double[] score = new double[25];		
		boolean needsChecking = true;
		int j = 0;
		
		try {				
			for(File f: gradeFiles) {
				Scanner sc = new Scanner(new FileReader(f));
				needsChecking = true;
				
				while(sc.hasNext() && needsChecking) {
					String newLine = sc.nextLine();
					
					if(newLine.contains("/10")) {
						String[] splitLine = newLine.split("\\s");
						
						for(int i = 0; i < splitLine.length; i++) {
							if(splitLine[i].contains("/10")) {
								score[j] = Double.valueOf(splitLine[i].substring(0, splitLine[i].indexOf("/")));
								needsChecking = false;
							}
						}
						
						j++;
					}
				}
			}
			
			double avg = 0;
			
			for(double d: score) {
				//System.out.println(d);
				
				avg += d;
			}
			
			avg /= 25;
			
			//System.out.println("AVG = "+avg);
			
			avg *= 10;
			avg *= .75;
			
			System.out.print("ENTER YOUR DESIRED FINAL GRADE IN COM_1300: ");
			Scanner scan = new Scanner(System.in);
			double desiredGrade = scan.nextDouble();
			
			double requiredGrade = (desiredGrade - avg) / .25;
			
			System.out.printf("YOU WILL NEED A GRADE OF %.2f ON YOUR FINAL%n", requiredGrade);
		}
		
		catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
	}
}
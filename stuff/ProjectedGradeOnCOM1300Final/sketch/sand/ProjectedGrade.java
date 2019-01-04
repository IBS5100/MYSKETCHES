import java.util.*;
import java.lang.*;
import java.io.*;

public class ProjectedGrade {
	public static void main(String[] args) {
		List <File> gradeFiles = GetGrades.getGradeFiles();
		double[] hwScores = new double[20];	
		double[] labScores = new double[5];
		boolean needsChecking = true;
		int j = 0;
		int k = 0;
		
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
								if(GetGrades.isLab.get(f)) {
									labScores[k] = Double.valueOf(splitLine[i].substring(0, splitLine[i].indexOf("/")));
									k++;
								}
								
								if(! GetGrades.isLab.get(f)) {
									hwScores[j] = Double.valueOf(splitLine[i].substring(0, splitLine[i].indexOf("/")));
									j++;
								}
								
								needsChecking = false;
							}
						}
					}
				}
			}
			
			double avgHW = 0;
			
			for(double d: hwScores) {
				avgHW += d;
			}
			
			double avgLab = 0;
			
			for(double d: labScores) {
				avgLab += d;
			}
			
			avgHW /= 20;
			avgHW *= .65;
			avgHW *= 10;
			
			avgLab /= 5;
			avgLab *= .1;
			avgLab *= 10;
			
			System.out.print("ENTER YOUR DESIRED FINAL GRADE IN COM_1300: ");
			Scanner scan = new Scanner(System.in);
			double desiredGrade = scan.nextDouble();
			
			double requiredGrade = (desiredGrade - avgHW - avgLab) / .25;
			
			double maxGrade = 25 + avgHW + avgLab;
			
			System.out.printf("YOU WILL NEED A GRADE OF %.2f ON YOUR FINAL%n", requiredGrade);
			System.out.printf("ASSUMING NO EXTRA-CREDIT ON THE FINAL, THE HIGHEST POSSIBLE GRADE IS %.2f%n", maxGrade);
		}
		
		catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
	}
}
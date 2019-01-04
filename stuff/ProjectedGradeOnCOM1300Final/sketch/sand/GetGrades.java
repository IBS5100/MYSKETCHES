import java.util.*;
import java.lang.*;
import java.io.*;

public class GetGrades {
	private static File[] files = new File("C:/Users/SP513/MYGIT/IntroToCompSci/assignments/").listFiles();
	public static Map <File, Boolean> isLab = new HashMap <File, Boolean> ();
	private static List <File> gradeFiles = new ArrayList <File> ();
	
	private GetGrades() {}

	private static void findGradeFiles(File[] files) {
		for(File f: files) {
			if(f.isDirectory()) {
				findGradeFiles(f.listFiles());
			}
			
			else {
				if(f.getName().startsWith("grade") && f.getName().endsWith(".txt")) {
					gradeFiles.add(f);
					
					determineAssignmentType(f);
				}
			}
		}
	}
	
	private static void determineAssignmentType(File f) {
		if(f.getName().contains("CelsiusToFahrenheit")) {
			isLab.put(f, true);
		}
		
		else if(f.getName().contains("GuessMyNumber")) {
			isLab.put(f, true);
		}
		
		else if(f.getName().contains("IterativeFactorial")) {
			isLab.put(f, true);
		}
		
		else if(f.getName().contains("RefactoredFactorial")) {
			isLab.put(f, true);
		}
		
		else if(f.getName().contains("DesignForInheritance")) {
			isLab.put(f, true);
		}
		
		else {
			isLab.put(f, false);
		}
	}
	
	public static List <File> getGradeFiles() {
		findGradeFiles(files);
		
		if(gradeFiles.size() == 25) {
			return gradeFiles;
		}
		
		else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		getGradeFiles();
		
		for(File gF: gradeFiles) {
			System.out.println(gF.getName());
		}
	}
}
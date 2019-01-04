import java.util.*;
import java.lang.*;
import java.io.*;

public class GetGrades_Version_1 {
	static List <File> gradeFiles = new ArrayList <File> ();
	
	public static void main(String[] args) {
		File[] files = new File("C:/Users/SP513/MYGIT/IntroToCompSci/assignments/").listFiles();
		
		getGradeFiles(files);
		
		if(gradeFiles.size() == 25) {
			for(File gF: gradeFiles) {
				System.out.println(gF.getName());
			}
		}
		
		else {
			throw new RuntimeException("UNEXPECTED NUMBER OF FILES!");
		}
	}

	public static void getGradeFiles(File[] files) {
		for(File f: files) {
			if(f.isDirectory()) {
				getGradeFiles(f.listFiles());
			}
			
			else {
				if(f.getName().startsWith("grade") && f.getName().endsWith(".txt")) {
					gradeFiles.add(f);
				}
			}
		}
	}
}
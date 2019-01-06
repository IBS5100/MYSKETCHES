package sketch.sand;

import java.lang.*;
import java.util.*;
import java.io.*;

public class RemoveNewline {
	public static void main(String[] args) {
		try {
			File file = new File("TxtToProcess.txt");
			Scanner sc = new Scanner(new FileReader(file));
			PrintStream ps = new PrintStream(file);
			
			String str = "";
			
			while(sc.hasNext()) {
				str = str.concat(sc.nextLine().concat(" "));
			}
			
			str.replace("\\s", " ");
			
			ps.println(str);
		}
		
		catch(Exception e) {
			System.exit(0);
		}
	}
}
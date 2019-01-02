package sketch.sand;

import java.util.*;
import java.lang.*;

public class MethodChain {
	public static void main(String[] args) {
		String str = "           ";
		
		if(str.trim().isEmpty()) {
			System.out.println("success");
			System.exit(1);
		}
		
		else {
			System.out.println("failure");
			System.exit(1);
		}
	}
}
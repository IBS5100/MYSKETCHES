package sketch.sand;

import java.util.*;
import java.lang.*;

public class TestingTheorem {
	public static void main(String[] args) {
		SquaringPrimes sp = new SquaringPrimes();
		Scanner sc = new Scanner(System.in);

		sp.testPrime(sc.nextLong());
		/*for(long i = 0; i < 50; i++) {
			try {
				sp.testPrime(i);
			}

			catch(Exception e) {
				continue;
			}		
		}*/
	}
}
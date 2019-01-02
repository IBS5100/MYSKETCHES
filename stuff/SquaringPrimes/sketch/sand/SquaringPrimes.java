package sketch.sand;

import java.util.*;
import java.lang.*;

public class SquaringPrimes {
	public SquaringPrimes() {}

	public boolean testPrime(final long input) {
		if(! isPrime(input)) {
			throw new IllegalArgumentException("NON-PRIME INPUT");
		}

		return isMultipleOfTwentyFour(input);
	}

	private boolean isPrime(long input) {
		if(input < 2) {
			return false;
		}

		int i = 2;
		while(i < input) {
			if(input % i == 0) {
				return false;
			}

			i++;
		}

		return true;
	}

	private boolean isMultipleOfTwentyFour(long input) {
		long dummyVal = input * input;

		System.out.println("\nConducting test:\n... input == "+input);		
		System.out.println("... input squared == "+dummyVal);
		dummyVal--;
		System.out.println("... minus one == "+dummyVal);
		long modDummy = dummyVal % 24;
		System.out.println("... mod 24 == "+modDummy);

		if(modDummy == 0) {
			System.out.println("... THEOREM SUCCESS!");
			return true;
		}

		System.out.println("... THEOREM FAILURE!!!");
		return false;
	} 
}
package sketch.orca;

import java.util.*;
import java.lang.*;

public enum SqSum {
	Arrange;

	private int[] num = new int[15];

	private SqSum() {}

	private String sequence() {

	}

	private int[] pairNum(final int num) {
		int i = 0;

		if(num < 4) {
			int num4 = 4 - num;
			i++;
		}

		if(num < 9) {
			int num9 = 9 - num;
			i++;
		}

		int num16 = 16 - num;
		i++;

		if(num > 9) {
			int num25 = 25 - num;
			i++;
		}
		
		int[] matches = new int[i];

		
	}

	private boolean checkIfSqSum(final int num1, final int num2) {
		int num3 = num1 + num2;

		switch(num3) {
			case 4: return 
		}
	}

	@Override
	public String toString() {
		return 
	} 
}
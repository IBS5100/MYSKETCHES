package sketch.sand;

import java.util.*;
import java.lang.*;
import java.io.*;

public class IntegerClass {
	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList <Integer> ();
		
		list.add(23);
		list.add(17);
		list.add(0);
		
		int answer = 0;
		
		for(Integer i: list) {
			answer += i;
		}
		
		answer++;
		answer++;
		
		System.out.println(answer);
	}
}
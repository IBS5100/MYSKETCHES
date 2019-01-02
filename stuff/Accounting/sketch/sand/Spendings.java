package sketch.sand;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Spendings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File f;
		PrintStream ps;
		List <Entry> entries = new ArrayList <Entry> ();
		String means = "";
		
		System.out.print("PLEASE ENTER '1' IF YOU WISH TO RECORD A GENERAL TRANSACTION,\n'2' IF YOU WISH TO RECORD A ONE-CARD TRANSACTION: ");
		int input = sc.nextInt();
		
		if(input == 1) {
			try {
				f = new File("spendings.txt");
				means = "GENERAL";
			}
			
			catch(NullPointerException npe) {
				throw npe;
			}			
		}
		
		else if(input == 2) {
			try {
				f = new File("onecard.txt");
				means = "ONE-CARD";
			}
			
			catch(NullPointerException npe) {
				throw npe;
			}
		}
		
		else {
			throw new IllegalArgumentException("PLEASE ENTER '1' or '2'");
		}
		
		System.out.print("\nPlease enter the date (MM-DD-YY): ");
		String date = sc.next();
		
		System.out.print("Please enter the amount spent: ");
		double amt = sc.nextDouble();
		
		System.out.print("Please enter the purchase: ");
		String purchase = sc.next().concat(sc.nextLine());

		Entry newEntry = new Entry(date, amt, purchase);
		
		try {
			Scanner scanner = new Scanner(new FileReader(f));
			
			while(scanner.hasNext()) {
				String line = scanner.nextLine();
				
				entries.add(new Entry(line));
				
				if(scanner.hasNext()) {
					scanner.nextLine();
				}
			}
			
			entries.add(newEntry);
			
			ps = new PrintStream(f);
			
			for(Entry e: entries) {
				ps.println(e+"\n");
			}
			
			double spendings = 0;
			
			for(Entry e: entries) {
				spendings += e.getFinancial();
			}
			
			System.out.println("\nYOUR TOTAL "+means+" SPENDINGS ARE $"+spendings);
			
			String[] dateSplit = date.split("-");
			List <Entry> monthly = new ArrayList <Entry> ();
			
			for(Entry e: entries) {
				if(e.getMonthFinancial(dateSplit[0], dateSplit[2])) {
					monthly.add(e);
				}
			}
			
			double monthlySpendings = 0;
			
			for(Entry e: monthly) {
				monthlySpendings += e.getFinancial();
			}
			
			System.out.println("YOUR TOTAL "+means+" SPENDINGS FOR THE MONTH ARE $"+monthlySpendings);
		}
		
		catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
	}
}
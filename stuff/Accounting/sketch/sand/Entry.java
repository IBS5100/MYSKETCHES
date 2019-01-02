package sketch.sand;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Entry {
	private String date, amount, purchase;
	private String oldRemain;
	private double financial;
	private boolean isNew;
	
	public Entry(final String date, final double amount, final String purchase) {
		this.date = date;
		this.amount = String.valueOf(amount);
		this.purchase = purchase;
		this.financial = amount;
		this.isNew = true;
	}
	
	public Entry(final String input) {
		this.oldRemain = input;
		this.financial = Double.valueOf(input.substring(input.indexOf("$") + 1, input.indexOf("$") + 14).trim());
		this.isNew = false;
		
		if(! input.trim().isEmpty()) {
			String[] tokens = input.split("\\s");
			this.date = tokens[0];
		}
	}
	
	public boolean getMonthFinancial(final String mm, final String yy) {
		String[] dateSplit = date.split("-");
		
		return mm.equals(dateSplit[0]) && yy.equals(dateSplit[2]);
	}
	
	public double getFinancial() {
		return financial;
	}
	
	@Override
	public String toString() {
		if(isNew) {
			return String.format("%-17s$%-17s%s", date, amount, purchase);
		}
		
		else {
			return oldRemain;
		}
	}
	
}
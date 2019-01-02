package sketch.sand;

public class Format {
	public static void main(String[] args) {
		String str1 = "apple";
		String str2 = "banana";
		String str3 = "orange";
		
		String str5 = "big";
		String str6 = "fluffy";
		String str7 = "unicorns";
		
		String str4 = String.format("%-15s%-15s%-15s", str1, str2, str3);
		String str8 = String.format("%-15s%-15s%-15s", str5, str6, str7);
		
		System.out.println(str4+"\n");
		System.out.println(str8+"\n");
	}
}
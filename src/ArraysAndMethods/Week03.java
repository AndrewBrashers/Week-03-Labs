package ArraysAndMethods;
public class Week03 {
	public static void main(String[] args) {
		Ages();
		Names();
		System.out.println(Number7("Andrew", 4));
		System.out.println(Number8("Andrew", "Brashers"));
		int[] test = {3, 9, 23, 64, 2, 8, 28, 93, 105};
		System.out.println(Number9(test));
		double[] test2 = {10.2, 9.5, 3.1, 7.6, 2};
		System.out.println(Number10(test2));
		double[] test3 = {10.2, 9.5, 3.1, 7.6, 2};
		double[] test4 = {10.2, 9.5, 3.1, 7.6, 100};
		System.out.println(Number11(test3, test4));
		System.out.println(willBuyDrink(true, 10.51));
		System.out.println(Number13("Andrew"));
		
	}
	
	private static void Ages() {
		int[] Ages = {3, 9, 23, 64, 2, 8, 28, 93, 105};
		int avg = 0;
		System.out.println(Ages[Ages.length - 1] - Ages[0]);

		for(int e: Ages) 
		{
			avg = avg + e;	
		}
		System.out.println(avg/Ages.length);
	}
	
	private static void Names() {
		String[] Names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		double avg = 0;
		String Name = "";

		for(String e: Names) 
		{
			avg = avg + e.length();	
		}
		System.out.println(avg/Names.length);
		for(String e: Names) 
		{
			Name = Name + " " + e;	
		}
		System.out.println(Name.trim());
		System.out.println("3.  You access the last element of any array with array.length.");
		System.out.println("4.  You access the first element of any array with array[0].");
		//5.
		int[] nameLengths =new int[Names.length];
		
		for(int i = 0; i<Names.length; i++) 
		{
			nameLengths[i] = Names[i].length();
			
		}
		int s = 0;
		for(int e: nameLengths) 
		{
			s = s + e;
		}
		System.out.println("6.  " + s);

	}

	private static String Number7(String word, int n) {
		String val = "";
		for(int i = 0; i<n; i++) 
		{
			val = val + word;
			
		}
		return val;
	}
	
	private static String Number8(String fName, String lName ) {
		return fName + " " + lName;
	}
	
	private static Boolean Number9(int[] vals) {
		int s = 0;
		for(int e: vals) 
		{
			s = s + e;
		}
		return s>100;
	}
	
	private static Double Number10(double[] d) {
		double avg = 0;

		for(double e: d) 
		{
			avg = avg + e;	
		}
	
		return avg/d.length;
	}
	
	private static Boolean Number11(double[] a, double[] b) {
		return Number10(a)>Number10(b);
	}
	
	private static Boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		//Number12
		return isHotOutside && moneyInPocket > 10.5;
	}
	
	private static String Number13(String val) {
		//This reverses the input string.
		/*
		  I wanted to play with StringBuilders.
		 */
		StringBuilder test = new StringBuilder();
		test.append(val);
		return test.reverse().toString();
	}
}
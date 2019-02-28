package Question2;

public class Main {

	public static void main(String[] args) {
		Sort s = new Sort();
		
		// Sort Integer from small to big
		Integer[] in = {3,2,5,1,8,8,9,2};
		s.sort(in, new IntegerComparator());
		for (Integer integer : in) {
			System.out.println(integer);
		}
		
		System.out.println();
		
		// Sort String by alphabet
		String[] st = {"Bird", "Ant", "Horse", "Dog", "Zebra"};
		s.sort(st, new StringComparator());
		for (String string : st) {
			System.out.println(string);
		}
		
		System.out.println();
		
		
		// Sort color by length of color name, but if the length 
		// is the same then sort by alphabetical order.
		Color c1 = new Color("Black");
		Color c2 = new Color("Orange");
		Color c3 = new Color("Brown");
		Color c4 = new Color("Red");
		Color[] c = {c1,c2,c3,c4};
		s.sort(c, new ColorComparator());
		for (Color color : c) {
			System.out.println(color.getColor());
		}
	}

}

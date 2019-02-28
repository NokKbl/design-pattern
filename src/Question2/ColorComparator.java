package Question2;

import java.util.Comparator;

public class ColorComparator implements Comparator<Color> {

	@Override
	public int compare(Color o1, Color o2) {
		if(o1.getColor().length() > o2.getColor().length()) return 1;
		else if(o1.getColor().length() < o2.getColor().length()) return -1;
		else return o1.getColor().compareTo(o2.getColor());
	}

}

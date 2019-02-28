package katas.romannumerals;

import java.util.TreeMap;

/**
 * This class is just your entry point for this kata. It can be modified or
 * deleted as you like.
 *
 */
public class Entry {

	public String convertToRoman(int number) {
		
		if (number > 0 && number <= 4000) {

			final TreeMap<Integer, String> map = new TreeMap<Integer, String>();
			map.put(1000, "M");
			map.put(900, "CM");
			map.put(500, "D");
			map.put(400, "CD");
			map.put(100, "C");
			map.put(90, "XC");
			map.put(50, "L");
			map.put(40, "XL");
			map.put(10, "X");
			map.put(9, "IX");
			map.put(5, "V");
			map.put(4, "IV");
			map.put(1, "I");
			int l = map.floorKey(number);
			System.out.println("floorKey" + l);
			if (number == l) {
				return map.get(number);
			}
			return map.get(l) + convertToRoman(number - l);

		} else {
			return "Not a valid number for Roman Numeral conversion";
		}
	}

}

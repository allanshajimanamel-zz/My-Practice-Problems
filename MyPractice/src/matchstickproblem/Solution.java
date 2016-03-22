package matchstickproblem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int _lengths_size = Integer.parseInt(in.nextLine());
		int[] _lengths = new int[_lengths_size];
		int _lengths_item;
		for (int _lengths_i = 0; _lengths_i < _lengths_size; _lengths_i++) {
			_lengths_item = Integer.parseInt(in.nextLine());
			_lengths[_lengths_i] = _lengths_item;
		}

		cutSticks(_lengths);

	}

	static void cutSticks(int[] lengths) {

		Arrays.sort(lengths);

		ArrayList<Integer> sortedLengths = new ArrayList<Integer>();

		for (int i = 0; i < lengths.length; i++) {
			sortedLengths.add(Integer.valueOf(lengths[i]));
		}

		int index = 0;
		int cut = 0;
		Integer i = sortedLengths.get(0);
		while (sortedLengths.size() > 0) {
			cut++;
			if (sortedLengths.get(index) == i) {
				sortedLengths.remove(index);
			} else {
				sortedLengths.set(index, sortedLengths.get(index) - i);
				index++;
			}
			if (index >= sortedLengths.size()) {
				System.out.println(cut);
				cut = 0;
				index = 0;
				if (sortedLengths.size() == 0) {
					break;
				} else {
					i = sortedLengths.get(0);
				}
			}
		}
	}
}

package gradebook;
public class Gradebook {
	private int[] studentScores;

	private String[] studentLetters;

	// postcondition: returns -1.0 if letterGrade does not appear in
	// studentLetters

	// otherwise, returns average of all studentScores[n],

	// for all 0 <= n < studentScores.length, such that

	// studentLetters[n] is equal to letterGrade

	public double letterAverage(String letterGrade) {
		int count = 0;
		double result = 0.0;
		boolean found = false;
		int sum = 0;
		for (int i = 0; i < studentScores.length; i++) {
			if (studentLetters[i].equalsIgnoreCase(letterGrade)) {
				sum += studentScores[i];
				count++;
				found = true;
			}
		}
		result = sum / count;
		if (found) {
			return result;
		} else {
			return -1.0;
		}
	}
}

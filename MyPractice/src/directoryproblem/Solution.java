package directoryproblem;
import java.util.ArrayList;

public class Solution {

	//	public static void main(String args[]) {
	//		solution("");
	//	}

	//	public static int solution(String S) {
	public int solution(String S) {

		//		String[] tokens = "dir1\n dir11\n dir12\n  picture.jpeg\n  dir121\n   file.txt\ndir2\n file2.gif"
		//				.split("\n");
		String[] tokens = S.split("\n");
		int size = 0;
		int maxSize = 0;
		ArrayList<Integer> lvlSize = new ArrayList<Integer>();

		for (String token : tokens) {
			if (!token.startsWith(" ")) {
				size = token.length() + 1;
				lvlSize = new ArrayList<Integer>();
				lvlSize.add(size);
			} else if (token.startsWith(" ")) {
				int numWhiteSpaces = countLevel(token);
				if (token.lastIndexOf('.') == -1) {
					if (lvlSize.size() > numWhiteSpaces) {
						size = lvlSize.get(numWhiteSpaces - 1)
								+ token.trim().length() + 1;
						lvlSize.set(numWhiteSpaces, size);
					} else {
						size = lvlSize.get(lvlSize.size() - 1)
								+ token.trim().length() + 1;
						lvlSize.add(size);
					}
				} else {
					String ext = token.substring(token.lastIndexOf('.'),
							token.length());
					if (ext.equals(".gif") || ext.equals(".jpeg")
							|| ext.equals(".png")) {
						int newSize = lvlSize.get(numWhiteSpaces - 1)
								+ token.trim().length() + 1;
						if (newSize > maxSize) {
							maxSize = newSize;
						}
					}
				}
			}
		}
		return maxSize;
	}

	//	public static int countLevel(String token) {
	public int countLevel(String token) {
		int num = 0;
		char[] tokens = token.toCharArray();

		for (char t : tokens) {
			if (t == ' ') {
				num++;
			} else {
				break;
			}
		}
		return num;
	}
}

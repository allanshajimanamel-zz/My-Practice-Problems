package shortestpathproblem;

public class Solution {

	static String[] optimalRelativePath(String[] paths) {
		int x = 0;
		int y = 0;
		try {
			for (int i = 0; i < paths.length; i = i + 2) {

				String path = paths[i];
				try {
					if(path.equals("U"))
						y += Integer.parseInt(paths[i + 1]);
					else if(path.equals("D"))
						y -= Integer.parseInt(paths[i + 1]);
					else if(path.equals("R"))
						x += Integer.parseInt(paths[i + 1]);
					else if(path.equals("L"))
						x -= Integer.parseInt(paths[i + 1]);
					else
						return new String[0];
				} catch (NumberFormatException e) {
					return new String[0];
				}
			}
		} catch (IndexOutOfBoundsException e) {
			return new String[0];
		}

		if (x == 0 && y == 0) {
			return new String[0];
		}

		String xdir = "";
		String xval = "";
		String ydir = "";
		String yval = "";

		if (x > 0) {
			xdir = "R";
			xval = String.valueOf(x);
		} else {
			xdir = "L";
			xval = String.valueOf(Math.abs(x));
		}
		if (y > 0) {
			ydir = "U";
			yval = String.valueOf(y);
		} else {
			ydir = "D";
			yval = String.valueOf(Math.abs(y));
		}

		String[] result = new String[4];
		int count = 0;
		if (!ydir.equals("")) {
			result[count] = ydir;
			count++;
			result[count] = yval;
			count ++;
		}
		if (!xdir.equals("")) {
			result[count] = xdir;
			count ++;
			result[count] = xval;
		}

		return result;
	}


	public static void main(String args[]) {
		//		1U2R3L2D8
		String[] input = {"U","2","R","3","L","2","D","8"};
		String[] result=optimalRelativePath(input);
		for(String output: result){
			System.out.println(output);
		}
	}
}

package presortednodelistproblem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] vals = new String[0];
		try {
			vals = br.readLine().split(" ");
		} catch (IOException e) {
			e.printStackTrace();
		}

		NodeList list = new NodeList();
		for (String val : vals) {
			list.add(new Node(Integer.parseInt(val)));
		}

		for (Node node : list) {
			System.out.println(node.value);
		}
	}
}
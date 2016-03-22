package presortednodelistproblem;
import java.util.Comparator;

class NodeComparator implements Comparator<Node> {

	@Override
	public int compare(Node o1, Node o2) {
		if (o1.value == o2.value)
			return 0;
		else if (o1.value > o2.value)
			return 1;
		else
			return -1;
	}

}

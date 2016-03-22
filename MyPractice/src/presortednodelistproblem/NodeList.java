package presortednodelistproblem;
import java.util.ArrayList;

class NodeList extends ArrayList<Node>
{
	@Override
	public boolean add(Node e){
		boolean result;
		result = super.add(e);

		quickSort(this, 0, this.size()-1);
		//		sort(new NodeComparator());
		return result;
	}

	public static void quickSort(ArrayList<Node> arr, int low, int high) {
		if (arr == null || arr.size() == 0)
			return;

		if (low >= high)
			return;

		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr.get(middle).value;

		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr.get(i).value < pivot) {
				i++;
			}

			while (arr.get(j).value > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = arr.get(i).value;
				arr.get(i).value = arr.get(j).value;
				arr.get(j).value = temp;
				i++;
				j--;
			}
		}

		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);

		if (high > i)
			quickSort(arr, i, high);
	}
}
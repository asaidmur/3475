
public class InsertionSort {

	public static void main(String[] args) {

		int[] a = {100,12,31, 53, 4, 3, 22, 1 };
		insertionSort(a);
		for (int i : a) {
			System.out.println(i);
		}
	}

	public static void insertionSort(int[] array) {
		int key;
		int temp;
		for (int k = 1; k < array.length; k++) {
			 	int j = k - 1;
		        while (j >= 0 && array[j] > array[k] )
		        {
		            temp = array[k];
		            array[k] = array[j];
		            array[j] = temp;
		            k=j;
		            j--;

		        }
		}
	}
}

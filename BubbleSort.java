import java.util.Random;

public class BubbleSort {
	static int temp;

	public static void main(String[] args) {

		bubbleSort(generateArray(5));
	}

	public static void bubbleSort(int[] list) {
		for (int i = 0; i < list.length - 1; i++) {

			for (int j = 1; j < (list.length - i); j++) {

				if (list[j - 1] > list[j]) {
					temp = list[j - 1];
					list[j - 1] = list[j];
					list[j] = temp;
				}

			}
		}

		for (int i : list) {
			System.out.println(i);
		}
	}

	public static int[] generateArray(int size) {

		int[] array = new int[size];
		for (int i = 0; i < array.length; i++) {
			Random rand = new Random();
			array[i] = rand.nextInt(100) + 1;
		}
		return array;
	}

}

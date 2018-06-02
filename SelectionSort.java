
public class SelectionSort {

	
	public static void main(String[] args) {
		int[] array =new int[]{ 1,12,43,46,5,69,78,48,9,10 }; 
		sort(array);
		
	}
	
	public static void sort(int arr[]) {
		int length = arr.length;
		int position;
		int temp;
		
		
		for (int i = 0; i < arr.length -1; i++) {
			position = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[position]) {
					position = j;
				}
			}
			
//			swap 
			temp = arr[i];
			arr[i] = arr[position];
			arr[position] = temp;
			
		}

		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	
	
	
	
	
	
	public static int[] selectionSort() {
		int[] list = null;
		int temp;
		int minIndex;
		int minValue;
		
		
		
		
		
		return list;
	}
}


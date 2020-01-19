import java.util.Arrays;

public class SelectionSort {
	
// selection sort -- My own implementation	
	public static int[] selectionSort(int[] arr) {
		
		int indexOfmin=0;
		int minC=0;
		for (int i=0; i < arr.length;i++) {
			int min = Integer.MAX_VALUE;
			for (int j=i; j < arr.length;j++) {
				if (arr[j] < min) {
					min = arr[j];
					indexOfmin = j;
				}
			}
			//System.out.println("Printing value min of "+arr[indexOfmin]);
			int temp = arr[indexOfmin];
			arr[indexOfmin] = arr[minC];
			arr[minC] = temp;
			minC++;
			//System.out.println("Inner "+Arrays.toString(arr));
			
		}
		System.out.println(Arrays.toString(arr));
		return arr;
		
	}
	public static void main(String[] args) {
		int[] arr = {21,84,2,52,22,1,18,44,13};
		SelectionSort.selectionSort(arr);
		
	}

}

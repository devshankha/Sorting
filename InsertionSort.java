import java.util.Arrays;

/*
 * Sort an array of 0s,1s and 2s
 */
public class InsertionSort {
	//my own implementation of insertion sort
	public static int[] insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			System.out.println("Printing the val " + a[i] + " " + i);
			int j = i;
			while (j >= 1 && a[j] < a[j - 1]) {
				int t = a[j];
				a[j] = a[j - 1];
				a[j - 1] = t;
				j--;
			}
		}
		System.out.println(Arrays.toString(a));
		return a;

	}
	//My own implementation of binary search
	public static int BinarySearch(int arr[],int n,int low, int high) {
		if (low== high) {
			if (n == arr[low])
				return low;
			return -1;
			
		}
		
		int mid = (low+high)/2;
		if (n == arr[mid])
			return mid;
		if (n < arr[mid])
			return BinarySearch(arr, n, low, mid-1);
		else
		
			return BinarySearch(arr, n, mid+1,high);
		
		
		
	}
  //implementation of binary insertion sort
	public static int[] BinaryinsertionSort(int[] a) {

		for (int i = 1; i < a.length; i++) {
			int x = a[i];
			/**https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#binarySearch(byte[],%20byte)
             
             *
             *see javadocs for this method Arrays.binarySearch
             */
			// Find location to insert using binary search
			int j = Math.abs(Arrays.binarySearch(a, 0, i, x) + 1);
			System.arraycopy(a, j, a, j+1, i-j); 
			//System.out.println("Printing the index "+j+" "+j1);
			//System.out.println(" Printing the val "+Arrays.toString(a)+" "+i+" val "+x+" "+j1);

			// Shifting array to one location right
			
			

			// Placing element at its correct location
			a[j] = x;
			
		
		}
		System.out.println(Arrays.toString(a));
		return a;

	}

	public static void main(String[] args) {
		int k[] = { 3,8,13,14,5 };
		InsertionSort.BinaryinsertionSort(k);
		//int m = Arrays.binarySearch(k, 21);
		//System.out.println(Arrays.binarySearch(k,0,2,3));
		//int a = 9;
		//System.out.println(a/2);
		//int a[] = {3,5,10,11,14,15};
		//int c = Math.abs(Arrays.binarySearch(a, 0,5,4)+1);
		//System.out.println(c);
		//int c1 =Arrays.binarySearch(a, 0,5,4);
		//System.out.println(c1);
		//InsertionSort.BinaryinsertionSort(k);

	}

}

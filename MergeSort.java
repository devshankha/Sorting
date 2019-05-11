import java.util.Arrays;

public class MergeSort {
	static int aux[] = new int[3];
	static void mergeSort(int arr[],int lowerBound,int upperBound) {
		if (lowerBound == upperBound)
			return;
		int mid= (lowerBound+upperBound)/2;
		mergeSort(arr, lowerBound, mid);
		mergeSort(arr, mid+1, upperBound);
		merge(arr,lowerBound,mid+1,upperBound);
		
		
	}

	static void merge(int arr[], int lowPtr, int highPtr,int upperBound) {
		System.out.println("Calling with lower "+lowPtr+" and upper "+highPtr+" bound "+upperBound);
		int j=0;
		int lowerBound = lowPtr;
		int mid = highPtr-1;
		int n= upperBound-lowerBound+1;
		while (lowPtr <= mid && highPtr <= upperBound) {
			if (arr[lowPtr] < arr[highPtr])
				aux[j++]= arr[lowPtr++];
			else
				aux[j++] = arr[highPtr++];
		}
		while (lowPtr <= mid)
			aux[j++] = arr[lowPtr++];
		while (highPtr <= upperBound)
			aux[j++] = arr[highPtr++];
		
		for (j=0; j < n;j++)
			arr[lowerBound+j] = aux[j];
		
	
			
		

	}

	public static void main(String[] args) {
		int a[]= {11,7,4};
		mergeSort(a, 0,a.length-1);
		System.out.println(Arrays.toString(aux));
		

	}

}

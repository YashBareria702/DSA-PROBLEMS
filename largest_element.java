class Largest_Element {	
	void insertionSort(int []arr) {
		int n = arr.length;
		for(int i = 1; i<n; i++) {
			int key = arr[i], j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
	public static void main(String[] args) {
		int[] arr = {2,4,5,1,3};
		int largest = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
			
		}
		System.out.println("The largest element in the array is: "+ largest);
//		Largest_Element w = new Largest_Element();
//		w.insertionSort(arr);
//		System.out.println("The largest element in the array is: "+ arr[arr.length-1]);
		
		
		
		
	}

}
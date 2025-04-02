class second_largest {
    //	void insertionSort(int []arr) {
    //		int n = arr.length;
    //		for(int i = 1; i<n; i++) {
    //			int key = arr[i], j = i-1;
    //			while(j>=0 && arr[j]>key) {
    //				arr[j+1] = arr[j];
    //				j = j-1;
    //			}
    //			arr[j+1] = key;
    //		}
    //	}
    //	public static void main(String[] args) {
    //		int[] arr = {2,4,5,1,6};
    //		Second_largest sc = new Second_largest();
    //		sc.insertionSort(arr);
    //		System.out.println("The second largest element in the array is: "+ arr[arr.length - 2]);
    //	}
        public static void main(String[] args) {
            int[] arr = {2,4,5,1,6};
    //	 if (arr.length < 2) {
    //         System.out.println("Array must have at least two elements!");
    //         return;
    //     }
    
         int largest = 0;
         int secondLargest = 0;
    
         for (int num : arr) {
             if (num > largest) {
                 secondLargest = largest; // Update second largest
                 largest = num; // Update largest
             } else if (num > secondLargest && num != largest) {
                 secondLargest = num; // Update second largest if it's smaller than largest but greater than second largest
             }
         }
    
    //     if (secondLargest == Integer.MIN_VALUE) {
    //         System.out.println("No second largest element found!");
    //     } else {
             System.out.println("The second largest element is: " + secondLargest);
    //     }
        }
    
    }

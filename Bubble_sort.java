class Bubble_sort {
    public static void bubblesort(int[]arr){
        for(int i=0;i<arr.length; i++){
            for(int j=0 ; j<arr.length-1-i;j++){
                if( arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        int[] arr ={8,2,9,1,4,3};
        System.out.print("Unsorted array:");
        for (int num:arr){
            System.out.print(num + " ");
        }

        bubblesort(arr);

        System.out.print("\nSorted array:");
        for (int res:arr){
            System.out.print(res + " ");
        }

    }
    
}

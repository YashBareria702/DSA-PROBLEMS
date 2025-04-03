import java.util.Scanner;

class Merge_sort {
    public static void mergeSort(int []arr,int si,int end){
        if (si>=end)
            return;
        int mid = (si+end)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,si,mid,end);    
    }
    public static void merge (int[]arr, int si,int mid,int end){
        int [] temp = new int[end-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k++]= arr[i++];

            }else{
                temp[k++]= arr[j++];
            }
        }
        while(i<=mid){
            temp[k++]= arr[i++];
        }
        while(j<=end){
            temp[k++]= arr[j++];
        }
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }    
    public static void printArray(int arr[]) {
        int n = arr.length;
        for(int i = 0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }System.out.println();

    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		mergeSort(arr, 0, arr.length-1);
		printArray(arr);
		sc.close();
		

    }
    
}

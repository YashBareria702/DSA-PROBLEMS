class findsmallestdivisor {
    public static int smallestdivisor(int[]arr,int threshold){
        int left =1;
        int right = getmax(arr);

        while(left<right){
            int mid = left + (right - left ) /2;
            int total=getsum(arr,mid);

            if(total>threshold){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return left;
    }
    public static int getmax(int[] arr){
        int max = arr[0];
        for(int a: arr){
            max = Math.max(max,a);
        }
        return max;
    }
    public static int getsum(int[] arr, int divisor){
        int sum = 0;
        for(int a : arr){
            sum+=(a+divisor-1)/divisor;
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr= {1,2,5,9};
        int threshold = 6;
        System.out.println(smallestdivisor(arr,threshold));

    }
}

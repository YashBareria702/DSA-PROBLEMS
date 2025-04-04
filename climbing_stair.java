class Climbing{
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        
        int prev = 1, curr = 2;
        for (int i = 3; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        
        return curr;
    }

    public static void main(String[] args) {
        Climbing climbing = new Climbing();
        System.out.println(climbing.climbStairs(5)); // Output: 8
    }
}

class Rotate_Image{
    public static void main(String[] args) {
        // printm(matx);
        int[][] matx = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rows = matx.length;
        int cols = matx[0].length;
        
        int[][] result = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                result[i][j] = matx[j][i];
            }
        }

    

        int[][] result2 = new int[cols][rows];
        for (int i = 0; i < matx.length; i++) {
            int rowlength = matx[i].length - 1; 
            int k = 0; 
            while (rowlength >= 0) {
                
                result2[i][k]=matx[i][rowlength];
                rowlength--;
                k++;
            }
            System.out.println();
        }
    
        
        
        
        for(int i = 0; i < rows; i++) {  
            for (int j = 0; j < cols; j++) {  
                System.out.print(result[i][j] + " "); 
            }
            System.out.println(); 
        }
    }
    
}
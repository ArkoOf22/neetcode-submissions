class NumMatrix {
int[][] matrix;
    public NumMatrix(int[][] matrix) {
        this.matrix=matrix;
        //Lets precompute the results and keep it in a separate array.
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               if(i==0 && j==0){
                continue;
               }
               else if(i==0 && j!=0){
                matrix[i][j]=matrix[i][j-1]+matrix[i][j];
               }
               else if(j==0 && i!= 0){
                matrix[i][j]=matrix[i-1][j]+matrix[i][j];
               }
               else{
                matrix[i][j]=(matrix[i][j-1]+matrix[i-1][j]+matrix[i][j])-matrix[i-1][j-1];
               }
            }
        }
         System.out.println(Arrays.deepToString(matrix));
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {

    int total = matrix[row2][col2];

    int top = (row1 > 0) ? matrix[row1 - 1][col2] : 0;

    int left = (col1 > 0) ? matrix[row2][col1 - 1] : 0;

    int overlap = (row1 > 0 && col1 > 0)
            ? matrix[row1 - 1][col1 - 1]
            : 0;

    return total - top - left + overlap;
}
}


/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.matrixRegion(row1,col1,row2,col2);
 */

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
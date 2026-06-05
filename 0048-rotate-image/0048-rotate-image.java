class Solution {
    void reverse(int[] arr){
        int l= 0;
        int r= arr.length - 1;
        while(l< r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        // Transpose
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Reverse each row
        for(int i=0;i<n;i++){
            reverse(matrix[i]);
        }
    }
}
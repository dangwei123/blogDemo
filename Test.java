给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第 k 小的元素。
请注意，它是排序后的第 k 小元素，而不是第 k 个不同的元素。
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int row=matrix.length;
        if(row==0) return 0;
        int col=matrix[0].length;
        int left=matrix[0][0];
        int right=matrix[row-1][col-1];
        while(left<right){
            int mid=left+(right-left)/2;
            int i=row-1;
            int j=0;
            int count=0;
            while(i>=0&&j<col){
                if(matrix[i][j]<=mid){
                    count+=(i+1);
                    j++;
                }else{
                    i--;
                }
            }
            if(count<k){
                left=mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }
}
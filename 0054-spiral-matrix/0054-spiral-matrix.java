class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans=new ArrayList<>();
        int n=matrix.length;
        int startrow=0;
        int startcol=0;
        int endrow=n-1;
        int endcol=matrix[0].length-1;

        while(startrow<=endrow&&startcol<=endcol){
            for(int i=startcol;i<=endcol;i++){
                ans.add(matrix[startrow][i]);
            }
            for(int i=startrow+1;i<=endrow;i++){
                ans.add(matrix[i][endcol]);
            }
            for(int i=endcol-1;i>=startcol;i--){
                if(startrow==endrow) break;
                ans.add(matrix[endrow][i]);
            }
            for(int i=endrow-1;i>startrow;i--){
                if(startcol==endcol) break;
                ans.add(matrix[i][startcol]);
            }
            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }
        return ans;

    }
}
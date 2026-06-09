class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        List<int[]> ans = new ArrayList<>();
        ans.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] last = ans.get(ans.size()-1);
            int[] curr = intervals[i];
            if(curr[0] <= last[1]){
                last[1] = Math.max(last[1], curr[1]);
            }else{
                ans.add(curr);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int [][] arr=new int [intervals.length+1][2];
        for(int i=0; i<intervals.length; i++){
            for(int j=0; j<2; j++){
                arr[i][j]=intervals[i][j];
            }
        }
            for(int j=0; j<2; j++){
                arr[intervals.length][j]=newInterval[j];
            }
        
        return merge(arr);
    }
}
class Solution {
    public boolean isValid(int mid,List<Integer> stock, List<Integer> cost, List<Integer> li ,int budget){
        long c=0;
        for(int i=0; i<li.size(); i++){
            c+=Math.max(0,((long)mid*(long)li.get(i)-(long)stock.get(i))*(long)cost.get(i));

        }
        return c<=budget;

    }
    public int maxNumberOfAlloys(int n, int k, int budget, List<List<Integer>> composition, List<Integer> stock, List<Integer> cost) {
        int max=-1;
        // int mod=10000000;
        for(List<Integer> li : composition){
            int low=0; int high=1000000000;
            int ans=0;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(isValid(mid,stock,cost,li,budget)){
                    ans=mid;
                    // System.out.println(ans);
                    low=mid+1;

                }else{
                    high=mid-1;
                }
            }
             max=Math.max(max,ans);
        }return max;
    }
}
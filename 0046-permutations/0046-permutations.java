class Solution {
    void fn(int ind ,int[]nums,boolean[]flag,List<Integer>ds,List<List<Integer>>ans){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0; i<nums.length; i++)
        if(!flag[i+10]){
            ds.add(nums[i]);
            flag[i+10]=true;
            fn(i+1,nums,flag,ds,ans);
            ds.remove(ds.size()-1);
            flag[i+10]=false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        boolean [] flag=new boolean[21];
        List<List<Integer>> ans=new ArrayList<>();
        fn(0,nums,flag,new ArrayList<>(),ans);
        return ans;

    }
}
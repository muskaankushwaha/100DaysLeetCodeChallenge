class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int [] ans =new int [2];
        int j=0;
        for(int i=1; i<nums.length; i+=2){
            if(nums[i]!=nums[i-1]){
                ans[j]=nums[i-1];
                j++;
                i--;
            }
        }
         if(j<2)
            ans[j]=nums[nums.length-1];
        return ans;
    }
}
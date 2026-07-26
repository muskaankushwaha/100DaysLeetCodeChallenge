class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int x=nums[0]*nums[1]*nums[n-1];
        int y=nums[0]*nums[1]*nums[2];
        int z=nums[n-1]*nums[n-2]*nums[n-3];
        int t=Math.max(x,y);
        return Math.max(t,z);
    }
}
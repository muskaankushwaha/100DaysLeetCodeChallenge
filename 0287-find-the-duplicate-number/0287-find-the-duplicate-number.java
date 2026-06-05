class Solution {
    public int findDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=1; i<nums.length; i++){
        //     int xor=nums[i-1]^nums[i];
        //     if(xor==0)return nums[i];
        // }
        // return -1;
        //cannot change the given array

        //optimal approach using fast and slow 
        int n=nums.length;
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow=nums[slow];
            fast=nums[nums[fast]]; 
        }
        while(slow!=fast);
           slow=nums[0];
           while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
           }
           return slow;
    }
}
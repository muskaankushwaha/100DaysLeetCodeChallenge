class Solution {
    public int uniqueXorTriplets(int[] nums) {
        Set<Integer> set1=new HashSet<>();
         Set<Integer> set2=new HashSet<>();
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                set1.add(nums[i]^nums[j]);
            }
        }
        for(int x : set1){
            for(int j=0; j<nums.length; j++){
                set2.add(x^nums[j]);
            }
        }
        return set2.size();
    }
}
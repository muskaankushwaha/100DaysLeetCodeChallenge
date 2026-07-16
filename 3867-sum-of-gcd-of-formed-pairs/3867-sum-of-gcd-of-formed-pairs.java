class Solution {
    public int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int [] mx=new int[nums.length];
        int [] prefixGcd=new int[nums.length];
        mx[0]=nums[0];
        long sum=0;
        for(int i=1; i<nums.length; i++){
            mx[i]=Math.max(mx[i-1],nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            prefixGcd[i]=gcd(mx[i],nums[i]);
        }
        Arrays.sort(prefixGcd);
        for(int i=0; i<nums.length/2; i++){
            sum+=gcd(prefixGcd[i],prefixGcd[nums.length-i-1]);
        }
        return sum;
    }
}
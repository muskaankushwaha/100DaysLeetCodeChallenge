class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        int l=nums.length;
        int c=0;
        long sum=0;
        long a=1;
        int n=0;
        if(nums[0]>1){
            n=nums[0]-1;
            n=Math.min(k,n);
            sum=(long)(n+1)*n/2;
            k=k-n;
        }for(int i=0; i<nums.length; i++){
            while(i+1<l && nums[i]==nums[i+1]) {
                i++;
            }
            a=nums[i]+1;
            n=i==l-1 ? 0 : nums[i+1]-nums[i]-1;
            n=Math.min(k,n);
            sum+=(long)n*(2*a+(n-1))/2;
            k=k-n;
            if(k<=0)break;

        }
        if(k>0){sum+=(long)((k)*(2*(long)(nums[l-1]+1)+(k-1))/2);}
        return sum;
        
    }
}
class Solution {
    void fn(int ind, int[]arr, int target, List<List<Integer>>list , List<Integer>li){
            if(target==0){
                list.add(new ArrayList<>(li));
            return;
        }
            for(int i=ind; i<arr.length; i++){
                if(i>ind && arr[i]==arr[i-1])continue;//skiping element
                if(arr[i]>target)break;//no need to continue
                li.add(arr[i]);
                fn(i+1,arr,target-arr[i],list,li);
                li.remove(li.size()-1);
            }
        }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list=new ArrayList<>();
        fn(0,candidates,target,list,new ArrayList<>());
        return list;
    }
}
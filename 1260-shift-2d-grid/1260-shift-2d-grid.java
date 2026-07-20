class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int idx=m*n;
        k=k%idx;
        int i=(m*n-k)/n;
        int j=(m*n-k)%n;

        int c=0;

        List<List<Integer>> list =new ArrayList<>();
        if(i>=m)i=i%m;
        if(j>=n)j=j%n;
           
            while(c<idx){
                int x=0;
                 List<Integer> li=new ArrayList<>();
                while(x<n){
                     li.add(grid[i][j]);
                      j++;
                
                if(j>=n){
                    j=j%n;
                    i++;
                }
                if (i>=m)i=i%m;
               
                c++;
                x++;
                }
                list.add(li);
               
            }
        
        return list;
    }
}
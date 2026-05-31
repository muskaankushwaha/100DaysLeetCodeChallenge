class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] p : prerequisites) {
            adj.get(p[1]).add(p[0]);
        }
        int[] state = new int[numCourses];
        for(int i = 0; i < numCourses; i++) {
            if(dfs(i, adj, state)) {
                return false; // cycle found
            }
        }
        return true;
    }
     boolean dfs(int node, List<List<Integer>> adj, int[] state) {
        if(state[node] == 1) return true;   // cycle
        if(state[node] == 2) return false;  // already checked
        state[node] = 1; // visiting
        for(int nei : adj.get(node)) {
            if(dfs(nei, adj, state)) {
                return true;
            }
        }
        state[node] = 2; // done
        return false;
    }
}
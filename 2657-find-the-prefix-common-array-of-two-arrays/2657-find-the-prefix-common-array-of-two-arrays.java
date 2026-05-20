class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] check = new int[A.length];
        int[] ans = new int[A.length];
        Arrays.fill(check, -1);
        int i = 0;
        while (i < A.length) {
            check[A[i] - 1]++;
            check[B[i] - 1]++;
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if (check[j] == 1)
                    count++;
            }
            ans[i] = count;
            i++;

        }
        return ans;
    }
}
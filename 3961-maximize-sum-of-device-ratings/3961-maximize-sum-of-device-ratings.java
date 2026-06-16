class Solution {
    public long maxRatings(int[][] units) {

        if (units[0].length == 1) {
            long ans = 0;
            for (int[] row : units) {
                ans += row[0];
            }
            return ans;
        }

        long sumSecondMin = 0;
        int globalMin = Integer.MAX_VALUE;
        int smallestSecondMin = Integer.MAX_VALUE;

        for (int[] row : units) {

            Arrays.sort(row);

            globalMin = Math.min(globalMin, row[0]);

            smallestSecondMin =
                Math.min(smallestSecondMin, row[1]);

            sumSecondMin += row[1];
        }

        return sumSecondMin - smallestSecondMin + globalMin;
    }
}
class Solution {
    public int totalFruit(int[] fruits) {
        int basket1 = -1;
        int basket2 = -1;
        int sameCount = 0;
        int current = 0;
        int max = 0;
        for (int fruit : fruits) {
            if (fruit == basket1 || fruit == basket2) {
                current++;
            }
            else{
                current = sameCount + 1;
            }
            if (fruit == basket2) {
                sameCount++;
            }
            else {
                sameCount = 1;
            }
            if (fruit != basket2) {
                basket1 = basket2;
                basket2 = fruit;
            }
            max = Math.max(max, current);
        }
        return max;
    }
}
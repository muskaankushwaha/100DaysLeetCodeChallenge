class Solution {

    long MOD = 1000000007;

    public int maxProfit(int[] inventory, int orders) {

        Arrays.sort(inventory);

        int n = inventory.length;

        int l = n - 1;
        int r = n - 1;

        long ans = 0;

        while (orders > 0) {

            long group = r - l + 1;

            long curr = inventory[l];

            long prev = (l == 0) ? 0 : inventory[l - 1];

            long diff = curr - prev;

            // Can we reduce till previous element?
            if (orders >= diff * group) {

                long levels = diff;

                long sum = levels * (2 * curr - levels + 1) / 2;

                ans = (ans + (sum * group) % MOD) % MOD;

                orders -= diff * group;

                l--;

            } else {

                long fullLevels = orders / group;

                long rem = orders % group;

                long sum = fullLevels * (2 * curr - fullLevels + 1) / 2;

                ans = (ans + (sum * group) % MOD) % MOD;

                long valueLeft = curr - fullLevels;

                ans = (ans + rem * valueLeft) % MOD;

                break;
            }
        }

        return (int) ans;
    }
}
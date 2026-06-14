class Solution {
    public int reverseBits(int n) {
        String x = Integer.toBinaryString(n);
        // 32 bits
        while (x.length() < 32) {
            x = "0" + x;
        }
        StringBuilder sb = new StringBuilder(x);
        sb.reverse();
        return (int) Long.parseLong(sb.toString(), 2);
    }
}
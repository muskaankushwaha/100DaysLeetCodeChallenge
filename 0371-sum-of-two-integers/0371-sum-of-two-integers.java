class Solution {
    public int getSum(int a, int b) {
        //xor for sum
        //& for carry and << to shift carry
        while (b != 0) {
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
}
class Solution {
    public String convert(String s, int n) {
        if (n == 1 || n >= s.length()) return s;
        StringBuilder res = new StringBuilder();
        for (int i=0; i<n; i++) {
            int temp = i;
            while (temp < s.length()) {
                res.append(s.charAt(temp));
                int step1 = (2*(n-i))-2;
                int step2 = (2*(i+1))-2;
                if (i==0 || i==n - 1) {
                    temp += 2*n-2;
                } else {
                    temp += step1;
                    if (temp < s.length()) {
                        res.append(s.charAt(temp));
                    }
                    temp += step2;
                }
            }
        }
        return res.toString();
    }
}
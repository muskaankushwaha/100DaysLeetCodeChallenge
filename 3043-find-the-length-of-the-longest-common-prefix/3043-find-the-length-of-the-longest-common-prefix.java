class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int ans = 0;
        Set<String> set = new HashSet<>();
        for (int n : arr1) {
            String s = String.valueOf(n);
            String pref = "";
            for (char c : s.toCharArray()) {
                pref += c;
                set.add(pref);
            }
        }
        for (int n : arr2) {
            String s = String.valueOf(n);
            String pref = "";
            for (int i = 0; i < s.length(); i++) {
                pref += s.charAt(i);
                if (set.contains(pref)) {
                    ans = Math.max(ans, pref.length());
                }
            }
        }
        return ans;
    }
}
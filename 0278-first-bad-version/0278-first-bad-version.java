/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid = start + (end - start) / 2;
        System.out.println(isBadVersion(mid));
        while (true) {
            if (isBadVersion(mid) == true) {
                end = mid;
                mid = start + (end - start) / 2;
                if (start == end) {
                    return mid;
                }
            } else {
                start = mid + 1;
                mid = start + (end - start) / 2;
                if (start == end) {
                    return mid;
                }
            }
        }

    }
}

class Solution {
    public boolean checkZeroOnes(String s) {
        int c1 = 0;
        int c0 = 0;
        int max1 = 0;
        int max0 = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                c1++;
                c0 = 0;
                max1 = Math.max(max1, c1);
            } else {
                c0++;
                c1 = 0;
                max0 = Math.max(max0, c0);
            }
        }

        return max1 > max0;
    }
}
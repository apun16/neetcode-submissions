class Solution {
    public int[] countBits(int n) {
        int[] in = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            in[i] = in[i >> 1] + (i & 1);
        }
        return in;
    }
}

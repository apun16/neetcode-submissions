class Solution {
    public int singleNumber(int[] nums) {
        int in = 0;
        
        for (int num : nums) {
            in ^= num;
        }
        
        return in;

    }
}

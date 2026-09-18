class Solution {
    public int reverse(int x) {
        int reverse_1= 0;
        while(x != 0){
            
            int digits = x % 10;
            if (reverse_1 > Integer.MAX_VALUE / 10 ||
                reverse_1 < Integer.MIN_VALUE / 10) {
                return 0;
            }
            reverse_1 = reverse_1 * 10 + digits;
            x = x / 10;
        }
        return reverse_1;
    }
}

// Time Complexity = O(log |x|)
// Space Complexity = O(1)
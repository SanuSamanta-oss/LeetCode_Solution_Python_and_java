class Solution{
    public int maxArea(int[] height){
        int n = height.length;
        int left = 0;
        int right = n - 1;

        int maxwater = 0;
        while(left < right){
            int width = right - left;
            int current_height = Math.min(height[left],height[right]);
            int water = width * current_height;

            maxwater = Math.max(maxwater,water);

            if( height[left] < height[right]){
                left++;
            }else{
                right--;
            }

        }
        return maxwater;
    }
}
// Time Complexity = O(n)
// Space Complexity = O(1)
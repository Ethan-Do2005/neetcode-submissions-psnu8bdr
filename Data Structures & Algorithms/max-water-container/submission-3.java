class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length-1;
        int result = 0;

        while(l < r){
            int length = r - l;
            int depth = Math.min(heights[l], heights[r]);
            int product = depth * length;
            result = Math.max(product, result);

            if(heights[l] <= heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return result;
    }
}
/*
[1,7,2,5,4,7,3,6]
Output: 36
[7,6] => 6 x 6 = = 36

*/
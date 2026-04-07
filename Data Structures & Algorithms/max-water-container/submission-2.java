class Solution {
    public int maxArea(int[] heights) {
    int height = 0;
    int length = 0;
    int result = 0;

    for(int i = 0; i < heights.length; i++){
        for(int j = 0; j < heights.length; j++){
            length = (j - i);
            height = Math.min(heights[i], heights[j]);

            int area = height * length;
            result = Math.max(result, area);
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
class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while(l < r){
            int m = l + (r - l) / 2;

            if(nums[m] > nums[r]){
                l = m + 1;
            }else{
                r = m;
            }
        }

        return nums[l];
    }
}
/*
[3,4,5,6,1,2]
mid = l + (r-l)/2;
mid = 2 = value 5
if 5 > 2 => right side by mid + 1
l = 2
r = 
*/
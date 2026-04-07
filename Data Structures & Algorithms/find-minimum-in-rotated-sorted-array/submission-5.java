class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length -1;

        while(l < r){
            int mid = l + (r-l) / 2;

            if(nums[mid] < nums[r]){
                r = mid;
            }else{
                l = mid + 1;
            }
        }

        return nums[l];
    }
}
/*
Why we compare nums[mid] with nums[r] but not nums[l]
=> Because the right side always sorted but not left side

*/
class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while(l < r){
            int mid = l + (r - l)/2;
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
 0 1 2 3 4 5
[4 5 1 2 3]

as we see nums[2] = 1 < nums[4] = 3
it means that if 1 is smaller than right there will no smaller number in right side
because it is an ascending but for the left side it may have the number in smaller 
s
*/
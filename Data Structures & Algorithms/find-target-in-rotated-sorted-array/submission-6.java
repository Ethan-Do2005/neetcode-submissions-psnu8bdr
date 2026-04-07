class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while(l <= r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                return mid;
            }

            // Case 1: mid is in sorted left
            if(nums[mid] >= nums[l]){
                if(nums[l] <= target && target < nums[mid] ){
                    r = mid -1;
                }
                else{
                    l = mid + 1;
                }
            }
            // Case 2: mid is not in sorted left
            else{
                if(nums[mid] < target && target <= nums[r]){
                    l = mid + 1;
                }
                else{
                    r = mid - 1;
                }
            }
        }

        return -1;
    }
}
/*
So the idea of this one is 
When we rotated the array it would appear two side one is left and one is right 
from the middle 

=> We approach by compare which subarray is sorted to go throught compare the target

Binary search is used for searching by dividing each subarray a half 

But in here we will dont know is our mid would be in the sorted of half left or half right 
To do that we need to checking first 
+ By comparing mid with left value
+if mid > left value - yes (sorted in left half)
    + left <= target < mid value if exists yes keep go on left side by r = mid - 1
    + else - no keep go on right side by l = mid + 1 

+ else (mid < right value) (not sorted)
    + mid <= x < right value if exists => l = mid + 1 
    + else r = m-1
+
*/
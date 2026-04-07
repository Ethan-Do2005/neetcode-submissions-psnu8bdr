class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while(l < r ){
            int m = l + (r-l)/2;
            if(nums[m] < nums[r]){
                r = m;
            }else{
                l = m + 1;
            }
        }

        return nums[l];
    }
}
/*
[3,4,5,6,1,2]
Output: 1

[1,2,3,4,5,6]
Output: 1

[5,6,1,2,3,4]
 0 1 2 3 4 5
Output: 1

l = 0;
r = 5;
m = 2;
1 < 4
r = 2
l = 0;
m = l + (2-0) / 2 = 1

6 < 1
l = 2; 

My idea:
int left, right 
while loop
    mid
    if condition (nums[mid] < [r])
        r = m;
    else
        l = m +1;

    returen [l]
*/

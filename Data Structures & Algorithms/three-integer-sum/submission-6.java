class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int i =0; i < nums.length; i++){
            int l = i+1;
            int r = nums.length - 1;

            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];

                if(sum > 0){
                    r--;
                    continue;
                }else if (sum < 0){
                    l++;
                    continue;
                }else{

                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    l++;
                    r--;

                    while(l < r && nums[l] == nums[l-1]){
                        l++;
                    }
                }
            }
        }

        return result;
    }
}
/*
[
[-4,-1,-1,0,1,2]
Result[]
i = 0;
l = 1; 2;
r = 5;
||-4, -1,2 => -6 < 0
l++
|| -4,-1,2
l++
|| -4, 1, 2 => -1 < 0

i = 1
l = 2;
r = 5;
|| -1 -1 2 => 0 



]
Test Case 1:
[-1,0,1,1,5,-5]
Output: [[-1,0,1], [0,5,-5]];
My idea for this:
Using pointer
call first in for loop
-1
[0,1,1,5,-5]
Using two pointer

If sum 3 three pointer is = 0 => add in result
    while nums[l] == nums[l-1] => l++
sum > 0 => r--
sum < 0 => l++
 
*/
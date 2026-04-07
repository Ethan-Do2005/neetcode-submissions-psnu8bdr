// class Solution {
//     public int majorityElement(int[] nums) {
//         int num = nums[0];
//         Arrays.sort(nums);
//         int count = 1;
//         for(int i = 1; i < nums.length; i++){
//             if(nums[i] == num){
//                 count = count + 1;
//                 if(count > nums.length/2){
//                     return nums[i];
//                 }
//             }
//             else if(nums[i] != num){
//                 num = nums[i];
//                 count = 1;
//             }
//         }
//         return nums[0];   
//     }
// }

/*
int num = nums[0]
Array.sort(nums)
int count = 1;
for i = 1 loop 
    if(nums[i] == num){
        count=count + 1;
        if(count > nums.length/2){
            return nums[i];
        }
    }
    else if(nums[i] != num){
        num = nums[i]
        count = count/i;
        if(count > nums.length/2){
            return nums[i];
        }
    }
*/
class Solution {
public int majorityElement(int[] nums) {
    Map<Integer, Integer> countMap = new HashMap<>();
    int n = nums.length;

    for (int num : nums) {
        int count = countMap.getOrDefault(num, 0) + 1;
        countMap.put(num, count);
        if (count > n / 2) {
            return num;
        }
    }
    return -1; // This line is just for completeness, never actually needed
}
}
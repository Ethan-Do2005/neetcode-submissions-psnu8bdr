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

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> table = new HashMap<>();

        for(int i = 0 ; i < nums.length; i++){
            int num = nums[i];

            int count = table.getOrDefault(num,0) + 1;

            table.put(num,count);
            if(count > nums.length/2){
                return num;
            }
        }
        return -1;
    }
}

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
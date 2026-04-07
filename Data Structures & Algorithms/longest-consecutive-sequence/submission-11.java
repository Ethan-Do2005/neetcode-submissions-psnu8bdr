class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> setNum = new HashSet<>();

       //Base Case
       if(nums.length == 0) return 0;

       for(int num : nums){
            setNum.add(num);
       }

        int longestStrike = 1;
       for(int num : setNum){
            if(!setNum.contains(num -1)){
                int currentNum = num;
                int count = 1;

                while(setNum.contains(currentNum + 1)){
                    currentNum +=1;
                    count += 1;
                }

                longestStrike = Math.max(longestStrike, count);
            }
       }

       return longestStrike;
    }
}
/*
negative number or range number?
No negative and 10^5 <= i <= 10^5 - i is index of each nums
nums.length
0 to 10000

Approach A: Using hashset
nums = [2,20,4,10,3,4,5]
 
2 - head of snake (sequence) to count and move 
3 consecutive sequence:
seq: 2,3,4,5
seq: 20
seq: 10
*/
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : nums){
            pq.offer(num);
        }

        int[] arr = new int[nums.length];
        for(int i=0; i < nums.length; i++){
            arr[i] = pq.poll();
        }

        int max = 1;
        int curr = 1;
        for(int i = 1; i < arr.length;i++){
            if(arr[i-1] == arr[i]){
                continue;
            }
            
            if(arr[i-1] + 1 == arr[i]){
                curr++;
            }

            else{
                max = Math.max(curr, max);
                curr = 1;
            }
        }
        max = Math.max(max,curr);
        
        return max;
    }
}
/*
count++
if(exists i value in table) continue;
if(exists(i-1)value)
    count++;
if(not exists(i-1)value)
    temp = count;
    Max(temp, count);


*/
/*
Idea:
Using min heap to sort the array
Go through each nums[i]
based on that we check is that exits number that equal i+1 
If we add it into List of List integer 

*/
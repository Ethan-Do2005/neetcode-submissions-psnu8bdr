class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0; 
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : nums){
            pq.offer(num);
        }
        
        int[] newArr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            newArr[i] = pq.poll();
        }
        for(int num : newArr){
            System.out.print(num);
        }

        int count = 1;
        int max = 0;
        for(int i = 1; i < nums.length; i++){
            if(newArr[i] == newArr[i-1] + 1){
                count++;
            } else if(newArr[i] == newArr[i-1]){
                continue;
            } else{
                max = Math.max(count, max);
                count = 1;
            }
        }

        return Math.max(count,max);
    }
}

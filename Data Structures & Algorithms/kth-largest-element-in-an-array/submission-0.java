class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : nums){
            maxheap.offer(num);
        }

        int result = 0;
        while(k > 0){
            result = maxheap.poll();
            System.out.print("result");
            k--;
        }

        return result;
    }
}
/*
Step 1: Create heap and bring those array into the max heap
Step 2: Call the for loop based on counting k = 0 
*/
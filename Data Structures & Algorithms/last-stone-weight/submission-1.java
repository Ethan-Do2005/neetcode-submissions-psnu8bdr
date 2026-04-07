class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for( int stone : stones){
            maxHeap.offer(stone);
        }

        while(maxHeap.size() > 1){
            int firstVal = maxHeap.poll();
            int secondVal = maxHeap.poll();
            if(firstVal > secondVal) {
                firstVal = firstVal - secondVal;
                maxHeap.offer(firstVal);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.peek();
    }
}

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a,b) -> Long.compare(distance(b), distance(a))
        );

        for(int[] point : points){
            maxHeap.offer(point);
            if(maxHeap.size() > k){
                maxHeap.poll();
            }
        }

        int[][] res = new int[k][2];
        int i = 0;
        while(!maxHeap.isEmpty()){
            res[i++] = maxHeap.poll();
        }

        return res;

    }

    // Calculate EACH INDEX points 2D arrays
    private long distance(int[] p){
        // This calculate for each index of 2D array points
        // Example [[0,2], [1,2]] because just 1D array
        // => Example first array and then int[] means for [0,2]
        // where p[0] first index and p[1] second index 
        return 1L * p[0] * p[0] + 1L * p[1] * p[1];
    }
}
/*
we have totall 3 steps
Step 1: We create a heap and calculate the distance 
Step 2: Based on k we will count and poll out max element 
Step 3: From that max heap we will get those value into the 2D array to return the valid output
*/
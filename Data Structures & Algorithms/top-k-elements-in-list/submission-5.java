class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(a[0], b[0])
        );

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            pq.offer(new int[]{entry.getValue(), entry.getKey()});
            if(pq.size() > k){
                pq.poll();
            }
        }

        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = pq.poll()[1];
        }

        return res;
    }
}
/*
(nums[], k)

[1,2,3,4,5,3,3] k = 2
[3,5]

Idea:
Creaet a hashmap to count and put value inside
Create a paring heap => to contains k element
*/

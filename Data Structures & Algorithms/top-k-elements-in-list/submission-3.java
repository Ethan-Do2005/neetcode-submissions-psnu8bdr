class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int key : nums){
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        PriorityQueue<int[]> min_heap = new PriorityQueue<>(
            (a, b) -> Integer.compare(a[0], b[0])
        );
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            min_heap.offer(new int[]{value, key});
            if(min_heap.size() > k){
                min_heap.poll();
            }
            
        }

        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = min_heap.poll()[1];
        }

        return res;


    }
}
/*
for throught each index
    map.put(key, map.getOrDefault(key,0) + 1);

Based on value of the key in hashmap and put it in new array by using EntrySet
with k size array


*/
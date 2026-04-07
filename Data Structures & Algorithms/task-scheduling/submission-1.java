class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for(char ch : tasks){
            count[ch - 'A']++;
        }

        Arrays.sort(count);
        int max_freq = count[25];
        int idle = (max_freq-1) * n;

        for(int i = 24; i >= 0; i-- ){
            idle -= Math.min(max_freq - 1, count[i]);
        }

        return tasks.length + Math.max(0, idle);
    }
}
/*
Step1: We will count freq of each character
Step2: sort and determine the max_freq of character
Step3: Calculate how many blank between repeated character
Step3: We subtract by assigned character 
Step4: Take sum of empty blank with tasks.length
*/

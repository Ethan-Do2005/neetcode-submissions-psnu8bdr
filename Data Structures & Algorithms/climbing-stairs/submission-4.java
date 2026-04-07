class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int first = 1;
        int second = 2;
        int num= 0;

        for(int i = 3; i<=n;i++){
            num = first + second;
            first = second;
            second = num;

        }

        return num;
/*
steps
0 1 2 3 4 5
  1 2 3     
step 2 = 3 + 1 
*/
    }
}

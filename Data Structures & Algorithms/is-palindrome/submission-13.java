class Solution {
    public boolean isPalindrome(String s) {
        //Base Case
        if(s.length() == 1){
            return true;
        }

        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            while(left < right && !checkingChar(s.charAt(left))){
                left++;
            }

            while(left < right && !checkingChar(s.charAt(right))){
                right--;
            }

            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    private boolean checkingChar(char c){
        if((c >= 'A' && c <= 'Z') ||
            (c >= 'a' && c <= 'z') ||
            (c >= '0' && c <= '9')){
                return true;
            }
        return false;
    }
}
/*
Understand the problem

The input of s is include 
empty 
=> It is from 1 to 1000

Approach A: two pointer
going each index from left side and right 

"was saw"
i and j 
w : w 
a : a
s : s
space : keep going i >= j
return true

*/

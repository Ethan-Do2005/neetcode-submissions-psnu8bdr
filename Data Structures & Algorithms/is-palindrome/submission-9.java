class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() -1;

        String s1 = s.toLowerCase();

        while(l < r){
            if(!Checking(s1.charAt(l)) && l < r) {
                l++;
                continue;
            }else if(!Checking(s1.charAt(r)) && l < r){
                r--;
                continue;
            }
            if(s1.charAt(l) != s1.charAt(r)){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }

    private boolean Checking(char c){
        if( c >= '0' && c <= '9' ||
            c >= 'a' && c <= 'z' ||
            c >= 'A' && c <= 'Z' ){
                return true;
            }

        return false;
    }
}
/*
Test case = "car arc"
Output: false

Test case = "was saw"
Output: true

My idea:
Main method:
two pointer left and right then 
it not satisfy helper method => next character

return true


Helper method:
contains if char contain A-Z and a-z 0-9 retunr true 
return false
*/

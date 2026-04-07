class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        String s1 = s.toLowerCase();
        while(l < r){
            while(l < r && !Checking(s1.charAt(l))){
                l++;
            }
            while(l < r && !Checking(s1.charAt(r))){
                r--;
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
        if( (c >= 'a' && c <= 'z') ||
            (c >= 'A' && c <= 'Z') ||
            (c >= '0' && c <= '9')){
                return true;
            }

        return false;
    }
}
/*
Test case 1:
"Was iti asw"
l = 0
r = 9
=> Was iti asw
0 > 9
l++  = 1;
r++  = 8;
Output: true => is has same characters

"&? haha wiw"ahah""
Output: true => "

My idea: 
+Using two pointers
    => Calling left and right when in the while loop
+Using another helper method
    => Checking the alphanumeric characters

Review test 1
*/

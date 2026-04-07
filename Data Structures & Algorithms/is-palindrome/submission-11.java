class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() -1;

        s = s.toLowerCase();

        while(l < r){
            if(l < r && !isAl(s.charAt(l))){
                l++;
                continue;
            }else if(l < r && !isAl(s.charAt(r))){
                r--;
                continue;
            }else if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }

        return true;
    }

    private boolean isAl(char c){
        if( c >= 'a' && c <= 'z' ||
            c >= 'A' && c <= 'Z' ||
            c >= '0' && c <= '9'){
                return true;
            }
        return false;
    }
}

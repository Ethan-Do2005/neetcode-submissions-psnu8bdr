class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() -1;

        String s1 = s.toLowerCase();
        while(l < r){
            if(!isAl(s1.charAt(l)) && l < r ){
                l++;
                continue;
            }else if(!isAl(s1.charAt(r)) && l < r ){
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

    private boolean isAl(char c){
        if( c >= 'a' && c <= 'z' ||
            c >= 'A' && c <= 'Z' ||
            c >= '0' && c <= '9'){
                return true;
            }
        return false;
    }
}

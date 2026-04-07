class Solution {
    public boolean isPalindrome(String s) {
       int l = 0;
       int r = s.length() -1;
       String s1 = s.toLowerCase() ;

       while(l < r){
            while(l < r && !checking(s1.charAt(l))){
                l++;
            }
            while(l < r && !checking(s1.charAt(r))){
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

    private boolean checking(char c){
        if( (c >= 'a' && c <= 'z') ||
            (c >= 'A' && c <= 'Z') ||
            (c >= '0' && c <= '9')){
                return true;
            }
        return false;
    }
}
/*
Idea:
Using two pointer one is from the one is from the left
Using while loop inside{ 
    while(l < r && checking()){
        l++;
    }
    while(l < r && checking()){
        r--;
    }
    l++;
    r--;
}

checking helper method(){

}
*/
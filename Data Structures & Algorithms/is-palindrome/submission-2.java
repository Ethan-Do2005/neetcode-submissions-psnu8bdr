class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;

        while(l < r ){
            while( l < r && check(s.charAt(l)) == false){
                l++;
            }
            while( l < r && check(s.charAt(r)) == false){
                r--;
            }

            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }

            l++;
            r--;
        }

        return true;

    }

    public boolean check(char c){
        return (c >='A' && c<='Z' ||
                c >='a' && c<='z' ||
                c >='0' && c<='9');
    }
}

/*
Lowercase of all thing 
I will using charAt to put the string into the array
with condition if each charAt is null it will not go into that array
After that we can create 2 value i,j 
and compare each thing 


*/

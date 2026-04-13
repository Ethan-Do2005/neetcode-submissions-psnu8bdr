class Solution {
    public boolean isPalindrome(String s) {
    int n = s.length();
    int left = 0;
    int right = n-1;
    s = s.toLowerCase();

    while(left < right){
      //skip until exits letter and numbers
      while(left < right && !checkAlphabelt(s.charAt(left))){
        left++;
      }

      while(left < right && !checkAlphabelt(s.charAt(right))){
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

  private boolean checkAlphabelt(char c){
    if( (c >= 'A' && c <= 'Z') ||
        (c >= 'a' && c <= 'z') ||
        (c >= '0' && c <= '9')){
          return true;
        }
    return false;        
    }
}

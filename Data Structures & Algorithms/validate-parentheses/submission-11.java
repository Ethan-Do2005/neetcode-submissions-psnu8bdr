class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '('){
                stack.push(')');
            }else if(c == '['){
                stack.push(']');
            }else if(c == '{'){
                stack.push('}');
            }

            else if(stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }

        return (stack.isEmpty());
    }
}
/*
Constraints:
size range of s
=> 1 to 1000

My approach: Using stack + while loop
see the opening bracket ==> push closing in order from that opening
[ ==> ]
{ ==> }
( ==> )

Time is O(n) n is length of s
Space is O(n) depends on opening bracket
*/
class Solution {
    public boolean isValid(String s) {
       Deque<Character> stack = new ArrayDeque<>();

       for(char c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            if(c == ')' || c == ']' || c == '}'){
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.peek();
                if((c == ')' && top == '(') ||
                    (c == ']' && top == '[') ||
                    (c == '}' && top == '{')){
                        stack.pop();
                }else{
                    return false;
                }
            }
       }

       return stack.isEmpty(); 
    }
}
/*
Understanding 

Is this include the empty case ? 
No

Approach using stack
if it open bracket going into stack and if is close bracket pop index in stack
eveytime we go through checking isEmpty or not 
*/
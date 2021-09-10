class Solution {
    public boolean isValid(String s){
        if(s.length()%2!=0){
            return false;
        }
        int left=0,right=0;
        Deque<Character> stack = new ArrayDeque<Character>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                 stack.push(c);
                 left++;
            }
            if(stack.isEmpty()){
                return false;
            }
            if(c == ')' || c == ']' || c == '}'){
                if(stack.peek()=='(' && c==')'){
                    stack.pop();
                }
                else if(stack.peek()=='[' && c==']'){
                    stack.pop();
                }
                else if(stack.peek()=='{' && c=='}'){
                    stack.pop();
                }
                right++;
                
            }
            //System.out.println(left+" "+right);
        }
        return stack.isEmpty() && left==right;
        
    }
}
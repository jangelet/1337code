class Solution {
    public boolean isValid(String s) {
        //intialize char stack to keep track of brackets
        Stack<Character> bracketStack = new Stack<Character>();
        //loop through string
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            switch (curr) {
                case '[' : 
                case '{' : 
                case '(' : 
                    //push any open bracket
                    bracketStack.push(curr);
                    break;
                //pop only if open bracket on top of stack corresponds to current closing bracket
                case ']' :
                    if(!bracketStack.isEmpty() && bracketStack.peek() == '['){
                        bracketStack.pop();
                    }else{ 
                        bracketStack.push(curr);
                    }
                    break;
                case '}' :
                    if(!bracketStack.isEmpty() && bracketStack.peek() == '{'){
                        bracketStack.pop();
                    }else{
                        bracketStack.push(curr);
                    }
                    break;
                case ')' :
                    if(!bracketStack.isEmpty() && bracketStack.peek() == '('){
                        bracketStack.pop();
                    }else{
                        bracketStack.push(curr);
                    }
                    break;
             }
        }        
        //return true if stack is empty
        return bracketStack.isEmpty();
    }
}
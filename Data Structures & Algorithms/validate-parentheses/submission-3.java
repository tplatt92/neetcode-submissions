class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 == 1){
            return false;
        }

        Stack<Character> charStack = new Stack<>();
        Map<Character, Character> charMap = new HashMap<>();

        charMap.put('}', '{');
        charMap.put(')', '(');
        charMap.put(']', '[');

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                charStack.add(s.charAt(i));
            } else {
                if(charStack.isEmpty() || charStack.peek() != charMap.get(s.charAt(i))){
                    return false;
                }
                charStack.pop();
            }
        }
         return charStack.size() == 0 ? true : false;
    }
}


// FILO
// odd numbers of brackets will be invalid
// first half substring should match second half substring. 
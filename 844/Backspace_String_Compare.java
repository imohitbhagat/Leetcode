class Solution {
     public boolean backspaceCompare(String S, String T) {
        
        // Corner cases to add.
        
        return buildString(S).equals(buildString(T));
    }
    
    private String buildString(String str) {
        
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                sb.append(ch);
            } else if (sb.length() != 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        
        return sb.toString();
    } 
}

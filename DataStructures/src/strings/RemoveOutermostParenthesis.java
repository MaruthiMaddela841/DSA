package strings;

// https://leetcode.com/problems/remove-outermost-parentheses/
// Remove Outermost Parentheses
public class RemoveOutermostParenthesis {
	
	public String removeOuterParentheses(String s) {
        int depth=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' && depth==0){
                depth++;
                continue;
            }else if(c=='(' && depth!=0) {
                sb.append(c);
                depth++;
            }else if(c==')' && depth==1){
                depth--;
            }else{
                sb.append(c);
                depth--;
            }
        }
        return sb.toString();
    }

}

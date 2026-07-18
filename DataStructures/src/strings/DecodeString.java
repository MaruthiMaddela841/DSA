package strings;

import java.util.Stack;

public class DecodeString {

	public static void main(String[] args) {
		
		String s="4[a]3[bc]";
		
		Stack<Integer> countStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        int number=0;
        StringBuilder current=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char currentChar= s.charAt(i);
            
            if(currentChar>='0' && currentChar<='9'){
                number = number * 10 + (currentChar - '0');
                continue;
            }
            else if(currentChar>='a' && currentChar<='z'){
                current.append(s.charAt(i));
            }else if(currentChar=='['){
                strStack.push(current.toString());
                countStack.push(number);
                number=0;
                current=new StringBuilder();
                System.out.println("Count Stack:"+countStack+", String Stack:"+strStack);
            }else{
                int repeatCount=countStack.pop();
                String previousString=strStack.pop();
                System.out.println("Current Before:"+current);
                System.out.println("Repeat Count:"+repeatCount+", Previous String:"+previousString);
                StringBuilder temp=new StringBuilder();
                for(int k=0;k<repeatCount;k++){
                	temp.append(current);
                }
                System.out.println("Current After:"+current);
                previousString+=temp;
                current=new StringBuilder(previousString);
            }
            
        }
        System.out.println("Result:"+current.toString());

	}

}

class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                if(!st.isEmpty())
                {
                    sb.append(s.charAt(i));
                }
                st.push('(');
            }
            else if(s.charAt(i)==')'){
                st.pop();
                if(!st.isEmpty())
                {
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}
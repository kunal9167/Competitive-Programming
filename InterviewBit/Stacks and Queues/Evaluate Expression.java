public class Solution {
    public int evalRPN(ArrayList<String> A) {
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<A.size();i++)
        {
            String s=A.get(i);
            if(s.equals("+"))
            {
                int b=st.pop();
                int a=st.pop();
                st.push(a+b);
            }
            else if(s.equals("-"))
            {
                int b=st.pop();
                int a=st.pop();
                st.push(a-b);
            }
            else if(s.equals("*"))
            {
                int b=st.pop();
                int a=st.pop();
                st.push(a*b);
            }
            else if(s.equals("/"))
            {
                int b=st.pop();
                int a=st.pop();
                st.push(a/b);
            }
            else
            {
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}

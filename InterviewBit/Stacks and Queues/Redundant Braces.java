public class Solution {
    public int braces(String A) {
        char ch[] = A.toCharArray();
        Stack<Character> st = new Stack<Character>();
        
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]==')')
            {
                int f=1;
                while(st.peek()!='(')
                {
                    char ch2=st.pop();
                    if(ch2=='+' || ch2=='-' ||ch2=='*' ||ch2=='/')
                        f=0;
                    // i++;
                }
                st.pop();
                if(f==1)
                    return 1;
            }
            else 
                st.push(ch[i]);
        }
        return 0;
    }
}


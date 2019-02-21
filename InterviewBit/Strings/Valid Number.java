public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isNumber(final String A) {
        String temp = A.trim();
        String B="";
        char ch[] = temp.toCharArray();
        int e=0,dot=0,num=0;
        for(int i=0;i<ch.length;i++)
        {
            int f=0;
            
            if(ch[i]=='-' || ch[i]=='+')
            {
                f=1;
                if(i==0 || ch[i-1]=='e')
                    continue;
                return 0;
            }
            
            if(ch[i]>='0' && ch[i]<='9')
            {
                f=1;
                num=1;
                continue;
            }
            
            if(ch[i]=='e' && (i==0 || ch[i-1]=='.'))
                return 0;
            else if(ch[i]=='e')
            {
                e=1;
                f=1;
            }
            
            if(ch[i]=='.' && (e==1 || dot==1 || i+1==ch.length))
                return 0;
            else if(ch[i]=='.')
            {
                dot=1;f=1;
            }
            
            if(f==0)
                return 0;
        }
        if(num==0)
            return 0;
        return 1;
    }
}

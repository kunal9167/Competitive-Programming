public class Solution {
    public String countAndSay(int A) {
        String s="1";
        if(A==1)
            return s;
        for(int i=2;i<=A;i++)
        {
            String tmp="";
            s=s+"$";
            char arr[] = s.toCharArray();
            int c=0;
            for(int j=0;j<s.length()-1;j++)
            {
                c++;
                if(arr[j]!=arr[j+1])
                {
                    tmp=tmp+c+arr[j];
                    c=0;
                }
            }
            s=tmp;
        }
        return s;
    }
}


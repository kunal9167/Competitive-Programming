public class Solution {
    public String convertToTitle(int A) {
        String s="";
        char ch=' ';
        while(A!=0)
        {
            int r=A%26;
            if(r==0)
            {
                ch='Z';
                A-=1;
                s=ch+s;
                A=A/26;
                continue;
            }
            else
            ch=(char)(r+64);
            s=ch+s;
            A=A/26;
        }
        return s;
    }
}

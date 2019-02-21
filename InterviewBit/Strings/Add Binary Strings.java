public class Solution {
    public String addBinary(String A, String B) {
        int i=A.length()-1;
        int j=B.length()-1;
        String ans="";
        int carry=0;
        for(;i>=0 && j>=0;i--,j--)
        {
            int ch1=(A.charAt(i)-'0');
            int ch2=(B.charAt(j)-'0');
            // System.out.println(ch1+" "+ch2+" "+carry);
            int s=ch1+ch2+carry;
            if(s==3)
            {
                ans="1"+ans;
                carry=1;
            }
            else if(s==2)
            {
                carry=1;
                ans="0"+ans;
            }
            else if(s==1)
            {
                carry=0;
                ans="1"+ans;
            }
            else
            {
                carry=0;
                ans="0"+ans;
            }
        }
        
        while(i>=0)
        {
            
            int s=carry+(A.charAt(i)-'0');
            if(s==2)
                ans="0"+ans;
            else if(s==1)
            {
                carry=0;
                ans="1"+ans;
            }
            else
                ans="0"+ans;
            i--;
        }
        
        while(j>=0)
        {
            int s=carry+(B.charAt(j)-'0');
            if(s==2)
                ans="0"+ans;
            else if(s==1)
            {
                carry=0;
                ans="1"+ans;
            }
            else
                ans="0"+ans;
            j--;
        }
        if(carry==1)
            ans="1"+ans;
        return ans;
    }
}

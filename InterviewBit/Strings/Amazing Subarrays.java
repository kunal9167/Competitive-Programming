public class Solution {
    public int solve(String A) {
        long sum=0;
        for(int i=0;i<A.length();i++)
        {
            char ch=A.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                sum=(sum+(A.length()-i)%10003)%10003;
            }
        }
        return (int)sum;
    }
}


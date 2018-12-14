public class Solution {
    public int isPower(int A) {
        double c;
        if(A==1 || A==0)
            return 1;
        if(A==2)
            return 0;
        while(A%2==0)
            A=A/2;
        if(A==1)
            return 1;
        for(int i=3;i<A/2;i+=2)
        {
            c=Math.log(A)/Math.log(i);
            if((c-Math.floor(c))==0)
                return 1;
        }
        return 0;
    }
}

public class Solution {
    public int cntBits(ArrayList<Integer> A) {
        
        long count=0;
        long res=0;
        for(int i=0;i<32;i++)
        {
            count=0;
            for(int j=0;j<A.size();j++)
            {
                if((A.get(j)&(1<<i))==0)
                    count++;
            }
            res+=((A.size()-count)*count*2);
            res=res%(int)(Math.pow(10,9)+7);
        }
        return (int)res;
    }
}

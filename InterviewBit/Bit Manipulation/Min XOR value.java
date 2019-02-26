public class Solution {
    public int findMinXor(ArrayList<Integer> A) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<A.size()-1;i++)
        {
            for(int j=i+1;j<A.size();j++)
            {
                int a=A.get(i);
                int b=A.get(j);
                int x=a^b;
                if(x<min)
                    min=x;
            }
        }
        return min;
    }
}


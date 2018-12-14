//Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers.
//If such arrangement is not possible, it must be rearranged as the lowest possible order ie, sorted in an ascending order.
//The replacement must be in-place, do not allocate extra memory.
public class Solution {
    public void nextPermutation(ArrayList<Integer> a) {
        if(a.size()<2)
            return ;
        int p=-1,q=0;
        int l=a.size();
        for(int i=l-2;i>=0;i--)
        {
            int r1=a.get(i);
            int r2=a.get(i+1);
            if(r1<r2)
            {
                p=i;
                break;
            }
        }
        if(p!=-1)
        {
            for(int i=l-1;i>=0;i--)
            {
                int r=a.get(i);
                if(a.get(p)<r)
                {
                    q=i;
                    break;
                }
            }
            int t=a.get(p);
            a.set(p,a.get(q));
            a.set(q,t);
        }
        int k=1;
        for(int i=p+1;k<=(l-(p+1))/2;i++,k++)
        {
            int t=a.get(i);
            a.set(i,a.get(l-k));
            a.set(l-k,t);
        }
    }
}


public class Solution {
    public int paint(int p, int t, ArrayList<Integer> a) {
        long maxt=0,maxe=-1;
        for(int i=0;i<a.size();i++)
        {
            maxt+=a.get(i);
            if(a.get(i)>=maxe)
            maxe=a.get(i);
        }
        long start=maxe,end=maxt,mid=0;
        while(start<end)
        {
            mid=(start+end)/2;
            int count=1;
            long sum=0;
            for(int i=0;i<a.size();i++)
            {
                sum+=a.get(i);
                if(sum>mid)
                {
                    count++;
                    sum=a.get(i);
                }
            }
            if(count<=p)
            end=mid;
            else
            start=mid+1;
        }
        
        long ans=(start*t)%10000003;
        return (int)ans;
    }
}


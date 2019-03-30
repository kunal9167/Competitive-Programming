public class Solution {
    public ArrayList<Integer> lszero(ArrayList<Integer> A) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum=0;
        hm.put(0,-1);
        int maxlen=0,start=0;
        for(int i=0;i<A.size();i++)
        {
            sum+=A.get(i);
            if(sum==0)
            {
                maxlen=i+1;
                start=0;
            }
            
            if(!hm.containsKey(sum))
                hm.put(sum,i);
            else
            {
                if(maxlen<i-hm.get(sum))
                {
                    // System.out.println("Hello");
                    start=hm.get(sum)+1;
                    maxlen=i-hm.get(sum);
                }
            }
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=start;i<start+maxlen;i++)
            al.add(A.get(i));
        return al;
    }
}

public class Solution {
    public int nTriang(ArrayList<Integer> A) {
        if(A.size()<3)
            return 0;
        Collections.sort(A);
        long ans=0;
        int n=A.size();
        for(int i=0;i<n;i++)
        {
            int k=i+2;
            for(int j=i+1;j<n;j++)
            {
                while(k<n && (A.get(i)+A.get(j))>A.get(k))
                    k++;
                
                if(k>j)
                {
                    ans=ans+(k-j-1);
                    ans=ans%(int)(Math.pow(10,9)+7);
                }
            }
        }
        return (int)ans;
    }
}

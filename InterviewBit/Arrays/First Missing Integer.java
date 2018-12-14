public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int l=0;
        for(int i=0;i<A.size();i++)
        {
            if(A.get(i)>0)
                l++;
        }
        int arr[] = new int[A.size()+1];
        
        for(int i=0;i<A.size();i++)
            arr[i]=-1;

        for(int i=0;i<A.size();i++)
        {
            int x=A.get(i);
            if(x>0 && x<=A.size())
            {
                arr[x]=1;
            }
        }
        // System.out.println(arr[1]);

        for(int i=1;i<A.size();i++)
        {
            if(arr[i]==-1)
                return i;
        }

        return l+1;
    }
}

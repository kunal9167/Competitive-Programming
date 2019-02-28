public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
        int l1=A.size();
        int l2=B.size();
        int l3=C.size();
        int i=0,j=0,k=0,mdif=Integer.MAX_VALUE;
        while(i<l1 && j<l2 && k<l3)
        {
            int n1=A.get(i);
            int n2=B.get(j);
            int n3=C.get(k);
            char ch;
            int max=0,min=0,maxi=0,mini=0;
            max= Math.max(n1,Math.max(n2,n3));
            min= Math.min(n1,Math.min(n2,n3));
            int dif=Math.abs(max-min);
            if(dif<mdif)
            {
                mdif=dif;
            }
            if(min==n1)
                i++;
            else if(min==n2)
                j++;
            else
                k++;
        }
        return mdif;
    }
}

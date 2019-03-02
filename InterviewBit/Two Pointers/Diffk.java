public class Solution {
    public int diffPossible(ArrayList<Integer> A, int B) {
        int i=0,j=0;
        int l=A.size();
        while(i<l && j<l)
        {
            int dif=A.get(j)-A.get(i);
            if(i!=j && dif==B)
                return 1;
            else if(dif>B)
                i++;
            else
                j++;
        }
        return 0;
    }
}


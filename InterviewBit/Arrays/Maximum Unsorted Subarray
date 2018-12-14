// You are given an array (zero indexed) of N non-negative integers, A0, A1 ,…, AN-1.
// Find the minimum sub array Al, Al+1 ,…, Ar so if we sort(in ascending order) that sub array, then the whole array should get sorted.
// If A is already sorted, output -1.
public class Solution {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        int l=A.size();
        ArrayList<Integer> al = new ArrayList<Integer>();
        int max=A.get(0),min=A.get(l-1);
        int high=0,low=0;
        int f=0;
        for(int i=1;i<l;i++)
        {
            if(max<=A.get(i))
            {
                max=A.get(i);
                
            }
            else{
                high=i;
                f=1;
            }
            if(min>=A.get(l-i-1))
            {
                min=A.get(l-i-1);
            }
            else{
                low=l-i-1;
                f=1;
            }
        }
        if(f==0)
        {
            al.add(-1);
            return al;
        }
        al.add(low);
        al.add(high);
        return al;
    }
}


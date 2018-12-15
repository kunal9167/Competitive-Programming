//Given an index k, return the kth row of the Pascal’s triangle.
//Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.
//formula: num = (a+1-i)*res.get(i-1)/i; 

public class Solution {
    public ArrayList<Integer> getRow(int A) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        int r = (int)(A/2.0);
        int n=1;
        int d=1;
        al.add(1);
        if(A==0)
            return al;
        for(int i=0;i<r;i++)
        {
             n=n*(A-i);
             d=d*(i+1);
             al.add(n/d);
        }
        if(A%2==0)
            r-=1;
        for(int i=r;i>=0;i--)
        {
             al.add(al.get(i));
        }
        return al;
    }
}


public class Solution {
    public String getPermutation(int A, int B) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=1;i<=A;i++)
            al.add(i);
        return solution(B-1,al);
    }
    String solution(int k,ArrayList<Integer> al)
    {
        int n=al.size();
        if(n==0 || k>fact(n))
            return "";
        
        int x=fact(n-1);
        int pos=k/x;
        k=k%x;
        
        String s=String.valueOf(al.get(pos));
        al.remove(pos);
        return s+solution(k,al);
    }
    int fact(int n)
    {
        if(n>12)
        return Integer.MAX_VALUE;
        
        int x=1;
        for(int i=2;i<=n;i++)
            x*=i;
        return x;
    }
}
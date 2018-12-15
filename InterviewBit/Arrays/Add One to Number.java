public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int l = A.size();
        ArrayList<Integer> al = new ArrayList<Integer>();
        int k=0,i;
        
        if(l==0)
        return al;
        
        for(i=0;i<l && A.get(i)==0;i++);
        k=i;
        if(k==l)
        {
            al.add(1);
            return al;
        }
        
        int c=1;
        int r=A.get(l-1)+c;
        r=r%10;
        if(r==0)
            c=1;
        else
            c=0;
        for(i=l-2;i>=k-1;i--)
        {
            al.add(0,r);
            if(i<=k-1)
                break;
            r=A.get(i)+c;
            r=r%10;
            if(r==0 && c!=1)
                c=0;
            else if(r!=0 && c==1)
                c=0;
        }
        if(c==1)
            al.add(0,1);
        return al;
    }
}


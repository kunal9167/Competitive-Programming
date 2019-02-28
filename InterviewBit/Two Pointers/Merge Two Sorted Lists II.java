public class Solution {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> c = new ArrayList<Integer>(a.size()+b.size());
        int i=0,j=0,l1=a.size(),l2=b.size();
        int k=0;
        while(k<a.size() && j<l2)
        {
            int n1=a.get(k);
            int n2=b.get(j);
            
            if(n1>n2)
            {
                a.add(k,n2);
                j++;
            }
            k++;
        }
        while(j<l2)
        {
            a.add(k,b.get(j));
            j++;
            k++;
        }
    }
}

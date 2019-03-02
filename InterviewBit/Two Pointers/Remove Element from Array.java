public class Solution {
    public int removeElement(ArrayList<Integer> a, int b) {
        int p=0;
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i)!=b)
            {
                a.set(p,a.get(i));
                p++;
                continue;
            }
        }
        return p;
    }
}

public class Solution {
    public int removeDuplicates(ArrayList<Integer> a) {
        final int n = a.size();
        if (n <= 2) {
            return n;
        }
        
        int p = 0;
        for (int index = 0; index < n - 2; index++) {
            final int c = a.get(index);
            if (c != a.get(index + 2)) {
                a.set(p, c);
                p++;
            }
        }
        a.set(p, a.get(n - 2));
        a.set(p + 1, a.get(n - 1));
        return p + 2;
    }
}



public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> slidingMaximum(final List<Integer> A, int B) {
        Deque<Integer> q = new LinkedList<Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        int i;
        for(i=0;i<B;i++)
        {
            int x=A.get(i);
            while(!q.isEmpty() && x>=A.get(q.peekLast()))
                q.removeLast();
            q.addLast(i);
        }

        while(i<=A.size())
        {
            al.add(A.get(q.peek()));
            while(!q.isEmpty() && q.peek()<(i-B+1))
                q.removeFirst();
            while(!q.isEmpty() && i<A.size() && A.get(q.peekLast())<=A.get(i))
                q.removeLast();
            q.add(i);
            i++;
        }
        return al;
    }
}

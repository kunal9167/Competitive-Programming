public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int c=0;
        for(int i=0;i<A.size()-1;i++)
        {
            int x1=A.get(i);
            int x2=A.get(i+1);
            int y1=B.get(i);
            int y2=B.get(i+1);
            int X = Math.abs(x2-x1);
            int Y = Math.abs(y2-y1);
            c+=Math.max(X,Y);
        }
        return c;
    }
}


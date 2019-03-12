public class Solution {
    public ArrayList<Integer> prevSmaller(ArrayList<Integer> A) {
        Stack<Integer> s = new Stack<Integer>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++)
        {
            int x=A.get(i);
            while(!s.empty() && s.peek()>=A.get(i))
                s.pop();
            
            if(s.empty())
                al.add(-1);
            else
                al.add(s.peek());
            s.push(x);
        }
        return al;
    }
}

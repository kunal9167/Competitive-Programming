class Solution {
    Stack<Integer> s;
    Stack<Integer> smin;
    // int min;
    Solution()
    {
        s = new Stack<Integer>();
        smin = new Stack<Integer>();
    }
    public void push(int x) {
        s.push(x);
        if(smin.isEmpty())
            smin.push(x);
        else
            smin.push(Math.min(smin.peek(),x));
    }

    public void pop() {
        if(s.isEmpty())
            return ;
        smin.pop();
        s.pop();
    }

    public int top() {
        if(s.isEmpty())
            return -1;
        return s.peek();
    }

    public int getMin() {
        // Stack<Integer> s2=s;
        if(s.isEmpty())
            return -1;
        return smin.peek();
    }
}


public class Solution {
    public ArrayList<Integer> grayCode(int a) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        solution(al,a,0);
        return al;
    }
    int solution(ArrayList<Integer> al,int n,int num)
    {
        if(n==0)
        {
            // System.out.println(num);
            al.add(num);
            return num;
        }
        num = solution(al,n-1,num);
        num=num ^ (1<<(n-1));
        // System.out.println(num);
        num = solution(al,n-1,num);
        return num;
    }
}


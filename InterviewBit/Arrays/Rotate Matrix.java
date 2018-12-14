public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int n=a.size()-1;
        // System.out.println(n);
        for(int i=0;i<=n/2;i++)
        {
            for(int j=i;j<n-i;j++)
            {
                // System.out.println("h");
                int p1=a.get(i).get(j);//(i,j)
                int p2=a.get(j).get(n-i);//(j,n-i)
                int p3=a.get(n-i).get(n-j);//(n-i,n-j)
                int p4=a.get(n-j).get(i);//(n-j,i)

                a.get(i).set(j,p4);
                a.get(j).set(n-i,p1);
                a.get(n-i).set(n-j,p2);
                a.get(n-j).set(i,p3);
            }
        }
    }
}

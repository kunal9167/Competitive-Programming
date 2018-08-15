//Give a N*N square matrix, return an array of its anti-diagonals.

public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        int k=0;
        int l=A.get(0).size()-1;
        // System.out.println(A.size());;
        for(int i=0;i<2*l+1;i++)
        {
            ArrayList<Integer> list = new ArrayList<Integer>();
            int s=0;
            int j=0;
            int z=0;
            for(j=k;j>=0;j--,z++)
            {
                if(j>l)
                    continue;
                if(z>l)
                    break;
                // System.out.println(j +" "+l);
                
                list.add(A.get(z).get(j));
            }
            al.add(list);
            k++;
        }
        return al;
    }
}
	

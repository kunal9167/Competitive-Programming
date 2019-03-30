public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isValidSudoku(final List<String> A) {
        HashMap<Integer,HashSet<Integer>> hscol = new HashMap<Integer,HashSet<Integer>>();
        HashMap<Integer,HashSet<Integer>> hsrow = new HashMap<Integer,HashSet<Integer>>();
        HashMap<Integer,HashSet<Integer>> hsbox = new HashMap<Integer,HashSet<Integer>>();
        
        for(int i=0;i<A.size();i++)
        {
            String s=A.get(i);
            for(int j=0;j<s.length();j++)
            {
                char ch = s.charAt(j);
                if(ch=='.')
                    continue;
                int b=(i/3)*3+(j/3)+1;
                int val=Integer.parseInt(ch+"");
                if(val>9 || val<0)
                    return 0;
                if(hsrow.get(i)==null)
                {
                    hsrow.put(i,new HashSet<Integer>());
                    hsrow.get(i).add(val);
                }
                else
                {
                    if(hsrow.get(i).contains(val))
                    {
                        return 0;
                    }
                    hsrow.get(i).add(val);
                }
                
                if(hscol.get(j)==null)
                {
                    hscol.put(j,new HashSet<Integer>());
                    hscol.get(j).add(val);
                }
                else
                {
                    if(hscol.get(j).contains(val))
                    {
                        return 0;
                    }
                    hscol.get(j).add(val);
                }

                if(hsbox.get(b)==null)
                {
                    hsbox.put(b,new HashSet<Integer>());
                    hsbox.get(b).add(val);
                }
                else
                {
                    if(hsbox.get(b).contains(val))
                    {
                        return 0;
                    }
                    hsbox.get(b).add(val);
                }
            }
        }
        
        return 1;
    }
}

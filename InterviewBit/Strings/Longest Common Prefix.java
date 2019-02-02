public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        int min=Integer.MAX_VALUE,index=0;
        for(int i=0;i<A.size();i++)
        {
            if(min>A.get(i).length())
            {
                min=A.get(i).length();
                index=i;
            }
        }
        int low=0;
        int high=A.get(index).length();
        String s="";
        for(int i=0;i<A.get(index).length();i++)
        {
            char ch=A.get(index).charAt(i);
            for(int j=0;j<A.size();j++)
            {
                if(A.get(j).charAt(i)!=ch)
                    return s;
            }
            s=s+ch;
        }
        return s;
    }
}


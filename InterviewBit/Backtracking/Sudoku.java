public class Solution {
    public void solveSudoku(ArrayList<ArrayList<Character>> a) {
        solve(a);
    }
    public boolean solve(ArrayList<ArrayList<Character>> a)
    {
        int row=-1,col=-1;

        boolean isEmpty=true;
        int n=a.size();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(a.get(i).get(j)=='.')
                {
                    row=i;
                    col=j;
                    isEmpty=false;
                    break;
                }
            }   
        }
        if(isEmpty)
            return true;
        
        for(int num=1;num<=n;num++)
        {
            
            if(isSafe(a,row,col,num))
            {
                // System.out.println("Yes");
                a.get(row).set(col,String.valueOf(num).charAt(0));
                if(!solve(a))
                {
                    a.get(row).set(col,'.');
                }
                else
                    return true;
            }
        }
        return false;
    }
    
    boolean isSafe(ArrayList<ArrayList<Character>> a,int row,int col,int num)
    {
        int bsize = (int)Math.sqrt(a.size());
        int boxStartRow = row - (row%bsize);
        int boxStartCol = col - (col%bsize);
        
        for(int i=0;i<a.size();i++)
        {
            if((a.get(row).get(i)-'0')==num)
                return false;
        }
        for(int i=0;i<a.size();i++)
        {
            if((a.get(i).get(col)-'0')==num)
                return false;
        }
        for(int i=boxStartRow;i<boxStartRow+bsize;i++)
        {
            for(int j=boxStartCol;j<boxStartCol+bsize;j++)
            {
                if((a.get(i).get(j)-'0')==num)
                    return false;
            }
        }
        return true;
    }
}

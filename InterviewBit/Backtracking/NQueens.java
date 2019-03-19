public class Solution {
    public ArrayList<ArrayList<String>> solveNQueens(int a) {
        char ch[][] = new char[a][a];
        for(char[] i:ch)
        {
            Arrays.fill(i,'a');
        }
        ArrayList<ArrayList<String>> ans = new ArrayList<ArrayList<String>>();
        Solution(ans,0,ch,a);
        return ans;
    }
    public void Solution(ArrayList<ArrayList<String>> ans,int row,char ch[][],int n)
    {
        char ch2[][] = new char[n][n];
        for(int i=0;i<n;i++)
        {
            ch2[i]=ch[i].clone();
        }
        for(int i=0;i<n;i++)
        {

            if(ch2[row][i]=='a')
            {
                for(int j=0;j<n;j++)
                {
                    ch2[j][i]='.';
                    ch2[row][j]='.';
                    if(row+j<n && i+j<n)
                       ch2[row+j][i+j]='.';
                    if(row-j>=0 && i-j>=0)
                       ch2[row-j][i-j]='.';
                    if(row-j>=0 && i+j<n)
                       ch2[row-j][i+j]='.';
                    if(row+j<n && i-j>=0)
                       ch2[row+j][i-j]='.';
                }
                ch2[row][i]='Q';
                
                if(row==n-1)
                {
                    ArrayList<String> al = new ArrayList<String>();
                    for(char j[]:ch2)
                        al.add(String.valueOf(j));
                    ans.add(al);
                    return ;
                }
                Solution(ans,row+1,ch2,n);
                for(int i2=0;i2<n;i2++)
                {
                    ch2[i2]=ch[i2].clone();
                }
            }
        }
    }
}

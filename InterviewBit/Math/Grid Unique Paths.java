public class Solution {
    public int uniquePaths(int A, int B) {
        int arr[][] = new int[A][B];
        arr[0][0]=1;
        for(int i=0;i<A;i++)
        {
            arr[i][0]=1;
        }
        for(int i=0;i<B;i++)
        {
            arr[0][i]=1;
        }
        int i=1,j=1;
        while(i<A)
        {
            j=1;
            while(j<B)
            {
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
                j++;
            }
            i++;
        }
        return arr[A-1][B-1];
    }
}


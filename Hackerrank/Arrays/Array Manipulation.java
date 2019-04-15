public class Solution {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] queries) {
        long arr[] = new long[n];
        Arrays.fill(arr,0);
        long max=Integer.MIN_VALUE;
        long s=0;
        for(int i=0;i<queries.length;i++)
        {
            int a=queries[i][0]-1;
            int b=queries[i][1]-1;
            int k=queries[i][2];
            arr[a]+=k;
            if(b+1<n)
                arr[b+1]-=k;
        }
        for(int i=0;i<n;i++)
        {
            s+=arr[i];
            if(s>max)
                max=s;
        }
        return max;

    }
}
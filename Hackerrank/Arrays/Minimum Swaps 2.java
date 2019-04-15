public class Solution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int min=1;
        int count=0;
        for(int i=0;i<arr.length;i++,min++)
        {
            int j;
            for(j=i;j<arr.length;j++)
            {
                if(arr[j]==min)
                    break;
            }
            if(j==min-1)
                continue;
            count++;
            arr[j]=arr[i];
            arr[i]=min;
            // i--;
        }
        return count;
    }
}
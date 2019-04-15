public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int result = 0;
        boolean swapped = false;
        
        do
        {
            swapped = false;
            
            for(int i = 1; i < q.length; i++)
            {
                if(q[i - 1] - i > 2)
                {
                    System.out.println("Too chaotic");
                    return ;
                }
                
                if(q[i - 1] > q[i])
                {
                    //swap elements
                    int cache = q[i];
                    q[i] = q[i - 1];
                    q[i - 1] = cache;
                    
                    swapped = true;
                    result++;
                }
            }
        }
        while(swapped);
        
        System.out.println(result);

    }
}
public class Solution {
    public int sqrt(int a) {
        long start = 0, end = a,number=a; 
        long mid; 
  
        int ans = 0; 
  
        while (start <= end)  
        { 
            mid = (start + end) / 2; 
              
            if (mid * mid == number)  
            { 
                ans = (int)mid; 
                break; 
            } 

            if (mid * mid < number) { 
                start = mid + 1; 
                ans = (int)mid; 
            } 
]
            else { 
                end = mid - 1; 
            } 
        } 
  
        return ans; 
    }
}


public class Solution {
    public int books(ArrayList<Integer> A, int B) {
        int arr[]=new int[A.size()];
        for(int i=0;i<A.size();i++)
        {
            arr[i]=A.get(i);
        }
        return findPages(arr, arr.length, B);
    }
    static boolean isPossible(int arr[], int n, int m, int curr_min) 
    { 
        int studentsRequired = 1; 
        int curr_sum = 0; 
       
        for (int i = 0; i < n; i++) 
        { 
            if (arr[i] > curr_min) 
                return false; 
       
            if (curr_sum + arr[i] > curr_min) 
            { 
                studentsRequired++; 
       
                curr_sum = arr[i]; 
       
                if (studentsRequired > m) 
                    return false; 
            } 
       
            else
                curr_sum += arr[i]; 
        } 
        return true; 
    } 
       
    static int findPages(int arr[], int n, int m) 
    { 
        int sum = 0; 
       
        if (n < m) 
            return -1; 
       
        for (int i = 0; i < n; i++) 
            sum += arr[i]; 
       
        int start = 0, end=sum; 
        int result = Integer.MAX_VALUE; 
       
        while (start <= end) 
        { 
            int mid = (start + end) / 2; 
            if (isPossible(arr, n, m, mid)) 
            { 
                result = Math.min(result, mid); 
       
                end = mid - 1; 
            } 
       
            else
                start = mid + 1; 
        } 
       
        return result; 
    } 
}


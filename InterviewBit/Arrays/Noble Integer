public class Solution {
    public int solve(ArrayList<Integer> A) {
        
        int l=A.size();
        Integer[] arr = new Integer[l];
        arr = A.toArray(arr);
        Arrays.sort(arr);
        
        for(int i=0;i<l;i++)
        {
            if(i<l-1 && arr[i]==arr[i+1])
            continue;
            if(arr[i]==(l-i-1))
                return 1;
        }
        return -1;
    }
}


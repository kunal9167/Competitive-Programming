public class Solution {
    public void sortColors(ArrayList<Integer> a) {
        int low=0,mid=0,high=a.size()-1;
        while(mid<=high)
        {
            int x=a.get(mid);
            switch(x)
            {
                case 0:
                    a.set(mid,a.get(low));
                    a.set(low,0);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    a.set(mid,a.get(high));
                    a.set(high,2);
                    high--;
            }
        }
    }
}

//Given an unsorted array, find the maximum difference between the successive elements in its sorted form.
//Try to solve it in linear time/space.

class Bucket{
    int low;
    int high;
    public Bucket(){
        low = -1;
        high = -1; 
    }
}

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> a) {

        if(a.size() < 2 || a == null)
            return 0;
        int max = a.get(0);
        int min = a.get(0);
        for(int i = 1; i < a.size(); i++){
            max = Math.max(max, a.get(i));
            min = Math.min(min, a.get(i));
        }
        
        Bucket[] buckets = new Bucket[a.size() + 1];
        for(int i =0; i < buckets.length; i++)
            buckets[i] = new Bucket();
        
        double interval = (double)a.size()/(max - min);
        
        for(int i =0; i <a.size(); i++){
            int index = (int)(interval * (a.get(i) - min));
            if(buckets[index].low == -1){
                buckets[index].low = a.get(i);
                buckets[index].high = a.get(i);
            }
            else{
                buckets[index].low = Math.min(buckets[index].low, a.get(i));
                buckets[index].high = Math.max(buckets[index].high, a.get(i));
            }
        }
        int result =0;
        int prev = buckets[0].high;
        for(int i = 1; i< buckets.length; i++){
            if(buckets[i].low != -1){
                result = Math.max(result, buckets[i].low - prev);
                prev = buckets[i].high;
            }
        }
        return result;
    }
}


/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        int l=intervals.size();
        if(l==0)
        {
            intervals.add(newInterval);
            return intervals;
        }
        int f=0;
        for(int i=0;i<l;i++)
        {
            if(intervals.get(i).start>newInterval.start)
            {
                intervals.add(i,newInterval);
                f=1;
                break;
            }
        }
        if(f==0)
        intervals.add(l,newInterval);
        return merge(intervals);
    }
    
    public ArrayList<Interval> merge(ArrayList<Interval> intervals)
    {
        ArrayList<Interval> result = new ArrayList<Interval>();
        Interval pre = intervals.get(0);
        for(int i=0; i<intervals.size(); i++){
            Interval curr = intervals.get(i);
            if(curr.start>pre.end){
                result.add(pre);
                pre = curr;
            }else{
                Interval merged = new Interval(pre.start, Math.max(pre.end, curr.end));
                pre = merged;
            }
        }
        result.add(pre);
        return result;
    }
}


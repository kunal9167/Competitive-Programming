// Given an array of integers, sort the array into a wave like array and return it,
// In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....
public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        for(int i=0;i<A.size()-1;i+=2)
        {
            swap(A,i,i+1);
        }
        return A;
    }
    public void swap(ArrayList<Integer> A, int i,int j)
    {
        int t=A.get(i);
        A.set(i,A.get(j));
        A.set(j,t);
    }
}


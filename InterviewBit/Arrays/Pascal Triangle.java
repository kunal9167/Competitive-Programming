//Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(int a) {
        
        ArrayList<ArrayList<Integer>> retVal = new ArrayList<>();
        for(int i = 1; i<=a; i++){
            ArrayList<Integer> list = new ArrayList<>();
            // for(int j = 1; j<=i; j++){
            //     list.add(0);
            // }
            retVal.add(list);
        }
        if(a-2>=0)
        {
            retVal.get(0).add(1);
            retVal.get(1).add(1);
            retVal.get(1).add(1);
            if(a-2==0)
                return retVal;
        }
        else if(a-1>=0)
        {
            retVal.get(0).add(1);
            return retVal;
        }
        for(int i=2;i<a;i++)
        {
            int j=0;
            
            retVal.get(i).add(1);
            while(j<=i-2)
            {
                retVal.get(i).add((retVal.get(i-1).get(j)+retVal.get(i-1).get(j+1)));
                j++;
            }
            retVal.get(i).add(1);
        }
        return retVal;
    }
}


public class Solution {
    public ArrayList<Integer> solve(String A, ArrayList<String> B) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        HashMap<String,Integer> hm = new HashMap<String,Integer>();

        String good[] = A.split("_");
        for(int i=0;i<B.size();i++)
        {
            String review = B.get(i);
            int s=0;
            for(int j=0;j<good.length;j++)
            {
                String w=good[j];
                int p=review.indexOf(w);
                while(p!=-1)
                {
                    s++;
                    p=review.indexOf(w,p)+1;
                }
            }
            hm.put(review,s);
        }
        Collections.sort(hm,new Comparator<Map.Entry<String,Integer>>(){

            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2)
            {
                if(o1.getValue()>o2.getValue())
                    return 1;
                else if (o1.getValue()<o2.getValue())
                    return -1;
                return 0;
                // return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        for(Map.Entry<String,Integer> entry: hm)
        {
            al.add(entry.getValue());
        }
        return al;
    }
}

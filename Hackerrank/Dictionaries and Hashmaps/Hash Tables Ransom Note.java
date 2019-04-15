public class Solution {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        
        HashMap<String,Integer> hs = new HashMap<>();
        // HashSet<String> hs2 = new HashSet<>();
        for(String w:magazine)
        {
            if(hs.get(w)!=null)
                hs.put(w,hs.get(w)+1);
            else
                hs.put(w,1);
        }

        for(String w:note)
        {
            if((hs.get(w)!=null && hs.get(w)>0))
            {
                int x=hs.get(w)-1;
                hs.put(w,x);
                if(x==0)
                    hs.remove(w);
                continue;
            }
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}
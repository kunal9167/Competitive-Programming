public class Solution {
    public String reverseWords(String a) {
        StringBuffer sb = new StringBuffer(a);
        Scanner sc = new Scanner(a);
        String b="";
        while(sc.hasNext())
            b=sc.next()+" "+b;
        b=b.trim();
        return b;
    }
}


public class Solution {
    public ArrayList<String> restoreIpAddresses(String A) {
        
        ArrayList<String> al = new ArrayList<String>();
        
        if(A.length()>12)
            return al;
        
        int size=A.length();
        String s;
        for(int i=1;i<size-2;i++)
        {
            
            for(int j=i+1;j<size-1;j++)
            {
                for(int k=j+1;k<size;k++)
                {
                    s=A;
                    s=s.substring(0,k)+"."+s.substring(k);
                    s=s.substring(0,j)+"."+s.substring(j);
                    s=s.substring(0,i)+"."+s.substring(i);
                    
                    if(isValid(s))
                    {
                    
                        al.add(s);
                    }
                    
                }
            }
        }

        Collections.sort(al, new Comparator<String>()  
        { 
            public int compare(String o1, String o2) 
            { 
                String a1[] = o1.split("[.]"); 
                String a2[] = o2.split("[.]"); 
  
                int result = 0; 
                for (int i = 0; i < 4 && result == 0; i++)  
                { 
                    result = a1[i].compareTo(a2[i]); 
                } 
                return result; 
            } 
        }); 
        return al; 
    }
    boolean isValid(String s1)
    {
        String arr[]=s1.split("[.]");
        for (String s : arr) { 
            
            int i = Integer.parseInt(s);
            if (s.length() > 3 || i < 0 || i > 255)  
            {
                return false;
            } 
            if (s.length() > 1 && i == 0)
                return false; 
            if (s.length() > 1 && i != 0 && s.charAt(0) == '0') 
                return false; 
        } 
        return true;
    }
}

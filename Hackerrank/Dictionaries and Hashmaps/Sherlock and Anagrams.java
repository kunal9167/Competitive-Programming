public class Solution {

    // Complete the sherlockAndAnagrams function below.

    static boolean isAnagram(String s1,String s2)
    {
        int arr[] = new int[26];
        Arrays.fill(arr,0);
        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);
            arr[ch-'a']+=1;
        }
        for(int i=0;i<s2.length();i++)
        {
            char ch=s2.charAt(i);
            arr[ch-'a']-=1;
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
                return false;
        }
        return true;
    }
}
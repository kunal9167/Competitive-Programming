/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*Complete the function below*/
class GfG{
    public int count(String s)
    {
        //add code here.
        int max=0,cmax=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='1')
            {
                cmax+=1;
            }
            else
            {
                if(cmax>max)
                    max=cmax;
                cmax=0;
            }
        }
        if(cmax>max)
            max=cmax;
        return max;
    }
}

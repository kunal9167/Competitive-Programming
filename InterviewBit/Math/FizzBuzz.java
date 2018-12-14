public class Solution {
    public ArrayList<String> fizzBuzz(int A)
    {
        ArrayList<String> s=new ArrayList<String>(A);
        int i;
        for(i=1;i<=A;i++)
        {
            if(i%5==0&&i%3==0)
            s.add("FizzBuzz");
            else if(i%3==0)
            s.add("Fizz");
            else if(i%5==0)
            s.add("Buzz");
            else
            s.add(Integer.toString(i));
        }
        return s;
    }
}

//Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.

public class Solution {
    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=2;i<A;i++)
        {
            if(isPrime(i) && isPrime(A-i))
            {
                al.add(i);
                al.add(A-i);
                return al;
            }
        }
        return al;
    }
    public boolean isPrime(int x)
    {
        for(int i=2;i<=(int)Math.sqrt(x);i++)
        {
            if(x%i==0)
                return false;
        }
        return true;
    }
}


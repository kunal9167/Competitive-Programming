public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        long long int n=A.size();
    long long int sum=0;
    long long int diff;
    long long int square=0;
    long long int a;
    for(long long int i=0;i<A.size();i++){
        sum+=(long long)A[i];
        square+= (long long)A[i]*(long long)A[i];

    }

    diff= n*(n+1)/2- sum;
    a= n*(n+1)*(2*n+1)/6 -square;
    long long int b;
    b=a/diff;

    vector<int>B;
    B.push_back((b-diff)/2);
    B.push_back((b+diff)/2);
    return B;
    }
}

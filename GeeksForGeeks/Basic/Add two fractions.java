class GfG
{ 	
    void addFraction(int num1, int den1, int num2, int den2)
    {
        // Your code here	
        int a=den1;
        int b=den2;
        // while(a%b!=0)
        //     a+=den1;
        int lcm=den1*den2/gcd(den1,den2);
        
        int x=num1*lcm/den1;
        x+=num2*lcm/den2;
        int g=gcd(x,lcm);
        x=x/g;
        lcm=lcm/g;
        System.out.println(x+"/"+lcm);
    }
    int gcd(int a,int b)
    {
        while(a!=b)
        {
            if(a>b)
                a-=b;
            else
                b=b-a;
        }
        return a;
    }
}

/*
Class of the element of the array is as
class Height {
	int feet;
	int inches;
	public Height(int ft, int inc)
	{
	    feet = ft;
	    inches = inc;
	}
}
*/
// function must return the maximum Height
// return the height in inches
class GfG
{
    public static int findMax(Height arr[], int n)
    {
       // your code here
       int max=0;
       for(int i=0;i<n;i++)
       {
           int cmax=arr[i].feet*12+arr[i].inches;
           if(cmax>max)
           max=cmax;
       }
       return max;
    }
    
}

package com.coder.pad;

public class ArmstrongNumber 
{
	int power(int a, long b)
    {
        /*if( y == 0)
            return 1;
        if (y%2 == 0)
            return power(x, y/2)*power(x, y/2);
        return x*power(x, y/2)*power(x, y/2);*/
		int temp = 1;
		for (int i = 0; i < b; i++) {
			temp = temp * a;
			// System.out.println(i+" "+a+" "+b);
		}
		// System.out.println(temp);
		return temp;
		
    }
 
    /* Function to calculate order of the number */
    int order(int x)
    {
        int n = 0;
        while (x != 0)
        {
            n++;
            x = x/10;
        }
        return n;
    }

    boolean isArmstrong (int x)
    {
        int n = order(x);
        int temp=x, sum=0;
        while (temp!=0)
        {
            int r = temp%10;
            sum = sum + power(r,n);
            temp = temp/10;
        }
        return (sum == x);
    }
    public static void main(String[] args)
    {
    	ArmstrongNumber ob = new ArmstrongNumber();
        int x = 120;
        System.out.println(ob.isArmstrong(x));
        x = 1634;
        System.out.println(ob.isArmstrong(x));
    }
}

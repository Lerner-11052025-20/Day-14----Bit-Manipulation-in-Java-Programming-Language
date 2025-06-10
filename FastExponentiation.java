public class FastExponentiation 
{
    public static int fastExponentiation(int number, int power)
    {
        int product = 1;
        while(power>0)
        {
            if((power&1) == 1)  product *= number;
            number *= number;
            power >>= 1;
        }
        // System.out.println(a);
        return product;
    }
    // public static int fastExponentiation(int n, int pow)
    // {
    //     int product = 1;
    //     while(n>0)
    //     {
    //         if((n&1) == 1)  product *= pow;
    //         pow *= pow;
    //         n >>= 1;
    //     }
    //     return pow;
    // }
    public static void main(String args[])
    {
        int product = 1, n = 2;
        for(int i=1 ; i<=5 ; i++)   product *= n; // O(n)
        System.out.println(product);

        System.out.println(fastExponentiation(2 , 5));
    }    
}

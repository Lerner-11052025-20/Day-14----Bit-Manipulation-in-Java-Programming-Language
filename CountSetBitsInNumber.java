public class CountSetBitsInNumber 
{
    public static int countSetBitsInNumber(int n)
    {
        int count = 0;
        while(n>0)
        {
            if((n&1) == 1)  count++;
            n >>= 1; // n = n>>1;
        }
        return count;
    }
    public static void main(String args[])
    {
        System.out.println(countSetBitsInNumber(255));
    }    
}

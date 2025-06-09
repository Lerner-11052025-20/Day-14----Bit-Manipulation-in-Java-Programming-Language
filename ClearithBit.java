public class ClearithBit
{
    public static int clearIthBit(int n, int i)
    {
        // int bitMask = ~(1<<i);
        // return (n&bitMask);
        return (n & (~(i<<i)) );
    }
    public static void main(String args[])
    {
        System.out.println(clearIthBit(11, 1));
        int n = 11;
        n &= ~(1<<0);
        System.out.println(n);
    }
}
public class ClearLastithBits 
{
    public static int clearLastIbits(int n, int i)
    {
        return n&((~0)<<i);
    }
    public static void main(String args[])
    {
        //Initially je mind ma aavyu te lagavi lidhu aa mari brute force approach thay have aane optimize karu

        int n=7, bits=2;
        System.out.println(clearLastIbits( n, 2));
        // for(int i=0 ; i<bits ; i++)
        // {
        //     n &= (~(1<<i));
        // }
        // System.out.println(n);
    }    
}

public class CLearRangeOfBits 
{
    public static int clearRangeOfBits(int n, int i, int j)
    {
        int a = ((~0)<<(j+1)); // 1111 1111---> <<4+1 ---> 1110 0000
        int b = (1<<i)-1;   //0000 0011
        int bitMask = a|b; // 1110 0011
        return n&bitMask; //  0000 1010
        //                    0000 0010
    }   
    
    public static void main(String args[])
    {
        System.out.println(clearRangeOfBits(31, 2, 4));
    }
}

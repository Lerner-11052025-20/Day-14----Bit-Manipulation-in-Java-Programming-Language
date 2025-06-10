public class GetithBit 
{
    public static int getIthBit(int n, int i)
    {
        int bitMast = 1<<i;
        if((n&bitMast) == 0)    return 0;
        return 1;
    }
    public static void main(String args[])
    {
        System.out.println(getIthBit(11, 2));
    }    
}

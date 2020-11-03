import java.util.*;

public class program
{
    static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        //System.out.printf("%d\n", AddNumbers());
        System.out.printf("%d\n", AddNumbers(5));
        System.out.printf("%d\n", AddNumbers(5, 7));
        System.out.printf("%d\n", AddNumbers(5, 7, -5, 9));
        System.out.printf("%d\n", AddNumbers(5, 7, 9, 11));
        System.out.printf("%d\n", AddNumbers(5, 7, 9, 11, 12, 54, 23, 55, 19, 103, -8, 23, 76, 32, 65));
    }

    public static int AddNumbers(int num, int... nums)
    {
        if(nums.length > 0)
        {
            return num + AddNumbers(nums[0], Arrays.copyOfRange(nums, 1, nums.length));
        }
        else
        {
            return num;
        }
    }
}

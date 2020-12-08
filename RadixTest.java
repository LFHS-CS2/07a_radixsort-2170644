import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

public class RadixTest extends junit.framework.TestCase
{

    public static void main(String args[]) {
        RadixTest test = new RadixTest();
        test.test_radix1();
        test.test_radix2();
        test.test_radix3();
    }

    @Test
    public void test_radix1()
    {
        int[] nums = {360, 55, 21, 88888, 11, 4, 5333, 0};
        int[] ans = {0, 4, 11, 21, 55, 360, 5333, 88888};
        int[] n = Radix.sort(nums, 5);
        boolean yes = true;
        for(int i = 0; i < ans.length; i++)
        {
            if(n[i] != ans[i])
            {
                yes = false;
                break;
            }
        }
        assertTrue(yes);
    }

    @Test
    public void test_radix2()
    {
        int[] nums = {9, 7, 5, 3, 2, 1, 8, 4};
        int[] ans = {1, 2, 3, 4, 5, 7, 8, 9};
        int[] n = Radix.sort(nums, 1);
        boolean yes = true;
        for(int i = 0; i < ans.length; i++)
        {
            if(n[i] != ans[i])
            {
                yes = false;
                break;
            }
        }
        assertTrue(yes);
    }

    @Test
    public void test_radix3()
    {
        int[] nums = {100, 200, 100, 200, 50, 50};
        int[] ans = {50, 50, 100, 100, 200, 200};
        int[] n = Radix.sort(nums, 3);
        boolean yes = true;
        for(int i = 0; i < ans.length; i++)
        {
            if(n[i] != ans[i])
            {
                yes = false;
                break;
            }
        }
        assertTrue(yes);
    }

}

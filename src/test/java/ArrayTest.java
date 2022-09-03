import domain.ListNode;
import org.junit.Test;
import solution.array.*;
import solution.binary_search.P1122RelativeSortArray;
import solution.dynamic_programming.Offer042LCOF;
import solution.hash_table.P0169MajorityElementHash;
import solution.hash_table.P0268MissingNumberHash;
import solution.math.P0169MajorityElementMath;
import solution.math.P0268MissingNumberMath;
import solution.math.P1688CountOfMatchesInTournament;

import java.util.Arrays;
import java.util.List;

/**
 * Description :
 *
 * @author Eric L SHU
 * @date 2021-03-27 13:33
 * @since JDK 1.8
 */
public class ArrayTest
{
    @Test
    public void testP0001()
    {
        P0001TwoSum obj = new P0001TwoSum();
        int[] numbers = {2, 5, 7, 9, 12};
        int sum = 17;
        int[] result = obj.twoNumbersAddUp02(numbers, sum);
        for (int i : result)
        {
            System.out.println("    i = " + i);
        }
    }

    @Test
    public void testP0019()
    {
        P0019RemoveNthNodeFromEndOfList obj = new P0019RemoveNthNodeFromEndOfList();
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode node = obj.removeNthFromEnd(node1, 3);
        System.out.println("node = " + node);
    }

    @Test
    public void testP0035()
    {
        P0035SearchInsertPosition obj = new P0035SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println("result = " + obj.searchInsert_1(nums, target));
    }

    @Test
    public void testP0056()
    {
        P0056MergeIntervals obj = new P0056MergeIntervals();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merge = obj.merge(intervals);
        for (int[] nums : merge)
        {
            System.out.println("nums = " + Arrays.toString(nums));
        }
    }

    @Test
    public void testP0057()
    {
        P0057InsertInterval obj = new P0057InsertInterval();
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};
        int[][] ansList = obj.insert(intervals, newInterval);
        for (int[] nums : ansList)
        {
            System.out.println("ansList[i] = " + Arrays.toString(nums));
        }
    }

    @Test
    public void testP0122()
    {
        P0122BestTimeToBuyAndSellStockII obj = new P0122BestTimeToBuyAndSellStockII();

        // int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] nums = {7, 1, 5, 3, 6, 4};
        System.out.println("result = " + obj.maxProfit_1(nums));
    }

    @Test
    public void testP0941()
    {
        P0941ValidMountainArray obj = new P0941ValidMountainArray();
        int[] nums = {9, 8, 7, 6, 5, 4};
        System.out.println("result = " + obj.validMountainArray(nums));
    }

    @Test
    public void testP1356()
    {
        P1356SortIntegersByTheNumberOf1Bits obj = new P1356SortIntegersByTheNumberOf1Bits();
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("obj.get(i) : " + Arrays.toString(obj.sortByBits_1(arr)));
    }

    @Test
    public void test1122()
    {
        P1122RelativeSortArray obj = new P1122RelativeSortArray();
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, arr2 = {2, 1, 4, 3, 9, 6};
        System.out.println("result = " + Arrays.toString(obj.relativeSortArray(arr1, arr2)));
    }

    @Test
    public void test016()
    {
        P0016ThreeSumClosest obj = new P0016ThreeSumClosest();
        obj.threeSumClosest(new int[]{}, 0);
    }


    @Test
    public void test0018()
    {
        P0018FourSum obj = new P0018FourSum();
        obj.fourSum(new int[]{}, 0);
    }

    @Test
    public void test0033()
    {
        P0033SearchInRotatedSortedArray obj = new P0033SearchInRotatedSortedArray();
//        int[] nums = {4,5,6,7,0,1,2};
        int[] nums = {1};
        int result = obj.search(nums, 1);
        System.out.println("result = " + result);
    }

    @Test
    public void test0034()
    {
        P0034FindFirstAndLastPositionOfElementInSortedArray obj = new P0034FindFirstAndLastPositionOfElementInSortedArray();
        int[] nums = {5, 7, 7, 8, 8, 8, 10};
//        int[] nums = {1};
        int[] result = obj.searchRange(nums, 8);
        System.out.println("result = " + Arrays.toString(result));
    }

    @Test
    public void test0039()
    {
        P0039CombinationSum obj = new P0039CombinationSum();
        int[] nums = {2, 3, 5};
        System.out.println("candidates = " + Arrays.toString(nums));
        List<List<Integer>> result = obj.combinationSum(nums, 8);
        System.out.println("result = " + result);
    }

    @Test
    public void testOffer45()
    {
        Offer045ArrayToMinNumber obj = new Offer045ArrayToMinNumber();
        int[] nums = {3, 30, 34, 5, 9};
        String result = obj.minNumber(nums);
        System.out.println("result = " + result);
    }

    @Test
    public void test0080()
    {
        P0080RemoveDuplicatesFromSortedArrayTwo obj = new P0080RemoveDuplicatesFromSortedArrayTwo();
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        // int[] nums = {1,1,1};
        int result = obj.removeDuplicatesOfficial(nums);
        System.out.println("result = " + result);
        for (int i = 0; i < result; i++)
        {
            System.out.println("nums = " + nums[i]);
        }
    }

    @Test
    public void testOffer03()
    {
        Offer003FindRepeatNumberInArray obj = new Offer003FindRepeatNumberInArray();
        int repeatNumber = obj.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3});
        System.out.println("repeatNumber = " + repeatNumber);
    }

    @Test
    public void test0724()
    {
        P0724FindPivotIndex obj = new P0724FindPivotIndex();
        // int[] nums = {1, 7, 3, 6, 5, 6};
        int[] nums = {1, 1, 1};
        int result = obj.pivotIndex(nums);
        System.out.println("result = " + result);
    }

    @Test
    public void test2022()
    {
        P2022Convert1DArrayInto2DArray obj = new P2022Convert1DArrayInto2DArray();
        System.out.println("result = " + Arrays.deepToString(obj.construct2DArray(new int[]{1, 2, 3, 4}, 1, 2)));
    }

    @Test
    public void test0628()
    {
        P0628MaximumProductOfThreeNumbers obj = new P0628MaximumProductOfThreeNumbers();
        System.out.println("result = " + obj.maximumProductNormalLinearScan(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void testOfferII006()
    {
        OfferII006TwoSumInSortedArray obj = new OfferII006TwoSumInSortedArray();
        int[] index = obj.twoSumByBisection(new int[]{1, 2, 3, 4, 5}, 8);
        System.out.println("result = " + Arrays.toString(index));

    }

    @Test
    public void testP0088()
    {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;

        // int[] nums1 = {0};
        // int[] nums2 = {1};
        // int m = 0, n = 1;

        P0088MergeSortedArray obj = new P0088MergeSortedArray();
        obj.merge3(nums1, m, nums2, n);
        System.out.println("nums = " + Arrays.toString(nums1));
    }

    @Test
    public void test1001()
    {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;

        MianShi1001SortedMergeLCCI lcci = new MianShi1001SortedMergeLCCI();
        lcci.merge(nums1, m, nums2, n);
        System.out.println("lcci = " + Arrays.toString(nums1));
    }

    @Test
    public void test0643()
    {
        P0643MaximumAverageSubarrayOne obj = new P0643MaximumAverageSubarrayOne();
        int[] nums = {-6662, 5432, -8558, -8935, 8731, -3083, 4115, 9931, -4006, -3284, -3024, 1714, -2825, -2374,
                -2750, -959, 6516, 9356, 8040, -2169, -9490, -3068, 6299, 7823, -9767, 5751, -7897, 6680, -1293, -3486,
                -6785, 6337, -9158, -4183, 6240, -2846, -2588, -5458, -9576, -1501, -908, -5477, 7596, -8863, -4088,
                7922, 8231, -4928, 7636, -3994, -243, -1327, 8425, -3468, -4218, -364, 4257, 5690, 1035, 6217, 8880,
                4127, -6299, -1831, 2854, -4498, -6983, -677, 2216, -1938, 3348, 4099, 3591, 9076, 942, 4571, -4200,
                7271, -6920, -1886, 662, 7844, 3658, -6562, -2106, -296, -3280, 8909, -8352, -9413, 3513, 1352, -8825};
        System.out.println("maxAverage = " + obj.findMaxAverage3(nums, 1));
    }

    @Test
    public void testOffer042()
    {
        Offer042LCOF lcof = new Offer042LCOF();
        int maxSubArray = lcof.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println("maxSubArray = " + maxSubArray);
    }

    @Test
    public void test0066()
    {
        P0066PlusOne plusOne = new P0066PlusOne();
        int[] result = plusOne.plusOne(new int[]{9, 9, 9, 9});
        System.out.println("result = " + Arrays.toString(result));
    }

    @Test
    public void test1688()
    {
        P1688CountOfMatchesInTournament obj = new P1688CountOfMatchesInTournament();
        int matches = obj.numberOfMatches(1000);
        System.out.println("matches = " + matches);
    }

    @Test
    public void test0469()
    {
        P0496NextGreaterElementI obj = new P0496NextGreaterElementI();
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] result = obj.nextGreaterElement(nums1, nums2);
        System.out.println("result = " + Arrays.toString(result));
    }

    @Test
    public void test1475()
    {
        P1475FinalPricesWithASpecialDiscountInAShop obj = new P1475FinalPricesWithASpecialDiscountInAShop();
        int[] prices = {8, 4, 6, 2, 3};
        int[] result = obj.finalPrices(prices);
        System.out.println("result = " + Arrays.toString(result));
    }

    @Test
    public void test0169()
    {
        P0169MajorityElementArray array = new P0169MajorityElementArray();
        P0169MajorityElementHash hash = new P0169MajorityElementHash();
        P0169MajorityElementMath math = new P0169MajorityElementMath();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("array result = " + array.majorityElement(nums));
        System.out.println("hash result  = " + hash.majorityElement(nums));
        System.out.println("math result  = " + math.majorityElement(nums));
    }

    @Test
    public void test0268()
    {
        P0268MissingNumberArray array = new P0268MissingNumberArray();
        P0268MissingNumberHash hash = new P0268MissingNumberHash();
        P0268MissingNumberMath math = new P0268MissingNumberMath();

        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("array result = " + array.missingNumber(nums));
        System.out.println("hash  result = " + hash.missingNumber(nums));
        System.out.println("array result = " + math.missingNumber(nums));
    }
}

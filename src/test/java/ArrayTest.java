import domain.ListNode;
import org.junit.Test;
import solution.array.*;
import solution.bs.P0852PeakIndexInAMountainArray;
import solution.bs.P1122RelativeSortArray;
import solution.collection.P0019RemoveNthNodeFromEndOfList;
import solution.design.*;
import solution.dp.Offer042LCOF;
import solution.dp.P0062UniquePaths;
import solution.dp.P0746MinCostClimbingStairs;
import solution.math.*;
import solution.string.P0409LongestPalindrome;

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
        ListNode node = obj.removeNthFromEnd_stack(node1, 3);
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
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] intervals2 = {{1, 4}, {4, 5}};
        System.out.println(Arrays.deepToString(obj.merge_1(intervals1)));
        System.out.println(Arrays.deepToString(obj.merge_2(intervals2)));
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
        P1356SortIntegersByTheNumberOf1Bits p1356 = new P1356SortIntegersByTheNumberOf1Bits();
        System.out.println(Arrays.toString(p1356.sortByBits(new int[]{2, 3, 5, 7, 11, 13, 17, 19})));
        System.out.println(Arrays.toString(p1356.sortByBits_1(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8})));
        System.out.println(Arrays.toString(p1356.sortByBits_2(new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1})));
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
        P0724FindPivotIndex p0724 = new P0724FindPivotIndex();
        int[] nums1 = {1, 7, 3, 6, 5, 6};
        int[] nums2 = {1, 2, 3};
        int[] nums3 = {2, 1, -1};
        System.out.println(p0724.pivotIndex_1(nums3));
        System.out.println(p0724.pivotIndex_2(nums1));
        System.out.println(p0724.pivotIndex_2(nums2));
        System.out.println(p0724.pivotIndex_2(nums3));
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

        M1001SortedMergeLCCI lcci = new M1001SortedMergeLCCI();
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
        P0066PlusOne p0066 = new P0066PlusOne();
        System.out.println(Arrays.toString(p0066.plusOne_1(new int[]{4, 3, 9, 9})));
        System.out.println(Arrays.toString(p0066.plusOne_3(new int[]{4, 3, 9, 9})));
        System.out.println(Arrays.toString(p0066.plusOne_3(new int[]{9, 9, 9, 9})));
        System.out.println(Arrays.toString(p0066.plusOne_2(new int[]{9, 9, 9, 9})));
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
        P0496NextGreaterElementI p0496 = new P0496NextGreaterElementI();
        System.out.println(Arrays.toString(p0496.nextGreaterElement_1(new int[]{2, 4}, new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(p0496.nextGreaterElement_2(new int[]{2, 4}, new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(p0496.nextGreaterElement_3(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})));
        System.out.println(Arrays.toString(p0496.nextGreaterElement_4(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})));
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
        P0169MajorityElement obj = new P0169MajorityElement();
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("sort result = " + obj.majorityElement_sort(nums));
        System.out.println("hash result = " + obj.majorityElement_hash(nums));
        System.out.println("math result = " + obj.majorityElement_math(nums));
    }

    @Test
    public void test0268()
    {
        P0268MissingNumber obj = new P0268MissingNumber();

        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("array result = " + obj.missingNumber_sort(nums));
        System.out.println("hash  result = " + obj.missingNumber_hash(nums));
        System.out.println("math  result = " + obj.missingNumber_math_sum(nums));
        System.out.println("math  result = " + obj.missingNumber_math_bit(nums));
    }

    @Test
    public void test0414()
    {
        P0414ThirdMaximumNumber array = new P0414ThirdMaximumNumber();
        int[] nums = {2, 2, 4, 6, 9, 9, 9, 8, 8, 3, 1};
        // int[] nums = {2, 2,3, 1};
        // int[] nums = {1, 1, 2};
        System.out.println("array result = " + array.thirdMax(nums));
    }

    @Test
    public void test0283()
    {
        int[] nums = {0, 1, 0, 3, 12};
        // int[] nums = {2, 2,3, 1};
        // int[] nums = {1, 1, 2};
        new P0283MoveZeroes().moveZeroes(nums);
        System.out.println("nums = " + Arrays.toString(nums));
    }

    @Test
    public void test1582()
    {
        int[][] mat1 = {
                {1, 0, 0},
                {0, 0, 1},
                {1, 0, 0}
        };

        int[][] mat2 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        int[][] mat3 = {
                {0, 0, 0, 1},
                {1, 0, 0, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}
        };

        int[][] mat4 = {
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1}
        };

        P1582SpecialPositionsInABinaryMatrix binaryMatrix = new P1582SpecialPositionsInABinaryMatrix();

        System.out.println("mat1 = " + binaryMatrix.numSpecial(mat1));
        System.out.println("mat2 = " + binaryMatrix.numSpecial(mat2));
        System.out.println("mat3 = " + binaryMatrix.numSpecial(mat3));
        System.out.println("mat4 = " + binaryMatrix.numSpecial(mat4));
    }

    @Test
    public void test0448()
    {
        P0448FindAllNumbersDisappearedInAnArray obj = new P0448FindAllNumbersDisappearedInAnArray();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> list = obj.findDisappearedNumbers(nums);
        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("list = " + list);
    }

    @Test
    public void test0485()
    {
        P0485MaxConsecutiveOnes obj = new P0485MaxConsecutiveOnes();
        int[] nums = {1, 1, 0, 1, 1, 1};
        // int[] nums = {1,1,1,1,0,1};
        System.out.println("result = " + obj.findMaxConsecutiveOnes(nums));
    }

    @Test
    public void test0500()
    {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        P0500KeyboardRow obj = new P0500KeyboardRow();
        String[] result = obj.findWords(words);
        System.out.println("result = " + Arrays.toString(result));
    }

    @Test
    public void test0506()
    {
        P0506RelativeRanks obj = new P0506RelativeRanks();
        int[] score = {10, 3, 8, 9, 4};
        String[] relativeRanks = obj.findRelativeRanks(score);
        System.out.println("result = " + Arrays.toString(relativeRanks));
    }

    @Test
    public void test0561()
    {
        P0561ArrayPartition obj = new P0561ArrayPartition();
        int[] nums = {6, 2, 6, 5, 1, 2};
        System.out.println("result = " + obj.arrayPairSum(nums));
    }

    @Test
    public void test0575()
    {
        P0575DistributeCandies obj = new P0575DistributeCandies();
        int[] nums = {1, 1, 2, 2, 3, 3};
        System.out.println("result = " + obj.distributeCandies(nums));
    }

    @Test
    public void test0250()
    {
        P0350IntersectionOfTwoArraysII obj = new P0350IntersectionOfTwoArraysII();
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.println("result = " + Arrays.toString(obj.intersect(nums1, nums2)));
    }

    @Test
    public void test0566()
    {
        P0566ReshapeTheMatrix obj = new P0566ReshapeTheMatrix();
        int[][] mat = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        System.out.println(Arrays.deepToString(obj.matrixReshape(mat, 2, 4)));
    }

    @Test
    public void test0118()
    {
        P0118PascalsTriangle obj = new P0118PascalsTriangle();
        List<List<Integer>> lists = obj.generate(10);
        lists.forEach(System.out::println);
    }

    @Test
    public void test0119()
    {
        P0119PascalsTriangleII obj = new P0119PascalsTriangleII();
        System.out.println(obj.getRow(5));
        System.out.println(obj.getRow_1(6));
        System.out.println(obj.getRow_2(7));
        System.out.println(obj.getRow_3(8));
    }

    @Test
    public void test0645()
    {
        P0645SetMismatch obj = new P0645SetMismatch();
        System.out.println(Arrays.toString(obj.findErrorNums_math(new int[]{1, 2, 2, 4})));
        System.out.println(Arrays.toString(obj.findErrorNums_hash(new int[]{1, 2, 3, 4, 6, 5, 3})));
        System.out.println(Arrays.toString(obj.findErrorNums_sort(new int[]{1, 2, 3, 4, 6, 5, 3})));
    }

    @Test
    public void test0036()
    {
        char[][] board1 = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        char[][] board2 = {{'8', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        P0036ValidSudoku obj = new P0036ValidSudoku();
        System.out.println("result 1 = " + obj.isValidSudoku(board1));
        System.out.println("result 2 = " + obj.isValidSudoku(board2));
    }

    @Test
    public void test0073()
    {
        P0073SetMatrixZeroes obj = new P0073SetMatrixZeroes();
        int[][] matrix1 = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] matrix2 = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        obj.setZeroes_2(matrix1);
        obj.setZeroes_3(matrix2);
        System.out.println("matrix1 = " + Arrays.deepToString(matrix1));
        System.out.println("matrix2 = " + Arrays.deepToString(matrix2));
    }

    @Test
    public void test1598()
    {
        P1598CrawlerLogFolder obj = new P1598CrawlerLogFolder();
        String[] logs1 = {"d1/", "d2/", "../", "d21/", "./"};
        String[] logs2 = {"d1/", "d2/", "./", "d3/", "../", "d31/"};
        System.out.println("logs1 = " + obj.minOperations(logs1));
        System.out.println("logs2 = " + obj.minOperations(logs2));
    }

    @Test
    public void test0977()
    {
        P0977SquaresOfASortedArray obj = new P0977SquaresOfASortedArray();
        int[] nums = {-7, -3, 2, 3, 11};
        System.out.println("result = " + Arrays.toString(obj.sortedSquares(nums)));
    }

    @Test
    public void test0189()
    {
        P0189RotateArray obj = new P0189RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        obj.rotate(nums, 3);
        System.out.println("result = " + Arrays.toString(nums));
    }

    @Test
    public void test0035()
    {
        int[] nums = {1, 3, 5, 6};
        P0035SearchInsertPosition obj = new P0035SearchInsertPosition();
        System.out.println("result 5 = " + obj.searchInsert_2(nums, 5));
        System.out.println("result 2 = " + obj.searchInsert_2(nums, 2));
        System.out.println("result 7 = " + obj.searchInsert_2(nums, 7));
    }

    @Test
    public void test0167()
    {
        P0167TwoSum_II_InputArrayIsSorted obj = new P0167TwoSum_II_InputArrayIsSorted();
        System.out.println("result = " + Arrays.toString(obj.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println("result = " + Arrays.toString(obj.twoSum(new int[]{2, 3, 4}, 6)));
        System.out.println("result = " + Arrays.toString(obj.twoSum(new int[]{-1, 0}, -1)));
    }

    @Test
    public void test1608()
    {
        P1608SpecialArrayWithXElementsGreaterThanOrEqualX obj = new P1608SpecialArrayWithXElementsGreaterThanOrEqualX();
        System.out.println("obj 2  = " + obj.specialArray(new int[]{3, 5}));
        System.out.println("obj -1 = " + obj.specialArray(new int[]{0, 0}));
        System.out.println("obj 3  = " + obj.specialArray(new int[]{0, 4, 3, 0, 4}));
        System.out.println("obj -1 = " + obj.specialArray(new int[]{3, 6, 7, 7, 0}));
    }

    @Test
    public void test0852()
    {
        P0852PeakIndexInAMountainArray obj = new P0852PeakIndexInAMountainArray();
        System.out.println(obj.peakIndexInMountainArray_1(new int[]{0, 10, 5, 2}));
        System.out.println(obj.peakIndexInMountainArray_2(new int[]{3, 4, 5, 1}));
        System.out.println(obj.peakIndexInMountainArray_3(new int[]{24, 69, 100, 99, 79, 78, 67, 36, 26, 19}));
    }

    @Test
    public void test1619()
    {
        P1619MeanOfArrayAfterRemovingSomeElements p1619 = new P1619MeanOfArrayAfterRemovingSomeElements();
        int[] arr1 = {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
        int[] arr2 = {6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 5, 0, 5, 5, 0, 8, 7, 6, 8, 0};
        int[] arr3 = {6, 0, 7, 0, 7, 5, 7, 8, 3, 4, 0, 7, 8, 1, 6, 8, 1, 1, 2, 4, 8, 1, 9, 5, 4, 3, 8, 5, 10, 8, 6, 6, 1, 0, 6, 10, 8, 2, 3, 4};
        int[] arr4 = {9, 7, 8, 7, 7, 8, 4, 4, 6, 8, 8, 7, 6, 8, 8, 9, 2, 6, 0, 0, 1, 10, 8, 6, 3, 3, 5, 1, 10, 9, 0, 7, 10, 0, 10, 4, 1, 10, 6, 9, 3, 6, 0, 0, 2, 7, 0, 6, 7, 2, 9, 7, 7, 3, 0, 1, 6, 1, 10, 3};
        int[] arr5 = {4, 8, 4, 10, 0, 7, 1, 3, 7, 8, 8, 3, 4, 1, 6, 2, 1, 1, 8, 0, 9, 8, 0, 3, 9, 10, 3, 10, 1, 10, 7, 3, 2, 1, 4, 9, 10, 7, 6, 4, 0, 8, 5, 1, 2, 1, 6, 2, 5, 0, 7, 10, 9, 10, 3, 7, 10, 5, 8, 5, 7, 6, 7, 6, 10, 9, 5, 10, 5, 5, 7, 2, 10, 7, 7, 8, 2, 0, 1, 1};
        System.out.println(p1619.trimMean(arr1));
        System.out.println(p1619.trimMean(arr2));
        System.out.println(p1619.trimMean(arr3));
        System.out.println(p1619.trimMean(arr4));
        System.out.println(p1619.trimMean(arr5));
    }

    @Test
    public void test0367()
    {
        P0367ValidPerfectSquare p0367 = new P0367ValidPerfectSquare();
        for (int i = 1; i <= 4096; i++)
        {
            if (p0367.isPerfectSquare_3(i))
            {
                System.out.print("i = " + i);
                System.out.println("; Math.sqrt(i) = " + Math.sqrt(i));
            }
        }
    }

    @Test
    public void test1385()
    {
        P1385FindTheDistanceValueBetweenTwoArrays p1385 = new P1385FindTheDistanceValueBetweenTwoArrays();
        int[] arr1 = {4, 5, 8}, arr2 = {10, 9, 1, 8};
        int d = 2;
        System.out.println(p1385.findTheDistanceValue_1(arr1, arr2, d));
        System.out.println(p1385.findTheDistanceValue_2(arr1, arr2, d));
    }

    @Test
    public void test0744()
    {
        P0744FindSmallestLetterGreaterThanTarget obj = new P0744FindSmallestLetterGreaterThanTarget();
        System.out.println(obj.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a'));
        System.out.println(obj.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'));
        System.out.println(obj.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'd'));
    }

    @Test
    public void test2539()
    {
        P1539KthMissingPositiveNumber obj = new P1539KthMissingPositiveNumber();
        System.out.println(obj.findKthPositive(new int[]{2, 3, 4, 7, 11}, 5));
        System.out.println(obj.findKthPositive(new int[]{1, 2, 3, 4}, 2));
    }

    @Test
    public void test0441()
    {
        P0441ArrangingCoins obj = new P0441ArrangingCoins();
        System.out.println(obj.arrangeCoins(5));
        System.out.println(obj.arrangeCoins(8));
    }

    @Test
    public void test1351()
    {
        P1351CountNegativeNumbersInASortedMatrix obj = new P1351CountNegativeNumbersInASortedMatrix();
        int[][] grid1 = {
                {4, 3, 2, 1, -1},
                {3, 2, 1, -1, -2},
                {1, 1, 0, -1, -2},
                {1, -1, -2, -3, -4},
                {-2, -3, -4, -5, -6}
        };
        int[][] grid2 = {
                {3, 2},
                {1, 0}
        };
        System.out.println(obj.countNegatives(grid1));
        System.out.println(obj.countNegatives(grid2));
    }

    @Test
    public void test0074()
    {
        P0074SearchA2DMatrix obj = new P0074SearchA2DMatrix();
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(obj.searchMatrix(matrix, 3));
        System.out.println(obj.searchMatrix(matrix, 13));
    }

    @Test
    public void test1636()
    {
        P1636SortArrayByIncreasingFrequency obj = new P1636SortArrayByIncreasingFrequency();
        int[] nums1 = {2, 3, 1, 3, 2};
        int[] nums2 = {-1, 1, -6, 4, 5, -6, 1, 4, 1};
        System.out.println(Arrays.toString(obj.frequencySort(nums1)));
        System.out.println(Arrays.toString(obj.frequencySort(nums2)));
    }

    @Test
    public void test1337()
    {
        int[][] mat1 = {{1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}};
        int[][] mat2 = {{1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}};
        P1337TheKWeakestRowsInAMatrix p1377 = new P1337TheKWeakestRowsInAMatrix();
        System.out.println(Arrays.toString(p1377.kWeakestRows_1(mat1, 3)));
        System.out.println(Arrays.toString(p1377.kWeakestRows_2(mat2, 2)));
    }

    @Test
    public void test1346()
    {
        P1346CheckIfNAndItsDoubleExist p1346 = new P1346CheckIfNAndItsDoubleExist();
        int[] arr1 = {10, 2, 5, 3};
        int[] arr2 = {7, 1, 14, 11};
        int[] arr3 = {3, 1, 7, 11};
        int[] arr4 = {-10, 12, -20, -8, 15};
        System.out.println(p1346.checkIfExist_3(arr1));
        System.out.println(p1346.checkIfExist_3(arr2));
        System.out.println(p1346.checkIfExist_3(arr3));
        System.out.println(p1346.checkIfExist_3(arr4));
    }

    @Test
    public void test0633()
    {
        P0633SumOfSquareNumbers p0633 = new P0633SumOfSquareNumbers();
        for (int i = 0; i <= 100; i++)
        {
            if (p0633.judgeSquareSum(i))
            {
                System.out.print("i = " + i);
            }
            if (p0633.judgeSquareSum_sqrt(i))
            {
                System.out.print(" ; Sqrt = " + i);
            }
            if (p0633.judgeSquareSum_math(i))
            {
                System.out.println(" ; Math = " + i);
            }
        }
    }

    @Test
    public void test1855()
    {
        P1855MaximumDistanceBetweenAPairOfValues p1855 = new P1855MaximumDistanceBetweenAPairOfValues();
        int[] nums1 = {55, 30, 5, 4, 2}, nums2 = {100, 20, 10, 10, 5};
        System.out.println(p1855.maxDistance_1(nums1, nums2));

        nums1 = new int[]{2, 2, 2};
        nums2 = new int[]{10, 10, 1};
        System.out.println(p1855.maxDistance_2(nums1, nums2));

        nums1 = new int[]{30, 29, 19, 5};
        nums2 = new int[]{25, 25, 25, 25, 25};
        System.out.println(p1855.maxDistance_2(nums1, nums2));
    }

    @Test
    public void test0191()
    {
        P0191NumberOf1Bits p0191 = new P0191NumberOf1Bits();
        System.out.println(p0191.hammingWeight_1(3));
        System.out.println(p0191.hammingWeight_1(1));
        System.out.println(p0191.hammingWeight_2(31));
    }

    @Test
    public void test0231()
    {
        P0231PowerOfTwo p0231 = new P0231PowerOfTwo();
        for (int i = 1; i <= 1024; i++)
        {
            if (p0231.isPowerOfTwo_2(i) && p0231.isPowerOfTwo_3(i))
            {
                System.out.println("i = " + i);
            }
        }
    }

    @Test
    public void test1640()
    {
        P1640CheckArrayFormationThroughConcatenation p1640 = new P1640CheckArrayFormationThroughConcatenation();

        int[] arr = {15, 88};
        int[][] pieces = {{88}, {15}};
        System.out.println(p1640.canFormArray(arr, pieces));

        arr = new int[]{49, 18, 16};
        pieces = new int[][]{{16, 18, 49}};
        System.out.println(p1640.canFormArray(arr, pieces));

        arr = new int[]{91, 4, 64, 78};
        pieces = new int[][]{{78}, {4, 64}, {91}};
        System.out.println(p1640.canFormArray(arr, pieces));
    }

    @Test
    public void test0153()
    {
        P0153FindMinimumInRotatedSortedArray p0153 = new P0153FindMinimumInRotatedSortedArray();
        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};
        int[] nums3 = {11, 13, 15, 17};
        System.out.println(p0153.findMin(nums1));
        System.out.println(p0153.findMin(nums2));
        System.out.println(p0153.findMin(nums3));
    }

    @Test
    public void test1652()
    {
        P1652DefuseTheBomb p1652 = new P1652DefuseTheBomb();
        System.out.println(Arrays.toString(p1652.decrypt(new int[]{5, 7, 1, 4}, 3)));
        System.out.println(Arrays.toString(p1652.decrypt(new int[]{1, 2, 3, 4}, 0)));
        System.out.println(Arrays.toString(p1652.decrypt(new int[]{2, 4, 9, 3}, -2)));
    }

    @Test
    public void testP0349()
    {
        P0349IntersectionOfTwoArrays obj = new P0349IntersectionOfTwoArrays();
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
        int[] result = obj.intersection(nums1, nums2);
        for (int i : result)
        {
            System.out.println("i = " + i);
        }
    }

    @Test
    public void testP0845()
    {
        P0845LongestMountainInArray obj = new P0845LongestMountainInArray();
        int[] nums = {0, 2, 0, 0, 2, 0, 2, 1, 1, 0, 2, 1, 0, 0, 1, 0, 2, 1, 2, 0, 1, 1, 0, 2, 2, 1, 2, 2, 0, 0, 0, 1, 0, 2, 0, 0, 1, 2, 0, 1, 0, 2, 0, 2, 0, 0, 0, 0, 2, 1, 0, 0, 0, 0, 1, 0, 2, 1, 2, 2, 1, 0, 0, 1, 0, 2, 0, 0, 0, 2, 1, 0, 1, 2, 1, 0, 1, 0, 2, 1, 0, 2, 0, 2, 1, 1, 2, 0, 1, 0, 1, 1, 1, 1, 2, 1, 2, 2, 2, 0};
        System.out.println("result = " + obj.longestMountain(nums));
    }

    @Test
    public void test0733()
    {
        int[][] image1 = {
                {1, 1, 1},
                {1, 1, 0},
                {1, 0, 1}
        };

        int[][] image2 = {
                {0, 0, 0},
                {0, 1, 0}
        };

        int[][] image3 = {
                {0, 0, 0},
                {0, 0, 0}
        };

        P0733FloodFill p0733 = new P0733FloodFill();
        System.out.println(Arrays.deepToString(p0733.floodFill_dfs_recursion(image1, 1, 1, 2)));
        System.out.println(Arrays.deepToString(p0733.floodFill_dfs_stack(image2, 1, 1, 2)));
        System.out.println(Arrays.deepToString(p0733.floodFill_bfs_queue(image3, 0, 0, 2)));
    }

    @Test
    public void test0695()
    {
        P0695MaxAreaOfIsland p0695 = new P0695MaxAreaOfIsland();
        int[][] grid = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        System.out.println(p0695.maxAreaOfIsland_bfs_queue(grid));
        System.out.println(p0695.maxAreaOfIsland_dfs_stack(grid));
        System.out.println(p0695.maxAreaOfIsland_dfs_recursion(grid));
    }

    @Test
    public void test0542()
    {
        P0542ZeroOneMatrix p0542 = new P0542ZeroOneMatrix();

        int[][] mat1 = {
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };


        int[][] mat = {
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 0, 1, 1},
                {1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1}
        };
        System.out.println(Arrays.deepToString(p0542.updateMatrix_bfs(mat1)));
        System.out.println(Arrays.deepToString(p0542.updateMatrix_bfs_1(mat)));
        System.out.println(Arrays.deepToString(p0542.updateMatrix_bfs_2(mat)));
        System.out.println(Arrays.deepToString(p0542.updateMatrix_dp(mat)));
    }

    @Test
    public void test0994()
    {
        P0994RottingOranges p0994 = new P0994RottingOranges();
        int[][] grid1 = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}};
        int[][] grid2 = {
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}};
        int[][] grid3 = {{0, 2}};

        int[][] grid4 = {
                {2, 2, 1, 1},
                {1, 1, 1, 0},
                {1, 1, 1, 0},
                {0, 0, 1, 1}};
        System.out.println(p0994.orangesRotting(grid1));
        System.out.println(p0994.orangesRotting(grid2));
        System.out.println(p0994.orangesRotting(grid3));
        System.out.println(p0994.orangesRotting(grid4));
    }

    @Test
    public void test1800()
    {
        P1800MaximumAscendingSubarraySum p1800 = new P1800MaximumAscendingSubarraySum();
        int[] nums1 = {10, 20, 30, 5, 10, 50};
        int[] nums2 = {10, 20, 30, 40, 50};
        int[] nums3 = {12, 17, 15, 13, 10, 11, 12};
        int[] nums4 = {100, 10, 1};
        int[] nums5 = {1};
        System.out.println(p1800.maxAscendingSum(nums1));
        System.out.println(p1800.maxAscendingSum_dp_n(nums2));
        System.out.println(p1800.maxAscendingSum_dp_n(nums3));
        System.out.println(p1800.maxAscendingSum_dp_1(nums4));
        System.out.println(p1800.maxAscendingSum_dp_1(nums5));
    }

    @Test
    public void test0412()
    {
        P0412FizzBuzz p0412 = new P0412FizzBuzz();
        System.out.println(p0412.fizzBuzz_1(15));
        System.out.println(p0412.fizzBuzz_2(15));
    }

    @Test
    public void test1480()
    {
        P1480RunningSumOf1dArray p1480 = new P1480RunningSumOf1dArray();
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 1, 1, 1, 1};
        int[] nums3 = {3, 1, 2, 10, 1};
        System.out.println(Arrays.toString(p1480.runningSum_1(nums1)));
        System.out.println(Arrays.toString(p1480.runningSum_1(nums2)));
        System.out.println(Arrays.toString(p1480.runningSum_2(nums3)));
    }

    @Test
    public void test0075()
    {
        P0075SortColors p0075 = new P0075SortColors();
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        int[] nums2 = {2, 0, 1};
        int[] nums3 = {1};
        p0075.sortColors_2n(nums1);
        p0075.sortColors_n(nums2);
        p0075.sortColors(nums3);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
    }

    @Test
    public void test0976()
    {
        P0976LargestPerimeterTriangle p0976 = new P0976LargestPerimeterTriangle();
        System.out.println(p0976.largestPerimeter(new int[]{2, 1, 2}));
        System.out.println(p0976.largestPerimeter(new int[]{1, 2, 1}));
    }

    @Test
    public void test1779()
    {
        P1779FindNearestPointThatHasTheSameXOrY p1779 = new P1779FindNearestPointThatHasTheSameXOrY();
        int[][] points1 = {{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}};
        int[][] points2 = {{3, 4}};
        int[][] points3 = {{12, 3}};
        System.out.println(p1779.nearestValidPoint(3, 4, points1));
        System.out.println(p1779.nearestValidPoint(3, 4, points2));
        System.out.println(p1779.nearestValidPoint(3, 4, points3));
    }

    @Test
    public void test0048()
    {
        P0048RotateImage p0048 = new P0048RotateImage();
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] matrix2 = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}};
        p0048.rotate_1(matrix1);
        p0048.rotate_2(matrix2);
        System.out.println("matrix1 = " + Arrays.deepToString(matrix1));
        System.out.println("matrix2 = " + Arrays.deepToString(matrix2));

        matrix2 = new int[][]{
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6, 7},
                {15, 14, 12, 16}};
        p0048.rotate_3(matrix2);
        System.out.println("matrix2 = " + Arrays.deepToString(matrix2));
    }

    @Test
    public void test1822()
    {
        P1822SignOfTheProductOfAnArray p1822 = new P1822SignOfTheProductOfAnArray();
        int[] nums1 = {-1, -2, -3, -4, 3, 2, 1};
        int[] nums2 = {1, 5, 0, 2, -3};
        int[] nums3 = {-1, 1, -1, 1, -1};
        System.out.println(p1822.arraySign_1(nums1));
        System.out.println(p1822.arraySign_1(nums2));
        System.out.println(p1822.arraySign_2(nums3));
    }

    @Test
    public void test1502()
    {
        P1502CanMakeArithmeticProgressionFromSequence p1502 = new P1502CanMakeArithmeticProgressionFromSequence();
        System.out.println(p1502.canMakeArithmeticProgression_1(new int[]{3, 5, 1}));
        System.out.println(p1502.canMakeArithmeticProgression_2(new int[]{1, 2, 4}));
    }

    @Test
    public void test0240()
    {
        P0240SearchA2DMatrixII p0240 = new P0240SearchA2DMatrixII();
        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        System.out.println(p0240.searchMatrix_1(matrix, 5));
        System.out.println(p0240.searchMatrix_1(matrix, 20));
        System.out.println(p0240.searchMatrix_2(matrix, 14));
        System.out.println(p0240.searchMatrix_2(matrix, 20));
    }

    @Test
    public void test0059()
    {
        P0059SpiralMatrixII p0059 = new P0059SpiralMatrixII();
        System.out.println(Arrays.deepToString(p0059.generateMatrix(1)));
        System.out.println(Arrays.deepToString(p0059.generateMatrix(3)));
        for (int[] row : p0059.generateMatrix(20))
        {
            System.out.println("row = " + Arrays.toString(row));
        }
    }

    @Test
    public void test0503()
    {
        P0503NextGreaterElementII p0503 = new P0503NextGreaterElementII();
        System.out.println(Arrays.toString(p0503.nextGreaterElements(new int[]{1, 2, 1})));
        System.out.println(Arrays.toString(p0503.nextGreaterElements(new int[]{1, 2, 3, 4, 3})));
    }

    @Test
    public void test0739()
    {
        P0739DailyTemperatures p0739 = new P0739DailyTemperatures();
        int[] temperatures1 = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] temperatures2 = {30, 40, 50, 60};
        int[] temperatures3 = {30, 60, 90};
        System.out.println(Arrays.toString(p0739.dailyTemperatures_reverse(temperatures1)));
        System.out.println(Arrays.toString(p0739.dailyTemperatures_reverse(temperatures2)));
        System.out.println(Arrays.toString(p0739.dailyTemperatures_reverse(temperatures3)));
        System.out.println(Arrays.toString(p0739.dailyTemperatures_forward(temperatures1)));
        System.out.println(Arrays.toString(p0739.dailyTemperatures_forward(temperatures2)));
        System.out.println(Arrays.toString(p0739.dailyTemperatures_forward(temperatures3)));
    }

    @Test
    public void test1232()
    {
        P1232CheckIfItIsAStraightLine p1232 = new P1232CheckIfItIsAStraightLine();
        int[][] coordinates1 = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};
        int[][] coordinates2 = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};
        System.out.println(p1232.checkStraightLine(coordinates1));
        System.out.println(p1232.checkStraightLine(coordinates2));
    }

    @Test
    public void test0409()
    {
        P0409LongestPalindrome p0409 = new P0409LongestPalindrome();
        System.out.println(p0409.longestPalindrome("abccccdd"));
        System.out.println(p0409.longestPalindrome("a"));
    }

    @Test
    public void test2672()
    {
        P1672RichestCustomerWealth p1672 = new P1672RichestCustomerWealth();
        int[][] accounts1 = {{1, 2, 3}, {3, 2, 1}};
        int[][] accounts2 = {{1, 5}, {7, 3}, {3, 5}};
        int[][] accounts3 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        System.out.println(p1672.maximumWealth(accounts1));
        System.out.println(p1672.maximumWealth(accounts2));
        System.out.println(p1672.maximumWealth(accounts3));
    }

    @Test
    public void test1588()
    {
        P1588SumOfAllOddLengthSubArrays p1588 = new P1588SumOfAllOddLengthSubArrays();
        int[] arr1 = {1, 4, 2, 5, 3};
        int[] arr2 = {1, 2};
        int[] arr3 = {10, 11, 12};
        System.out.println(p1588.sumOddLengthSubArrays_n3(arr1));
        System.out.println(p1588.sumOddLengthSubArrays_n3(arr2));
        System.out.println(p1588.sumOddLengthSubArrays_n3(arr3));
    }

    @Test
    public void test1572()
    {
        P1572MatrixDiagonalSum p1572 = new P1572MatrixDiagonalSum();
        int[][] mat1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[][] mat2 = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}};
        int[][] mat3 = {{5}};
        System.out.println(p1572.diagonalSum(mat1));
        System.out.println(p1572.diagonalSum(mat2));
        System.out.println(p1572.diagonalSum(mat3));
    }

    @Test
    public void test0435()
    {
        P0435NonOverlappingIntervals p0435 = new P0435NonOverlappingIntervals();
        int[][] intervals1 = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int[][] intervals2 = {{1, 2}, {1, 2}, {1, 2}};
        int[][] intervals3 = {{1, 2}, {2, 3}};
        System.out.println(p0435.eraseOverlapIntervals_1(intervals1));
        System.out.println(p0435.eraseOverlapIntervals_2(intervals2));
        System.out.println(p0435.eraseOverlapIntervals_2(intervals3));
    }

    @Test
    public void test0238()
    {
        P0238ProductOfArrayExceptSelf p0238 = new P0238ProductOfArrayExceptSelf();
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {-1, 1, 0, -3, 3};
        System.out.println(Arrays.toString(p0238.productExceptSelf_1(nums1)));
        System.out.println(Arrays.toString(p0238.productExceptSelf_2(nums2)));
    }

    @Test
    public void test0334()
    {
        P0334IncreasingTripletSubsequence p0334 = new P0334IncreasingTripletSubsequence();
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {5, 4, 3, 2, 1};
        int[] nums3 = {2, 1, 5, 0, 4, 6};
        System.out.println(p0334.increasingTriplet_1(nums1));
        System.out.println(p0334.increasingTriplet_2(nums2));
        System.out.println(p0334.increasingTriplet_2(nums3));
    }

    @Test
    public void test0560()
    {
        P0560SubarraySumEqualsK p0560 = new P0560SubarraySumEqualsK();
        int[] nums1 = {1, 1, 1};
        int[] nums2 = {1, 2, 3};
        int[] nums3 = {-1, -1, 1};
        int[] nums4 = {0, 0};
        System.out.println(p0560.subarraySum_1(nums1, 2));
        System.out.println(p0560.subarraySum_2(nums2, 3));
        System.out.println(p0560.subarraySum_2(nums3, 1));
        System.out.println(p0560.subarraySum_2(nums4, 0));
    }

    @Test
    public void test0200()
    {
        P0200NumberOfIslands p0200 = new P0200NumberOfIslands();
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        char[][] grid2 = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        System.out.println(p0200.numIslands_bfs(grid1));
        System.out.println(p0200.numIslands_dfs(grid2));
    }

    @Test
    public void testOfferII105()
    {
        OfferII105MaxAreaOfIsland o105 = new OfferII105MaxAreaOfIsland();
        int[][] grid = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        System.out.println(o105.maxAreaOfIsland_bfs(grid));
        grid = new int[][]{
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        System.out.println(o105.maxAreaOfIsland_dfs(grid));
    }

    @Test
    public void test1700()
    {
        P1700NumberOfStudentsUnableToEatLunch p1700 = new P1700NumberOfStudentsUnableToEatLunch();
        System.out.println(p1700.countStudents_1(new int[]{1, 1, 0, 0}, new int[]{0, 1, 0, 1}));
        System.out.println(p1700.countStudents_2(new int[]{1, 1, 1, 0, 0, 1}, new int[]{1, 0, 0, 0, 1, 1}));
    }

    @Test
    public void test1603()
    {
        P1603ParkingSystem1 system1 = new P1603ParkingSystem1(1, 1, 0);
        System.out.println(system1.addCar(1));
        System.out.println(system1.addCar(2));
        System.out.println(system1.addCar(3));
        System.out.println(system1.addCar(1));

        System.out.println("-----");

        P1603ParkingSystem2 system2 = new P1603ParkingSystem2(1, 1, 0);
        System.out.println(system2.addCar(1));
        System.out.println(system2.addCar(2));
        System.out.println(system2.addCar(3));
        System.out.println(system2.addCar(1));
    }

    @Test
    public void test0303()
    {
        int[] nums = {-2, 0, 3, -5, 2, -1};

        P0303NumArray1 p0303NumArray1 = new P0303NumArray1(nums);
        System.out.println(p0303NumArray1.sumRange(0, 2)); // return 1 ((-2) + 0 + 3)
        System.out.println(p0303NumArray1.sumRange(2, 5)); // return -1 (3 + (-5) + 2 + (-1))
        System.out.println(p0303NumArray1.sumRange(0, 5)); // return -3 ((-2) + 0 + 3 + (-5) + 2 + (-1))

        P0303NumArray2 p0303NumArray2 = new P0303NumArray2(nums);
        System.out.println(p0303NumArray2.sumRange(0, 2));
        System.out.println(p0303NumArray2.sumRange(2, 5));
        System.out.println(p0303NumArray2.sumRange(0, 5));
    }

    @Test
    public void test0304()
    {
        int[][] matrix = {
                {3, 0, 1, 4, 2},
                {5, 6, 3, 2, 1},
                {1, 2, 0, 1, 5},
                {4, 1, 0, 1, 7},
                {1, 0, 3, 0, 5}};

        // 一维前缀和
        P0304NumMatrix1 numMatrix1 = new P0304NumMatrix1(matrix);
        System.out.println(numMatrix1.sumRegion(2, 1, 4, 3));
        System.out.println(numMatrix1.sumRegion(1, 1, 2, 2));
        System.out.println(numMatrix1.sumRegion(1, 2, 2, 4));

        // 二维前缀和
        P0304NumMatrix2 numMatrix2 = new P0304NumMatrix2(matrix);
        System.out.println(numMatrix2.sumRegion(2, 1, 4, 3));
        System.out.println(numMatrix2.sumRegion(1, 1, 2, 2));
        System.out.println(numMatrix2.sumRegion(1, 2, 2, 4));
    }

    @Test
    public void test0746()
    {
        P0746MinCostClimbingStairs p0746 = new P0746MinCostClimbingStairs();
        int[] nums1 = {10, 15, 20};
        int[] nums2 = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        System.out.println(p0746.minCostClimbingStairs_dpn(nums1));
        System.out.println(p0746.minCostClimbingStairs_dp1(nums1));
        System.out.println(p0746.minCostClimbingStairs_dpn(nums2));
        System.out.println(p0746.minCostClimbingStairs_dp1(nums2));
        System.out.println(p0746.minCostClimbingStairs_dp(nums1));
        System.out.println(p0746.minCostClimbingStairs_dp(nums2));
    }

    @Test
    public void test1046()
    {
        P1046LastStoneWeight p1046 = new P1046LastStoneWeight();
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(p1046.lastStoneWeight_1(stones));
        System.out.println(p1046.lastStoneWeight_2(stones));
    }

    @Test
    public void test0062()
    {
        P0062UniquePaths p0062 = new P0062UniquePaths();
        System.out.println(p0062.uniquePaths_dp(3, 2));
        System.out.println(p0062.uniquePaths_dp(3, 7));
        System.out.println(p0062.uniquePaths_math(7, 3));
        System.out.println(p0062.uniquePaths_math(3, 3));
    }

    @Test
    public void test0215()
    {
        P0215KthLargestElementInAnArray p0215 = new P0215KthLargestElementInAnArray();
        int[] arr1 = {3, 2, 1, 5, 6, 4};
        int[] arr2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        System.out.println(p0215.findKthLargest(arr1, 2));
        System.out.println(p0215.findKthLargest(arr2, 4));
    }

    @Test
    public void test0347()
    {
        P0347TopKFrequentElements p0347 = new P0347TopKFrequentElements();
        int[] nums1 = {1, 1, 1, 2, 2, 3, 4, 0, 0, 0, 4, 4, 4, 0, 0};
        System.out.println(Arrays.toString(p0347.topKFrequent(nums1, 2)));
    }

    @Test
    public void test0973()
    {
        P0973KClosestPointsToOrigin p0973 = new P0973KClosestPointsToOrigin();
        int[][] points1 = {{1, 3}, {-2, 2}};
        int[][] points2 = {{3, 3}, {5, -1}, {-2, 4}};
        System.out.println(Arrays.deepToString(p0973.kClosest_sort(points1, 1)));
        System.out.println(Arrays.deepToString(p0973.kClosest_pq1(points2, 2)));
        System.out.println(Arrays.deepToString(p0973.kClosest_pq2(points1, 1)));
        System.out.println(Arrays.deepToString(p0973.kClosest_pq2(points2, 2)));
    }

    @Test
    public void test0997()
    {
        P0997FindTheTownJudge p0997 = new P0997FindTheTownJudge();
        int[][] trust1 = {{1, 2}};
        int[][] trust2 = {{1, 3}, {2, 3}};
        int[][] trust3 = {{1, 3}, {2, 3}, {3, 1}};
        System.out.println(p0997.findJudge_1(2, trust1));
        System.out.println(p0997.findJudge_2(3, trust2));
        System.out.println(p0997.findJudge_2(3, trust3));
    }

    @Test
    public void test0841()
    {
        P0841KeysAndRooms p0841 = new P0841KeysAndRooms();
        List<List<Integer>> rooms1 = List.of(List.of(1), List.of(2), List.of(3), List.of());
        List<List<Integer>> rooms2 = List.of(List.of(1, 3), List.of(3, 0, 1), List.of(2), List.of(0));
        System.out.println(p0841.canVisitAllRooms_dfs(rooms1));
        System.out.println(p0841.canVisitAllRooms_bfs(rooms1));
        System.out.println(p0841.canVisitAllRooms_bfs(rooms2));
        System.out.println(p0841.canVisitAllRooms_dfs(rooms2));
    }

    @Test
    public void test1557()
    {
        P1557MinimumNumberOfVerticesToReachAllNodes p1557 = new P1557MinimumNumberOfVerticesToReachAllNodes();
        List<List<Integer>> edges1 = List.of(List.of(0, 1), List.of(0, 1), List.of(2, 5), List.of(3, 4), List.of(4, 2));
        List<List<Integer>> edges2 = List.of(List.of(0, 1), List.of(2, 1), List.of(3, 1), List.of(1, 4), List.of(2, 4));
        System.out.println(p1557.findSmallestSetOfVertices(6, edges1));
        System.out.println(p1557.findSmallestSetOfVertices(5, edges2));
    }

    @Test
    public void test0055()
    {
        P0055JumpGame p0055 = new P0055JumpGame();
        System.out.println(p0055.canJump_1(new int[]{2, 3, 1, 1, 4}));
        System.out.println(p0055.canJump_2(new int[]{3, 2, 1, 0, 4}));
        System.out.println(p0055.canJump_3(new int[]{2, 3, 0, 1, 4}));
    }

    @Test
    public void test0045()
    {
        P0045JumpGameII p0045 = new P0045JumpGameII();
        System.out.println(p0045.jump_1(new int[]{2, 3, 1, 1, 4}));
        System.out.println(p0045.jump_2(new int[]{2, 3, 0, 1, 4}));
        System.out.println(p0045.jump_2(new int[]{2, 3, 1, 2, 4, 2, 3}));
    }

    @Test
    public void test0896()
    {
        P0896MonotonicArray p0896 = new P0896MonotonicArray();
        System.out.println(p0896.isMonotonic_2n(new int[]{1, 2, 2, 3}));
        System.out.println(p0896.isMonotonic_n(new int[]{6, 5, 4, 4}));
        System.out.println(p0896.isMonotonic_n(new int[]{1, 3, 2}));
    }

    @Test
    public void test1886()
    {
        P1886DetermineWhetherMatrixCanBeObtainedByRotation p1886 = new P1886DetermineWhetherMatrixCanBeObtainedByRotation();
        int[][] matrix1 = {
                {0, 1},
                {1, 0}};
        int[][] target1 = {
                {1, 0},
                {0, 1}};
        int[][] matrix2 = {
                {0, 1},
                {1, 1}};
        int[][] target2 = {
                {1, 0},
                {0, 1}};
        int[][] matrix3 = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}};
        int[][] target3 = {
                {1, 1, 1},
                {0, 1, 0},
                {0, 0, 0}};
        System.out.println(p1886.findRotation_1(matrix1, target1));
        System.out.println(p1886.findRotation_1(matrix2, target2));
        System.out.println(p1886.findRotation_2(matrix3, target3));
    }

    @Test
    public void test0054()
    {
        P0054SpiralMatrix p0054 = new P0054SpiralMatrix();
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        System.out.println(p0054.spiralOrder_1(matrix1));
        System.out.println(p0054.spiralOrder_2(matrix2));
    }

    @Test
    public void test1630()
    {
        P1630ArithmeticSubArrays p1630 = new P1630ArithmeticSubArrays();
        System.out.println(p1630.checkArithmeticSubArrays(new int[]{4, 6, 5, 9, 3, 7}, new int[]{0, 0, 2}, new int[]{2, 3, 5}));
        System.out.println(p1630.checkArithmeticSubArrays(new int[]{-12, -9, -3, -12, -6, 15, 20, -25, -20, -15, -10},
                new int[]{0, 1, 6, 4, 8, 7}, new int[]{4, 4, 9, 7, 9, 10}));
        System.out.println(p1630.checkArithmeticSubArrays(new int[]{1, 2, 10, -6, -7, 8, 16, 0, 0, 10, 20, 15, -2, -3, -1, -4, -4, -8, -2},
                new int[]{14, 5, 11, 15, 12, 13, 9, 7, 0}, new int[]{15, 8, 14, 18, 15, 16, 12, 8, 1}));
    }

    @Test
    public void test0031()
    {
        P0031NextPermutation p0031 = new P0031NextPermutation();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {3, 2, 1};
        int[] nums3 = {1, 1, 5};
        p0031.nextPermutation(nums1);
        p0031.nextPermutation(nums2);
        p0031.nextPermutation(nums3);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        System.out.println(Arrays.toString(nums3));
    }

    @Test
    public void test0556()
    {
        P0556NextGreaterElementIII p0556 = new P0556NextGreaterElementIII();
        System.out.println(p0556.nextGreaterElement(12));
        System.out.println(p0556.nextGreaterElement(21));
        System.out.println(p0556.nextGreaterElement(123433211));
        System.out.println(p0556.nextGreaterElement(Integer.MAX_VALUE));
    }

    @Test
    public void test0713()
    {
        P0713SubarrayProductLessThanK p0713 = new P0713SubarrayProductLessThanK();
        System.out.println(p0713.numSubarrayProductLessThanK_1(new int[]{1, 2, 3}, 0));
        System.out.println(p0713.numSubarrayProductLessThanK_2(new int[]{10, 5, 2, 6}, 100));
    }

    @Test
    public void test0599()
    {
        P0599MinimumIndexSumOfTwoLists p0599 = new P0599MinimumIndexSumOfTwoLists();
        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        String[] list3 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list4 = {"Tapioca Express", "Shogun", "Burger King"};
        System.out.println(Arrays.toString(p0599.findRestaurant(list1, list2)));
        System.out.println(Arrays.toString(p0599.findRestaurant(list3, list4)));
    }

    @Test
    public void test0063()
    {
        P0063UniquePathsII p0063 = new P0063UniquePathsII();
        int[][] obstacleGrid1 = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}};
        int[][] obstacleGrid2 = {
                {0, 1},
                {0, 0}};
        int[][] obstacleGrid3 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 0}};
        System.out.println(p0063.uniquePathsWithObstacles_mn(obstacleGrid1));
        System.out.println(p0063.uniquePathsWithObstacles_mn(obstacleGrid2));
        System.out.println(p0063.uniquePathsWithObstacles_mn(obstacleGrid3));
        System.out.println(p0063.uniquePathsWithObstacles_n(obstacleGrid1));
        System.out.println(p0063.uniquePathsWithObstacles_n(obstacleGrid2));
        System.out.println(p0063.uniquePathsWithObstacles_n(obstacleGrid3));
    }

    @Test
    public void test0064()
    {
        P0064MinimumPathSum p0064 = new P0064MinimumPathSum();
        int[][] grid1 = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}};
        int[][] grid2 = {
                {1, 2, 3},
                {4, 5, 6}};
        System.out.println(p0064.minPathSum_1(grid1));
        System.out.println(p0064.minPathSum_2(grid2));
    }

    @Test
    public void test1785()
    {
        P1785MinimumElementsToAddToFormAGivenSum p1785 = new P1785MinimumElementsToAddToFormAGivenSum();
        System.out.println(p1785.minElements(new int[]{1, -1, 1}, 3, -4));
        System.out.println(p1785.minElements(new int[]{1, -1, 1}, 100, -0));
    }

    @Test
    public void test0918()
    {
        P0918MaximumSumCircularSubarray p0918 = new P0918MaximumSumCircularSubarray();
        int[] nums1 = {1, -2, 3, -2};
        int[] nums2 = {5, -3, 5};
        int[] nums3 = {3, -2, 2, -3};
        System.out.println(p0918.maxSubarraySumCircular_1(nums1));
        System.out.println(p0918.maxSubarraySumCircular_2(nums2));
        System.out.println(p0918.maxSubarraySumCircular_2(nums3));
    }
}

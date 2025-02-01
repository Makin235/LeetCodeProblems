import MkImplementations.ProgrammingSkills;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ProgrammingSkills ps = new ProgrammingSkills();

        //mergeAlternately
        /*String word11 = "abc";
        String word12 = "pqr";
        String word21 = "ab";
        String word22 = "pqrs";
        String word31 = "abcd";
        String word32 = "pq";
        System.out.println(word11 + " + " + word12 + " : " + ps.mergeAlternately_1768_e(word11, word12));
        System.out.println(word21 + " + " + word22 + " : " + ps.mergeAlternately_1768_e(word21, word22));
        System.out.println(word31 + " + " + word32 + " : " + ps.mergeAlternately_1768_e(word31, word32));*/

        //findTheDifference
        /*String s1 = "abcd";
        String t1 = "abcde";
        String s2 = "";
        String t2 = "y";
        System.out.println(t1 + " - " + s1 + " : " + ps.findTheDifference_389_e(s1, t1));
        System.out.println(t2 + " - " + s2 + " : " + ps.findTheDifference_389_e(s2, t2));*/

        //indexOfFirstOccurrence
        /*String haystack1 = "sadbutsad";
        String needle1 = "sad";
        String haystack2 = "leetcode";
        String needle2 = "leeto";
        String haystack3 = "programming";
        String needle3 = "gram";
        System.out.println("First occurrence index of " + needle1 + " in " + haystack1 + " : "
                + ps.indexOfFirstOccurrence_28_e_v1(haystack1, needle1));
        System.out.println("First occurrence index of " + needle2 + " in " + haystack2 + " : "
                + ps.indexOfFirstOccurrence_28_e_v1(haystack2, needle2));
        System.out.println("First occurrence index of " + needle3 + " in " + haystack3 + " : "
                + ps.indexOfFirstOccurrence_28_e_v1(haystack3, needle3));
        System.out.println("First occurrence index of " + needle1 + " in " + haystack1 + " : "
                + ps.indexOfFirstOccurrence_28_e_v2(haystack1, needle1));
        System.out.println("First occurrence index of " + needle2 + " in " + haystack2 + " : "
                + ps.indexOfFirstOccurrence_28_e_v2(haystack2, needle2));
        System.out.println("First occurrence index of " + needle3 + " in " + haystack3 + " : "
                + ps.indexOfFirstOccurrence_28_e_v2(haystack3, needle3));
        System.out.println("First occurrence index of " + needle1 + " in " + haystack1 + " : "
                + ps.indexOfFirstOccurrence_28_e_v3(haystack1, needle1));
        System.out.println("First occurrence index of " + needle2 + " in " + haystack2 + " : "
                + ps.indexOfFirstOccurrence_28_e_v3(haystack2, needle2));
        System.out.println("First occurrence index of " + needle3 + " in " + haystack3 + " : "
                + ps.indexOfFirstOccurrence_28_e_v3(haystack3, needle3));*/

        //isAnagram
        /*String s1 = "anagram";
        String t1 = "nagaram";
        String s2 = "rat";
        String t2 = "car";
        System.out.println(t1 + " is anagram of " + s1 + " : " + ps.isAnagram_242_e(s1, t1));
        System.out.println(t2 + " is anagram of " + s2 + " : " + ps.isAnagram_242_e(s2, t2));*/

        //repeatedSubstringPattern
        /*String s1 = "abab";
        String s2 = "aba";
        String s3 = "abcabcabcabc";
        String s4 = "c";
        String s5 = "ddd";
        System.out.println(s1 + " is a repeated substring: " + ps.repeatedSubstringPattern_459_e_v1(s1));
        System.out.println(s2 + " is a repeated substring: " + ps.repeatedSubstringPattern_459_e_v1(s2));
        System.out.println(s3 + " is a repeated substring: " + ps.repeatedSubstringPattern_459_e_v1(s3));
        System.out.println(s4 + " is a repeated substring: " + ps.repeatedSubstringPattern_459_e_v1(s4));
        System.out.println(s5 + " is a repeated substring: " + ps.repeatedSubstringPattern_459_e_v1(s5));*/

        //moveZeroes
        /*int nums[] = {0, 1, 0,0,5,12,6,0};
        ps.moveZeroes_283_e(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.println(i + ": " + nums[i]);
        }*/

        //plusOne
        /*int digits1 [] = {1,2,3};
        int digits2 [] = {4,3,2,1};
        int digits3 [] = {9};
        System.out.println(Arrays.toString(digits1) + " incremented by 1: " +
                Arrays.toString(ps.plusOne_66_e(digits1)));
        System.out.println(Arrays.toString(digits2) + " incremented by 1: " +
                Arrays.toString(ps.plusOne_66_e(digits2)));
        System.out.println(Arrays.toString(digits3) + " incremented by 1: " +
                Arrays.toString(ps.plusOne_66_e(digits3)));*/

        //arraySign
        /*int[] arr1 = {-1,-2,-3,-4,3,2,1};
        int[] arr2 = {1,5,0,2,-3};
        int[] arr3 = {-1,1,-1,1,-1};
        System.out.println("Product sign of " + Arrays.toString(arr1) + " : " + ps.arraySign_1822_e(arr1));
        System.out.println("Product sign of " + Arrays.toString(arr2) + " : " + ps.arraySign_1822_e(arr2));
        System.out.println("Product sign of " + Arrays.toString(arr3) + " : " + ps.arraySign_1822_e(arr3));*/

        //canMakeArithmeticProgression
        /*int [] arr1 = {3,5,1};
        int [] arr2 = {1,2,4};
        System.out.println(Arrays.toString(arr1) + " can make arithmetic progression: "+ ps.canMakeArithmeticProgression_1502_e(arr1));
        System.out.println(Arrays.toString(arr2) + " can make arithmetic progression: " + ps.canMakeArithmeticProgression_1502_e(arr2));*/

        //isMonotonic
        /*int [] nums1 = {1,2,2,3};
        int [] nums2 = {6,5,4,4};
        int [] nums3 = {1,3,2};
        int [] nums4 = {1,1,1};
        System.out.println(Arrays.toString(nums1) + " is monotonic: " + ps.isMonotonic_896_e(nums1));
        System.out.println(Arrays.toString(nums2) + " is monotonic: " + ps.isMonotonic_896_e(nums2));
        System.out.println(Arrays.toString(nums3) + " is monotonic: " + ps.isMonotonic_896_e(nums3));
        System.out.println(Arrays.toString(nums4) + " is monotonic: " + ps.isMonotonic_896_e(nums4));*/

        //romanToInt
        /*String str1 = "III";
        String str2 = "LVIII";
        String str3 = "MCMXCIV";
        System.out.println(str1 + " to Int: " + ps.romanToInt_13_e(str1));
        System.out.println(str2 + " to Int: " + ps.romanToInt_13_e(str2));
        System.out.println(str3 + " to Int: " + ps.romanToInt_13_e(str3));*/

        //lengthOfLastWord
        /*String str1 = "Hello World";
        String str2 = "   fly me   to   the moon  ";
        String str3 = "luffy is still joyboy";
        System.out.println("Length of last word in \"" + str1 + "\" : " + ps.lengthOfLastWord_58_e(str1));
        System.out.println("Length of last word in \"" + str2 + "\" : " + ps.lengthOfLastWord_58_e(str2));
        System.out.println("Length of last word in \"" + str3 + "\" : " + ps.lengthOfLastWord_58_e(str3));*/

        //toLowerCase
        /*String str1 = "Hello";
        String str2 = "here";
        String str3 = "LOVELY";
        System.out.println(str1 + " : " + ps.toLowerCase_709_e(str1));
        System.out.println(str2 + " : " + ps.toLowerCase_709_e(str2));
        System.out.println(str3 + " : " + ps.toLowerCase_709_e(str3));*/

        //calculatePoints
        /*String [] arr1 = {"5","2","C","D","+"};
        String [] arr2 = {"5","-2","4","C","D","9","+","+"};
        String [] arr3 = {"1","C"};
        System.out.println(Arrays.toString(arr1) + " points: " + ps.calculatePoints_682_e(arr1));
        System.out.println(Arrays.toString(arr2) + " points: " + ps.calculatePoints_682_e(arr2));
        System.out.println(Arrays.toString(arr3) + " points: " + ps.calculatePoints_682_e(arr3));*/

        //judgeCircle
        /*String moves1 = "UD";
        String moves2 = "LL";
        String moves3 = "RDRDUULL";
        System.out.println("Robot returned to origin after moves \"" + moves1 + "\" : " + ps.judgeCircle_657_e(moves1));
        System.out.println("Robot returned to origin after moves \"" + moves2 + "\" : " + ps.judgeCircle_657_e(moves2));
        System.out.println("Robot returned to origin after moves \"" + moves3 + "\" : " + ps.judgeCircle_657_e(moves3));*/

        //ticTacToe
        /*int[][] moves1 = {{0,0},{2,0},{1,1},{2,1},{2,2}};
        int[][] moves2 = {{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}};
        int[][] moves3 = {{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2},{2,2}};
        System.out.println("Winner of " + Arrays.deepToString(moves1) + " : " + ps.ticTacToe_1275_e(moves1));
        System.out.println("Winner of " + Arrays.deepToString(moves2) + " : " + ps.ticTacToe_1275_e(moves2));
        System.out.println("Winner of " + Arrays.deepToString(moves3) + " : " + ps.ticTacToe_1275_e(moves3));*/

        //isRobotBounded_1041

        //maximumWealth
        /*int [][] accounts1 = {{1,2,3},{3,2,1}};
        int [][] accounts2 = {{1,5},{7,3},{3,5}};
        int [][] accounts3 = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println("Richest customer in " + Arrays.deepToString(accounts1) + " : " + ps.maximumWealth_1672_e(accounts1));
        System.out.println("Richest customer in " + Arrays.deepToString(accounts2) + " : " + ps.maximumWealth_1672_e(accounts2));
        System.out.println("Richest customer in " + Arrays.deepToString(accounts3) + " : " + ps.maximumWealth_1672_e(accounts3));*/

        //diagonalSum
        /*int [][] mat1 = {{1,2,3},{4,5,6},{7,8,9}};
        int [][] mat2 = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        int [][] mat3 = {{5}};
        System.out.println("Diagonal Sum in " + Arrays.deepToString(mat1) + " : " + ps.diagonalSum_1572_e(mat1));
        System.out.println("Diagonal Sum in " + Arrays.deepToString(mat2) + " : " + ps.diagonalSum_1572_e(mat2));
        System.out.println("Diagonal Sum in " + Arrays.deepToString(mat3) + " : " + ps.diagonalSum_1572_e(mat3));*/

        //spiralOrder

        //setZeroes

        //countOdds
        /*int low1 = 3;
        int high1 = 7;
        int low2 = 8;
        int high2 = 10;
        System.out.println("Odds number between " + low1 + " and " + high1 +
                " : " + ps.countOdds_1523_e(low1, high1));
        System.out.println("Odds number between " + low2 + " and " + high2 +
                " : " + ps.countOdds_1523_e(low2, high2));*/

        //average
        /*int [] salary1 = {4000,3000,1000,2000};
        int [] salary2 = {1000,2000,3000};
        System.out.println("Average of " + Arrays.toString(salary1) + " : " + ps.average_1491_e(salary1));
        System.out.println("Average of " + Arrays.toString(salary2) + " : " + ps.average_1491_e(salary2));*/

        //lemonadeChange
//        int [] bills1 = {5,5,5,10,20};
//        int [] bills2 = {5,5,10,10,20};
//        System.out.println("Correct change of " + Arrays.toString(bills1) + " is provided : " + ps.lemonadeChange_860_e(bills1));
//        System.out.println("Correct change of " + Arrays.toString(bills2) + " is provided : " + ps.lemonadeChange_860_e(bills2));

        //largestPerimeter
        int [] nums1 = {2,1,2};
        int [] nums2 = {1,2,1,10};
        int [] nums3 = {1,2,1,2,10};
        int [] nums4 = {1,2,1,2,7,8};
        System.out.println("The largest perimeter of a triangle from " + Arrays.toString(nums1) + " is : " + ps.largestPerimeter_976_e(nums1));
        System.out.println("The largest perimeter of a triangle from " + Arrays.toString(nums2) + " is : " + ps.largestPerimeter_976_e(nums2));
        System.out.println("The largest perimeter of a triangle from " + Arrays.toString(nums3) + " is : " + ps.largestPerimeter_976_e(nums3));
        System.out.println("The largest perimeter of a triangle from " + Arrays.toString(nums4) + " is : " + ps.largestPerimeter_976_e(nums4));

        //checkStraightLine

        //addBinary

        //multiply
        /*String num11 = "987654321";
        String num12 = "123456789";
        String num21 = "840477629533";
        String num22 = "498828660196";
        String num31 = "2";
        String num32 = "3";
        String num41 = "456";
        String num42 = "123";
        System.out.println(num11 + " * " + num12 + ": " + ps.multiply_43_m_v1(num11, num12));
        System.out.println(num21 + " * " + num22 + ": " + ps.multiply_43_m_v1(num21, num22));
        System.out.println(num31 + " * " + num32 + ": " + ps.multiply_43_m_v1(num31, num32));
        System.out.println(num41 + " * " + num42 + ": " + ps.multiply_43_m_v1(num41, num42));

        System.out.println(num11 + " * " + num12 + ": " + ps.multiply_43_m_v2(num11, num12));
        System.out.println(num21 + " * " + num22 + ": " + ps.multiply_43_m_v2(num21, num22));
        System.out.println(num31 + " * " + num32 + ": " + ps.multiply_43_m_v2(num31, num32));
        System.out.println(num41 + " * " + num42 + ": " + ps.multiply_43_m_v2(num41, num42));*/

        //myPow

        //mergeTwoLists

        //reverseList

        //addTwoNumbers

        //addTwoNumbersII
    }
}
package MkImplementations;

import MkCustomizedClasses.ListNode;

import java.util.*;

public class ProgrammingSkills implements MkInterfaces.ProgrammingSkillsInterface {

    @Override
    public String mergeAlternately_1768_e(String word1, String word2) {
        StringBuilder mergedStr = new StringBuilder();
        int i;
        int maxLen = Math.max(word1.length(), word2.length());

        for(i = 0; i < maxLen; i++) {
            if(i < word1.length()) {
                mergedStr.append(word1.charAt(i));
            }
            if(i < word2.length()) {
                mergedStr.append(word2.charAt(i));
            }
        }

        return mergedStr.toString();
    }

    @Override
    public char findTheDifference_389_e(String s, String t) {
        char [] sortedS = s.toCharArray();
        char [] sortedT = t.toCharArray();
        int i;

        Arrays.sort(sortedS);
        Arrays.sort(sortedT);

        for(i = 0; i < sortedS.length; i++) {
            if (sortedS[i] != sortedT[i]) {
                return sortedT[i];
            }
        }

        return sortedT[i];
    }

    @Override
    public int indexOfFirstOccurrence_28_e_v1(String haystack, String needle) {
        int i, j, len, index;
        len = needle.length();
        j = 0;
        index = -1;
        boolean firstIndexFound = false;

        for (i = 0; i < haystack.length(); i++) {
            if (!firstIndexFound && (haystack.charAt(i) == needle.charAt(0))) {
                index = i;
                j++;
                firstIndexFound = true;
            }
            else if (firstIndexFound && (haystack.charAt(i) != needle.charAt(j))) {
                i = index++;
                j = 0;
                firstIndexFound =  false;
                index = -1;
            } else if (firstIndexFound && haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }

            if(j == len) {
                return index;
            }
        }

        return -1;
    }

    @Override
    public int indexOfFirstOccurrence_28_e_v2(String haystack, String needle) {
        int i, j, index;
        i = 0;
        j = 0;
        index = -1;

        while (i + needle.length() <= haystack.length()) {

            if (haystack.charAt(i) == needle.charAt(0)) {
                index = i;
                for (j = 1; j < needle.length(); j++) {
                    if (haystack.charAt(i+j) != needle.charAt(j)) {
                        break;
                    }
                }
            }

            if(j == needle.length()) {
                return index;
            }

            i++;
        }

        return -1;
    }

    @Override
    public int indexOfFirstOccurrence_28_e_v3(String haystack, String needle) {
        int i;
        String subStr;

        for (i = 0; i + needle.length() <= haystack.length(); i++) {
            if ((haystack.charAt(i) == needle.charAt(0))) {
                subStr = haystack.substring(i, i + needle.length());
                if(subStr.contains(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override
    public boolean isAnagram_242_e(String s, String t) {
        char sortedS [] = s.toCharArray();
        char sortedT [] = t.toCharArray();

        Arrays.sort(sortedS);
        Arrays.sort(sortedT);

        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0; i < s.length(); i++){
            if (sortedS[i] != sortedT[i]){
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean repeatedSubstringPattern_459_e_v1(String s) {
        int len = s.length();
        int subStrLength = 0;
        int i, j;

        for(i = 0; i < len / 2; i++){
            subStrLength++;

            for(j =  subStrLength; j + subStrLength <= len; j += subStrLength){
                String str = s.substring(0, subStrLength);
                String str2 = s.substring(j, j + subStrLength);
                if(!s.substring(0, subStrLength).equals(s.substring(j, j + subStrLength))){
                    break;
                }
            }
            if(j == len){
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean repeatedSubstringPattern_459_e_v2(String s){
        int length = s.length();
        String str = "";
        int strLength = 0;
        int i, j, k;

        for(i = 0; i < length / 2; i++){
            str += s.charAt(i);
            strLength++;
            k = 0;

            for(j =  strLength; j < length; j++){
                if(str.charAt(k) != s.charAt(j)){
                    break;
                } else if(k == strLength - 1){
                    k = 0;
                } else {
                    k++;
                }
            }
            if(j == length && k == 0){
                return true;
            }
        }

        return false;
    }

    @Override
    public void moveZeroes_283_e(int[] nums) {
        int len = nums.length;
        int i, j, k;
        j = 0;

        for(i = 0; i < len; i++){
            if(nums[i] != 0){
                nums[j] = nums[i];
                j++;
            }
        }

        for (k = j; k < len; k++){
            nums[k] = 0;
        }
    }

    @Override
    public int[] plusOne_66_e(int[] digits) {
        int len, i;
        boolean toBeIncremented = true;

        len = digits.length;

        for(i = len - 1; i >= 0; i--){
            if(digits[i] != 9){
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int newDigits[] = new int[len + 1];
        newDigits[0] = 1;

        for(i = 1; i <= len; i++){
            newDigits[i] = digits[i-1];
        }

        return newDigits;
    }

    @Override
    public int arraySign_1822_e(int[] nums) {
        int product = 1;

        for(Integer num: nums){
            if (num == 0){
                return 0;
            } else if(num < 0){
                product *= -1;
            } else {
                product *= 1;
            }
        }

        return product;
    }

    @Override
    public boolean canMakeArithmeticProgression_1502_e(int[] arr) {
        int len = arr.length;

        if (len < 2){
            return false;
        }

        Arrays.sort(arr);
        int diff = Math.abs(arr[1] - arr[0]);

        for(int i = 1; i < len - 1; i++){
            if(Math.abs(arr[i+1] - arr[i]) != diff){
                return false;
            }
        }

        return true;
    }

    @Override
    public boolean isMonotonic_896_e(int[] nums) {
        boolean isInc = false;
        boolean isDec = false;
        int i, eqCount;
        eqCount = 1;

        for (i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                if (isDec) {
                    return false;
                }

                isInc = true;
            } else if (nums[i] < nums[i-1]) {
                if (isInc) {
                    return false;
                }

                isDec = true;
            } else {
                eqCount++;
            }
        }

        return isInc || isDec || (eqCount == i);
    }

    @Override
    public int romanToInt_13_e(String s) {
        Map<String, Integer> hm = new HashMap<>();
        hm.put("I", 1);
        hm.put("V", 5);
        hm.put("X", 10);
        hm.put("L", 50);
        hm.put("C", 100);
        hm.put("D", 500);
        hm.put("M", 1000);

        int sum = 0;

        for(int i = 0; i < s.length(); i++){
            if (i+1 < s.length() && hm.get("" + s.charAt(i)) < hm.get("" + s.charAt(i+1))){
                sum -= hm.get("" + s.charAt(i));
            } else{
                sum += hm.get("" + s.charAt(i));
            }
        }

        return sum;
    }

    @Override
    public int lengthOfLastWord_58_e(String s) {
        boolean letterFound = false;
        int count = 0;

        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                letterFound = true;
            }

            if (letterFound){
                if(s.charAt(i) == ' '){
                    return count;
                } else{
                    count++;
                }
            }
        }

        return count;
    }

    @Override
    public String toLowerCase_709_e(String s) {
        char [] lowerCaseStr = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (lowerCaseStr[i] >= 65 && lowerCaseStr[i] <= 90) {
                lowerCaseStr[i] = (char) (lowerCaseStr[i] + 32);
            }
        }

        return new String(lowerCaseStr);
    }

    @Override
    public int calculatePoints_682_e(String[] operations) {
        Stack<Integer> records = new Stack();
        int sum = 0;

        for (String operation: operations) {
            if (operation.equals("C")) {
                records.pop();
            } else if (operation.equals("D")) {
                records.push(records.peek() * 2);
            } else if (operation.equals("+")) {
                records.push(records.peek() + records.get(records.size()-2));
            } else {
                records.push(Integer.parseInt(operation));
            }
        }

        for(Integer elmt: records){
            sum += elmt;
        }

        return sum;
    }

    @Override
    public boolean judgeCircle_657_e(String moves) {
        int lr, ud, i;
        lr = 0;
        ud = 0;

        for (i = 0; i < moves.length(); i++){
            switch (moves.charAt(i)){
                case 'U':
                    ud++;
                    break;

                case 'D':
                    ud--;
                    break;

                case 'L':
                    lr++;
                    break;

                case 'R':
                    lr--;

                default:
                    break;
            }
        }

        return (ud == 0) && (lr == 0);
    }

    @Override
    public String ticTacToe_1275_e(int[][] moves) {
        int i, j;
        int len = moves.length;
        int [][] col = new int[2][3];
        int [][] row = new int[2][3];
        int [][] diag = new int[2][2];


        if (len >= 5) {
            for (i = 0; i < len; i++) {
                if (i % 2 == 0) {
                    row[0][moves[i][0]]++;
                    col[0][moves[i][1]]++;

                    if (moves[i][0] == moves[i][1]) {
                        diag[0][0]++;
                    }

                    if ((moves[i][0] == 1 && moves[i][1] == 1)
                            || (moves[i][0] == 0 && moves[i][1] == 2)
                            || (moves[i][0] == 2 && moves[i][1] == 0)) {
                        diag[0][1]++;
                    }

                    if ((row[0][moves[i][0]] == 3)
                        || (col[0][moves[i][1]] == 3) ||
                        diag[0][0] == 3 || diag[0][1] == 3){
                        return "A";
                    }
                } else {
                    row[1][moves[i][0]]++;
                    col[1][moves[i][1]]++;

                    if (moves[i][0] == moves[i][1]) {
                        diag[1][0]++;
                    }

                    if ((moves[i][0] == 1 && moves[i][1] == 1)
                            || (moves[i][0] == 0 && moves[i][1] == 2)
                            || (moves[i][0] == 2 && moves[i][1] == 0)) {
                        diag[1][1]++;
                    }

                    if ((row[1][moves[i][0]] == 3)
                            || (col[1][moves[i][1]] == 3) ||
                            diag[1][0] == 3 || diag[1][1] == 3){

                        return "B";
                    }
                }
            }

            if (moves.length == 9){
                return "Draw";
            }
        }

        return "Pending";
    }

    @Override
    public boolean isRobotBounded_1041_m(String instructions) {
        return false;
    }

    @Override
    public int maximumWealth_1672_e(int[][] accounts) {
        int i, j, maxWealth, wealth;
        maxWealth = -1;

        for (i = 0; i < accounts.length; i++) {
            wealth = 0;
            for (j = 0; j < accounts[i].length; j++) {
                wealth += accounts[i][j];
            }

            if (wealth > maxWealth) {
                maxWealth = wealth;
            }
        }

        return maxWealth;
    }

    @Override
    public int diagonalSum_1572_e(int[][] mat) {
        int i, j, len, sum;
        sum = 0;
        len = mat.length;

        if (len < 2) {
            return mat[0][0];
        }

        for (i = 0; i < len / 2; i++) {
            sum += mat[i][len-i-1];
            if ((len-i-1) != i) {
                sum += mat[i][i];
            }
        }

        for (j = (len/2); j < len; j++) {
            sum += mat[j][len-j-1];
            if ((len - j - 1) != j) {
                sum += mat[j][j];
            }
        }

        return sum;
    }

    @Override
    public List<Integer> spiralOrder_54_m(int[][] matrix) {
        return null;
    }

    @Override
    public void setZeroes_73_m(int[][] matrix) {

    }

    @Override
    public int countOdds_1523_e(int low, int high) {
        int diff = (high - low) + 1;

        if (diff % 2 == 0 || low % 2 == 0) {
            return diff / 2;
        }

        return diff / 2 + 1;
    }

    @Override
    public double average_1491_e(int[] salary) {
        int min, max, sum;
        sum = min = max = salary[0];

        for (int i = 1; i < salary.length; i++) {
            if (salary[i] < min) {
                min = salary[i];
            } else if (salary[i] > max) {
                max = salary[i];
            }
            sum += salary[i];
        }

        return (double) (sum - min - max) / (salary.length - 2);
    }

    @Override
    public boolean lemonadeChange_860_e(int[] bills) {
        int i, five, ten;
        five = 0;
        ten = 0;

        for (i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                five++;
            } else if (bills[i] == 10) {
                if (five < 1) {
                    return false;
                } else {
                    five--;
                    ten++;
                }
            } else {
                if (ten < 1) {
                    if (five < 3) {
                        return false;
                    } else {
                        five -= 3;
                    }
                } else {
                    ten--;
                    five--;
                }
            }
        }

        return (five >= 0) && (ten >= 0);
    }

    @Override
    public int largestPerimeter_976_e(int[] nums) {
        return 0;
    }

    @Override
    public boolean checkStraightLine_1232_e(int[][] coordinates) {
        return false;
    }

    @Override
    public String addBinary_67_e(String a, String b) {
        return null;
    }

    @Override
    public String multiply_43_m_v1(String num1, String num2) {
        int len1, len2, i, j, prod, carry, ind, temp;
        len1 = num1.length();
        len2 = num2.length();
        long sum, total;
        total = 0;
        carry = 0;
        ind = 0;
        StringBuilder result = new StringBuilder();
        Integer [] res = new Integer[len1 + len2];

        for (i = len1 - 1; i >= 0; i--) {
            sum = 0;
            for (j = len2 - 1; j >= 0; j--) {
                prod = ((int)num1.charAt(i) - 48) * ((int)num2.charAt(j) - 48) + carry;

                if (j != 0 && prod >= 10) {
                    carry = prod / 10;
                    if (prod % 10 != 0) {
                        sum += (long) ((prod % 10) * Math.pow(10, len2 - j - 1 + ind));
                    }
                } else {
                    carry = 0;
                    sum += (long) (prod * Math.pow(10, len2 - j - 1 + ind));
                }

                if (j == 0) {
                    total += sum;
                    ind++;
                }
            }
        }

        return Long.toString(total);
    }

    @Override
    public String multiply_43_m_v2(String num1, String num2) {
        int len1, len2, i, j, prod, carry;
        len1 = num1.length();
        len2 = num2.length();
        carry = 0;
        StringBuilder result = new StringBuilder();
        Integer [] res = new Integer[len1 + len2];
        Arrays.fill(res, 0);

        for (i = len1 - 1; i >= 0; i--) {
            for (j = len2 - 1; j >= 0; j--) {
                prod = ((int)num1.charAt(i) - '0') * ((int)num2.charAt(j) - '0') + carry;

                if (res[i+j+1] + prod >= 10) {
                    carry = prod / 10;
                    res[i+j+1] = res[i+j+1] + (prod % 10);
                    if (res[i+j+1] >= 10) {
                        carry += res[i+j+1] / 10;
                        res[i+j+1] = res[i+j+1] % 10;
                    }
                } else {
                    carry = 0;
                    res[i+j+1] = res[i+j+1] + prod;
                }
            }
        }

        boolean isNotLeadingZero = false;
        for (i = 0; i < len1 + len2; i++) {
            if (!isNotLeadingZero && res[i] != 0) {
                isNotLeadingZero = true;
            }

            if (isNotLeadingZero) {
                result.append(res[i]);
            }
        }

        return result.toString();
    }

    @Override
    public double myPow_50_m(double x, int n) {
        return 0;
    }

    @Override
    public ListNode mergeTwoLists_21_e(ListNode list1, ListNode list2) {
        return null;
    }

    @Override
    public ListNode reverseList_206_e(ListNode head) {
        return null;
    }

    @Override
    public ListNode addTwoNumbers_2_m(ListNode l1, ListNode l2) {
        return null;
    }

    @Override
    public ListNode addTwoNumbersII_445_m(ListNode l1, ListNode l2) {
        return null;
    }
}

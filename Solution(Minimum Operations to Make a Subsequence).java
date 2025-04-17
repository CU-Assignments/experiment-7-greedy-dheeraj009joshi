import java.util.*;

class Solution {
    public int minOperations(int[] target, int[] arr) {
        // Step 1: Map target values to their indices
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < target.length; i++) {
            indexMap.put(target[i], i);
        }

        // Step 2: Convert arr to an index sequence based on target
        List<Integer> indexList = new ArrayList<>();
        for (int num : arr) {
            if (indexMap.containsKey(num)) {
                indexList.add(indexMap.get(num)); // Replace value with target index
            }
        }

        // Step 3: Find Longest Increasing Subsequence (LIS) on indexList
        int lisLength = lengthOfLIS(indexList);

        // Step 4: Compute minimum operations
        return target.length - lisLength;
    }

    // Binary Search + Patience Sorting technique for LIS
    private int lengthOfLIS(List<Integer> nums) {
        List<Integer> lis = new ArrayList<>();
        for (int num : nums) {
            int pos = Collections.binarySearch(lis, num);
            if (pos < 0) {
                pos = -(pos + 1); // Get insertion index
            }
            if (pos < lis.size()) {
                lis.set(pos, num);
            } else {
                lis.add(num);
            }
        }
        return lis.size();
    }
}

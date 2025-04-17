import java.util.Arrays;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // Sort the boxTypes array in descending order based on number of units per box
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int maxUnits = 0; // Variable to store the total number of units
        for (int[] box : boxTypes) {
            int boxCount = Math.min(box[0], truckSize); // Take as many boxes as possible
            maxUnits += boxCount * box[1]; // Add units from the taken boxes
            truckSize -= boxCount; // Reduce the truck capacity

            if (truckSize == 0) break; // Stop if the truck is full
        }
        
        return maxUnits; // Return the maximum units the truck can carry
    }
}

import java.util.PriorityQueue;

class Solution {
    public int minStoneSum(int[] piles, int k) {
        // Max-Heap to always get the largest pile first
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);

        // Add all pile values to the heap
        for (int pile : piles) {
            maxHeap.add(pile);
        }

        // Perform k operations
        while (k-- > 0) {
            int largest = maxHeap.poll();  // Remove largest pile
            largest -= largest / 2;        // Remove floor(largest / 2) stones
            maxHeap.add(largest);          // Push updated value back
        }

        // Sum up the remaining stones
        int total = 0;
        while (!maxHeap.isEmpty()) {
            total += maxHeap.poll();
        }

        return total;
    }
}

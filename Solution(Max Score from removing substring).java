class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x >= y) {
            return removeAndScoreFirst(s, 'a', 'b', x, y);
        } else {
            return removeAndScoreFirst(s, 'b', 'a', y, x);
        }
    }

    private int removeAndScoreFirst(String s, char first, char second, int highPoints, int lowPoints) {
        StringBuilder stack1 = new StringBuilder();
        int highScore = 0;

        // First pass: Remove higher priority pair
        for (char c : s.toCharArray()) {
            if (stack1.length() > 0 && stack1.charAt(stack1.length() - 1) == first && c == second) {
                stack1.deleteCharAt(stack1.length() - 1); // Remove matching pair
                highScore += highPoints;
            } else {
                stack1.append(c);
            }
        }

        // Second pass: Remove lower priority pair from the remaining characters
        StringBuilder stack2 = new StringBuilder();
        int lowScore = 0;
        for (char c : stack1.toString().toCharArray()) {
            if (stack2.length() > 0 && stack2.charAt(stack2.length() - 1) == second && c == first) {
                stack2.deleteCharAt(stack2.length() - 1); // Remove matching pair
                lowScore += lowPoints;
            } else {
                stack2.append(c);
            }
        }

        return highScore + lowScore;
    }
}

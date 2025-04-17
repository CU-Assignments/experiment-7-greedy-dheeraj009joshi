# Exp-7-Greedy


##Greedy Algorithm
A Greedy Algorithm is a problem-solving approach that makes locally optimal choices at each step, hoping that these choices will lead to a globally optimal solution.

It is fast and efficient, often used in optimization problems where we aim to maximize or minimize something. However, it does not always guarantee the best solution in all cases.

---

## ** Key Concepts**
### 1. Greedy Choice Property:###
>> The algorithm builds the solution piece by piece, choosing the best option at each step.
#### 2. Optimal Substructure:####
>> A problem exhibits optimal substructure if its optimal solution can be constructed from optimal solutions of its subproblems.


###  When Greedy Algorithms Work & When They Don't
|  **Greedy Works Well If...** |  **Greedy Fails If...** |
|-------------------------|---------------------|
| **Optimal Substructure:** The problem can be broken down into smaller subproblems that lead to the optimal solution. | **Future Consequences Matter:** Choosing the best option now may prevent the optimal solution later. |
| **Greedy Choice Property:** A local best choice leads to a global best choice. | **Backtracking Required:** If you need to undo a previous choice to get the best result. |

---

###  Common Problems Solved Using Greedy Approach
| **Problem Type** | **Examples** |
|-----------------|-------------|
| **Graph Algorithms** | Dijkstra’s Shortest Path, Prim’s MST, Kruskal’s MST |
| **Interval Scheduling** | Activity Selection Problem, Job Scheduling |
| **Knapsack Problems** | Fractional Knapsack |
| **String Problems** | Huffman Coding, Maximum Score from Removing Substrings |
| **Array Problems** | Minimize Cost of Rope, Jump Game |

---

###  Conclusion
- **Greedy algorithms are fast and simple**, but they don’t always give the correct solution.
- **Try sorting or prioritizing choices** before making greedy decisions.
- **Think about the problem's structure** before applying greedy; sometimes DP or backtracking is needed.

---
These are the problem which are releated to Dynamic Programming are solved in the given expirement 🚀🚀🚀: -
>> 1. Max Units on a Truck - https://leetcode.com/problems/maximum-units-on-a-truck/description/
>> 2. Remove stones to Maximize total - https://leetcode.com/problems/remove-stones-to-minimize-the-total/description/
>> 3. Max Score from removing substrings - https://leetcode.com/problems/remove-stones-to-minimize-the-total/description/
>> 4. Min operations to make a subsequence - https://leetcode.com/problems/minimum-operations-to-make-a-subsequence/description/

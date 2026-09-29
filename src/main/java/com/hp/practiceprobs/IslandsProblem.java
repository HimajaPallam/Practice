package com.hp.practiceprobs;


/*You are given an m x n 2D binary grid called grid where:
        '1' represents land, and
'0' represents water.
An island is a group of connected land cells ('1') that are surrounded by water and connected horizontally or vertically. You can assume that all edges of the grid are surrounded by water.
        Example 1:
Input: grid = [
        ["1","1","0","1","0"],
        ["1","0","0","1","0"],
        ["0","0","0","1","0"],
        ["0","0","0","0","0"]
        ]
Output: 2
Explanation: There are two islands:
The first island spans the top left corner.
The second island spans the cells in the middle of the grid.*/


/*Check the BFS vs DFS. for this scenario using DFS
* BFS
*
*       (0,0)
       /    \
   (1,0)   (0,1)
     |         |
   (2,0)    (0,2)
*
*
*       1
       / \
      2   3
     / \   \
    4   5   6
*
*
*
    DFS
*
*1
 └─ 2
     ├─ 4   (dead end → back up to 2)
     └─ 5   (dead end → back up to 2, then up to 1, since 2 is exhausted)
 └─ 3
     └─ 6   (dead end → back up to 3, then to 1 → nothing left, done)
*
*
* BFS: (0,0), (1,0), (0,1), (2,0), (0,2)   ← both branches touched early, then deepens
DFS: (0,0), (1,0), (2,0), (0,1), (0,2)   ← fully drains one branch before touching the other
*
*
*
* */

public class IslandsProblem {

    public static void main(String[] args) {
        char[][] grid = {
                {'1','1','0','1','0'},
                {'1','0','0','1','0'},
                {'0','0','0','1','0'},
                {'0','0','0','0','0'}
        };

        System.out.println("Number of islands: " + numIslands(grid));  // 2
    }

    public static int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;

        int rows = grid.length;
        int cols = grid[0].length;

        int count =0;

        for(int r=0; r < rows; r++) {
            for(int c=0; c < cols; c++) {
                if(grid[r][c] == '1') {
                    count++;
                    dfs(grid, r, c, rows, cols);
                }
            }
        }
    return count;
    }

    private static void dfs(char[][] grid, int r, int c, int rows, int cols) {
        if( r<0 || c<0|| r>= rows || c>= cols || grid[r][c] == '0') {
            return;
        }
        grid[r][c] = '0';   // to know that this cell is visited

        dfs(grid, r-1, c, rows, cols);  // up
        dfs(grid, r+1, c, rows, cols);  // down
        dfs(grid, r, c-1, rows, cols);  // left
        dfs(grid, r, c+1, rows, cols);  // right
    }


}

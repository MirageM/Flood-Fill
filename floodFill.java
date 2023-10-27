// Runtime: 1 ms, faster than 90.98% of Java online submissions for Flood Fill
// Time Complexity: O(n*m)
// Space Complexity: O(n*m)
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        fill(image, sr, sc, color, image[sr][sc]);
        return image; 
    }
    private void fill(int[][]image, int row, int column, int color, int cur){
        if(row < 0 || row >= image.length || column < 0 || column >= image[0].length){
            return;
        }
        if(cur != image[row][column]){
            return;
        }
        image[row][column] = color;
        // Breadth First Search
        fill(image, row - 1, column, color, cur);
        fill(image, row + 1, column, color, cur);
        fill(image, row, column - 1, color, cur);
        fill(image, row, column + 1, color, cur);
    }
}
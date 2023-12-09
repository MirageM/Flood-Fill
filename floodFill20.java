class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color){
            return image;
        }
        floodFill(image, sr, sc, color, image[sr][sc]);
        return image;
    }
    private void floodFill(int[][] image, int sr, int sc, int color, int curr){
        if(sr < 0 || image.length <= sr || sc < 0 || image[0].length <= sc){
            return;
        }
        if(image[sr][sc] != curr){
            return;
        }
        image[sr][sc] = color;
        // BFS - Breadth First Search
        floodFill(image, sr - 1, sc, color, curr);
        floodFill(image, sr + 1, sc, color, curr);
        floodFill(image, sr, sc - 1, color, curr);
        floodFill(image, sr, sc + 1, color, curr);
    }
}
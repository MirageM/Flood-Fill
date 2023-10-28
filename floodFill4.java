class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color){
            return image;
        }
        floodFill(image, sr, sc, color, image[sr][sc]);
        return image;
    }
    private void floodFill(int[][] image, int r, int c, int color, int curr){
        if(r < 0 || r >= image.length || c < 0 || c >= image[0].length){
            return;
        }
        if(image[r][c] != curr){
            return;
        }
        image[r][c] = color;
        floodFill(image, r - 1, c, color, curr);
        floodFill(image, r + 1, c, color, curr);
        floodFill(image, r, c - 1, color, curr);
        floodFill(image, r, c + 1, color, curr);
    }
}
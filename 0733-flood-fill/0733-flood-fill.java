class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original = image[sr][sc];
        //edge case
        if (original == color) return image;
        dfs(image, sr, sc, original, color);
        return image;
    }
    void dfs(int[][] image, int r, int c, int original, int color) {
        //boundary check
        if (r < 0 || c < 0 || r >= image.length || c >= image[0].length)
            return;
        //only fill original color cells
        if (image[r][c] != original)
            return;
        //fill current cell
        image[r][c] = color;
        //explore 4 directions
        dfs(image, r + 1, c, original, color);
        dfs(image, r - 1, c, original, color);
        dfs(image, r, c + 1, original, color);
        dfs(image, r, c - 1, original, color);
    }
}
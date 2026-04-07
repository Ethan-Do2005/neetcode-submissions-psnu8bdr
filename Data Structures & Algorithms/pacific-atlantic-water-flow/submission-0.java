class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        int row = heights.length;
        int col = heights[0].length;

        boolean[][] checkPacific = new boolean[row][col];
        boolean[][] checkAtlantic = new boolean[row][col];

        for(int r = 0; r < row; r++){
            dfs(heights, checkPacific, r, 0, Integer.MIN_VALUE); // left Pacific
            dfs(heights, checkAtlantic, r, col - 1, Integer.MIN_VALUE); //right Atlantic
        }

        for(int c = 0; c < col; c++){
            dfs(heights, checkPacific, 0, c, Integer.MIN_VALUE);
            dfs(heights, checkAtlantic, row - 1, c, Integer.MIN_VALUE);
        }

        for(int r = 0; r < row; r++){
            for(int c = 0; c < col; c++){
                if(checkPacific[r][c] && checkAtlantic[r][c]){
                    result.add(Arrays.asList(r,c));
                }
            }
        }

        return result;
    }

    private void dfs(int[][] heights, boolean[][] visited, int r, int c, int prevHeight){
        if(r < 0 || r >= heights.length || c < 0 || c >= heights[0].length){
            return;
        }

        if(prevHeight > heights[r][c] || visited[r][c]){
            return;
        }

        visited[r][c] = true;

        dfs(heights, visited, r + 1, c, heights[r][c]);
        dfs(heights, visited, r - 1, c, heights[r][c]);
        dfs(heights, visited, r, c + 1, heights[r][c]);
        dfs(heights, visited, r, c - 1, heights[r][c]);
    }
}

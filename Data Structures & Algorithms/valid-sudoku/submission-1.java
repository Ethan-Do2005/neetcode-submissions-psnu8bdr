class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] col = new HashSet[9];
        HashSet<Character>[] subBox = new HashSet[9];

        // Initialize all HashSets
        for (int i = 0; i < 9; i++) {
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            subBox[i] = new HashSet<>();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;

                // Row check
                if (row[i].contains(c)) return false;
                row[i].add(c);

                // Column check
                if (col[j].contains(c)) return false; // FIXED
                col[j].add(c);

                // Sub-box check
                int idxBox = (i / 3) * 3 + (j / 3);
                if (subBox[idxBox].contains(c)) return false;
                subBox[idxBox].add(c);
            }
        }
        return true;
    }
}

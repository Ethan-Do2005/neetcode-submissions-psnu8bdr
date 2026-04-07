class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] col = new HashSet[9];
        HashSet<Character>[] subBox = new HashSet[9];

        for(int i = 0; i < 9; i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            subBox[i] = new HashSet<>();
        }

        for(int i = 0; i < board.length; i++){
            for(int j =0; j < board[0].length; j++){
                char c = board[i][j];

                if(c == '.') continue;

                if(row[i].contains(c)) return false;
                row[i].add(c);

                if(col[j].contains(c)) return false;
                col[j].add(c);

                int idxBox = (i/3)* 3 + (j/3);
                if(subBox[idxBox].contains(c)) return false;
                subBox[idxBox].add(c);

            }
        }
        return true;


    }
}
/*
Trying to validate 
*/

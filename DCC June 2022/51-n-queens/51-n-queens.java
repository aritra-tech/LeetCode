class Solution {
    public List<List<String>> solveNQueens(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Invalid board");
        }

        List<List<String>> result = new ArrayList<>();
        solveNQueensHelper(result, new int[n], new BitSet(5 * n), 0);
        return result;
    }

    private void solveNQueensHelper(List<List<String>> result, int[] queensPos, BitSet occupied, int row) {
        int n = queensPos.length;
        if (row == n) {
            result.add(generateResultBoard(queensPos));
            return;
        }

        for (int col = 0; col < n; col++) {
            // First N bits are for columns
            // Then 2*N bits are for diagonal at 45 degrees
            // Then 2*N bits are for diagonal at 135 degrees
            int diag45 = n + (row + col);
            int diag135 = 3 * n + (n + row - col);
            if (occupied.get(col) || occupied.get(diag45) || occupied.get(diag135)) {
                continue;
            }

            occupied.set(col);
            occupied.set(diag45);
            occupied.set(diag135);
            queensPos[row] = col;

            solveNQueensHelper(result, queensPos, occupied, row + 1);

            occupied.clear(col);
            occupied.clear(diag45);
            occupied.clear(diag135);
        }
    }

    private List<String> generateResultBoard(int[] queensPos) {
        List<String> temp = new ArrayList<>();
        char[] b = new char[queensPos.length];
        Arrays.fill(b, '.');
        for (int q : queensPos) {
            b[q] = 'Q';
            temp.add(new String(b));
            b[q] = '.';
        }
        return temp;
    }
}
// Last updated: 11/07/2026, 00:06:12
class Solution {
public:
    vector<vector<string>> solveNQueens(int n) {
        vector<vector<string>> results;

        struct StateType {
            vector<string> board;
            int row;
            vector<int> cols, diag1, diag2;
        };

        StateType state{
            vector<string>(n, string(n, '.')),
            0,
            vector<int>(n, 0),
            vector<int>(2*n, 0),
            vector<int>(2*n, 0)
        };

        function<void(StateType&)> backtrack = [&](StateType& cur) {
            // ✅ base case
            if (cur.row == n) {
                results.push_back(cur.board);
                return;
            }

            for (int col = 0; col < n; ++col) {
                int d1 = cur.row + col;
                int d2 = cur.row - col + n - 1;

                if (cur.cols[col] || cur.diag1[d1] || cur.diag2[d2])
                    continue; // unsafe → skip

                // ✅ apply choice
                cur.board[cur.row][col] = 'Q';
                cur.cols[col] = cur.diag1[d1] = cur.diag2[d2] = 1;
                cur.row++;

                // ✅ recurse
                backtrack(cur);

                // ✅ undo choice
                cur.row--;
                cur.board[cur.row][col] = '.';
                cur.cols[col] = cur.diag1[d1] = cur.diag2[d2] = 0;
            }
        };

        backtrack(state);
        return results;
    }
};
// Last updated: 11/07/2026, 00:06:10
class Solution {
public:
    int totalNQueens(int n) {
    int count = 0;

    struct StateType {
        vector<string> board;
        int row;
    };

    StateType state;
    state.board = vector<string>(n, string(n, '.'));
    state.row = 0;

    auto is_safe = [&](vector<string>& board, int row, int col) -> bool {
        for (int i = 0; i < row; ++i)
            if (board[i][col] == 'Q') return false;

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; --i, --j)
            if (board[i][j] == 'Q') return false;

        for (int i = row - 1, j = col + 1; i >= 0 && j < n; --i, ++j)
            if (board[i][j] == 'Q') return false;

        return true;
    };

    function<void(StateType&)> backtrack = [&](StateType& current) {
        if (current.row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; ++col) {
            if (is_safe(current.board, current.row, col)) {
                current.board[current.row][col] = 'Q';
                current.row++;

                backtrack(current);

                current.row--;
                current.board[current.row][col] = '.';
            }
        }
    };

    backtrack(state);
    return count;
}
};
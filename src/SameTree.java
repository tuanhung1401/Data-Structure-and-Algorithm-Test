public class SameTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
    }
    class Solution {
        public boolean isSameTree(TreeNode p, TreeNode q) {
            // So sánh nhánh trái và phải của p với q
            // Nếu cả p và q cùng null
            if (p == null && q == null) return true;
            // Nếu p hoặc q null
            if (q == null || p == null) return false;
            // Nếu giá trị của node ở cùng vị trí của p khác q
            if (p.val != q.val) return false;
            // Trả lại kết quả sau khi so sánh 2 nhánh trái và phải. Nhận về kết quả true chỉ khi thoả mãn cả 2 điều kiện nhánh trái của p = q và nhánh phải của p = q
            return isSameTree(p.right, q.right) &&
                    isSameTree(p.left, q.left);
        }
        // Time Complexity: O(N) với N là số node của tree
        // Space Complexity: O(N)
    }
}

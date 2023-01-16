public class FloodFill {
    class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            //Gán cho điểm bắt đầu (starting point với sr (starting row) và sc (starting collumn)) mầu cũ oldColor
            int oldColor = image[sr][sc];
            //Nếu mầu cũ khác mầu mới thì gọi fill
            if (oldColor != color) {
                fill(image, sr, sc, oldColor, color);
            }
            return image;
        }

        private void fill(int[][] image, int sr, int sc, int oldColor, int color) {
            //Điều kiện dừng của đệ quy
            if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != oldColor) {
                return;
            }
            //Nếu thoả mãn, ta sẽ gán màu mới color cho vị trí hiện tại, và kiểm tra 4 vị trí tiếp theo
            image[sr][sc] = color;
            fill(image, sr + 1, sc, oldColor, color);
            fill(image, sr - 1, sc, oldColor, color);
            fill(image, sr, sc + 1, oldColor, color);
            fill(image, sr, sc - 1, oldColor, color);
        }
        // Time Complexity: O(N) với N là số lượng pixel trên ảnh
        // Space Complexity: O(N)
    }
}

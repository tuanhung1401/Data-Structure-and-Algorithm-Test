public class SumOfUniqueElements {
    class Solution {
        public int sumOfUnique(int[] nums) {
            //Đặt biến sum = 0
            int sum = 0;
            //Duyệt các phần tử trong array nums
            for (int i = 0; i < nums.length; i++) {
                // Đặt boolean xem số này có phải duy nhất hay không isUnique = true
                boolean isUnique = true;
                // Tiếp tục duyệt các phần tử trong array nums bằng cách so sánh xem giá trị của của các số ở index i và j có   bằng nhau hay không, nếu có thì isUnique = false
                for (int j = 0; j < nums.length; j++) {
                    if (i != j && nums[i] == nums[j]) {
                        isUnique = false;
                        break;
                    }
                }
                // Nếu phát hiện ra số duy nhất thì cộng vào sum;
                if (isUnique) {
                    sum += nums[i];
                }
            }
            return sum;
            // Time Complexity: O(n^2) vì sử dụng 2 vòng lặp lồng với nhau
            // Space Complexity: O(1)
        }
    }
}

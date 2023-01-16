import java.util.Stack;

public class BackspaceStringCompare {
    class Solution {
        public boolean backspaceCompare(String s, String t) {
            //So sánh kết quả của quá trình nhập String s (build(s) và String t (build(t))
            return build(s).equals(build(t));
        }

        public String build(String s) {
            // Tạo Stack ans là kết quả của quá trình nhập String
            Stack<Character> ans = new Stack();
            // Sử dụng method toCharArray() để biến String được nhập thành một Array chứa các ký tự tạo thành String đó
            // Duyệt các phần tử trong Array chứa các ký tự của String s
            for (char c: s.toCharArray()) {
                // Nếu ký tự c khác #, nó sẽ được thêm vào stack
                if (c != '#')
                    ans.push(c);
                    // Nếu ans trống, nó sẽ trả về chuỗi rỗng
                else if (!ans.empty())
                    ans.pop();
            }
            return String.valueOf(ans);
        }
    }
    // Time Complexity: O(N) vì ta dùng 1 vòng lặp để chạy hết các chuỗi String cho trước.
    // Space Complexity: O(N) vì ta dùng Stack ans để lưu các ký tự
}

/*
 * 编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""。

示例 1:
输入: ["flower","flow","flight"]
输出: "fl"

示例 2:
输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。
*/
package lianxi0220;

public class test0220 {
	public static void main(String[] args) {
		Solution S = new Solution();
		String[] strs = new String[] {"flower","flow","flight"};
		String s = S.longestCommonPrefix(strs);
		System.out.println(s);
	}

}

class Solution {
    public String longestCommonPrefix(String[] strs) {
          if (strs.length == 1){
            return strs[0];
        }
        StringBuilder sb = new StringBuilder(); //生成动态字符串，
        if (strs.length>1) {
            int len = strs[0].length();
            for (int i = 0; i < len; i++) {
                char curr = strs[0].charAt(i);  //首个字符串的第i个元素
                for (int j = 1; j < strs.length; j++) {
                	// 与后面的每个字符串的第i位字符相比较
                    if (strs[j].length()<=i ||strs[j].charAt(i) != curr) {
                        return sb.toString();
                    }
                    if (strs[j].charAt(i) == curr && j == strs.length - 1) {
                        sb.append(curr); 
                    }
                }
            }
        }
       return sb.toString();
    }
}
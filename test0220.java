/*
 * ��дһ�������������ַ��������е������ǰ׺��
��������ڹ���ǰ׺�����ؿ��ַ��� ""��

ʾ�� 1:
����: ["flower","flow","flight"]
���: "fl"

ʾ�� 2:
����: ["dog","racecar","car"]
���: ""
����: ���벻���ڹ���ǰ׺��
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
        StringBuilder sb = new StringBuilder(); //���ɶ�̬�ַ�����
        if (strs.length>1) {
            int len = strs[0].length();
            for (int i = 0; i < len; i++) {
                char curr = strs[0].charAt(i);  //�׸��ַ����ĵ�i��Ԫ��
                for (int j = 1; j < strs.length; j++) {
                	// ������ÿ���ַ����ĵ�iλ�ַ���Ƚ�
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
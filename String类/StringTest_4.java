package String.Demo;
/*ģ��һ��trim����һ�µķ���
˼·��
1.��������������һ��������Ϊ��ͷ��ʼ�ж��ַ�����ĽǱ꣬����++��
			   һ��������Ϊ��β��ʼ�ж��ַ����ո�ĽǱ꣬����--��
2.�жϵ����ǿո�Ϊֹ��ȡͷβ֮����ַ������ɡ�
*/

public class StringTest_4 {

	public static void main(String[] args) {
		String s="    ab   c    ";
		s=myTrim(s);
		System.out.println(s);
	}

	public static String myTrim(String s) {
		int start=0,end=s.length()-1;
		//Ҫ�ж�ͷ�Ƿ�С��β��
		while (start<end&&s.charAt(start)==' ') {
			start++;
		}
		while (start<end&&s.charAt(end)==' ') {
			end--;
		}
		String sub =s.substring(start, end+1);
		return sub;
	}

}

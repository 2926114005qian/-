package String.Demo;
/*ȡ�����ַ����������ͬ���Ӵ���
 * ˼·��
 * 1.���ж�С���Ǹ��Ƿ�����ڳ��������棬���� �̵��Ǹ���Ϊ����
 * 2.�����ڣ����̵Ľ��г��ȵݼ�ȡ�Ӵ���ȥ���������жϣ����ڼ�Ϊ����
 * */


public class StringTest_3 {

	public static void main(String[] args) {
		String s1 ="qwerabcdtyuion";
		String s2 ="xcabcdvcn";
		String s = getMaxSubString(s2,s1);
		System.out.println("s="+s);
	}

	public static String getMaxSubString(String s1, String s2) {
		String max=null,min=null;//���������� һ���泤�� һ����̴���
		max =(s1.length()>s2.length())?s1:s2;
		min =(max.equals(s1))?s2:s1;
		if (max.contains(min)) {
			return min;
		}
		for (int i = 0; i < min.length(); i++) {
			for (int a = 0,b=min.length()-i; b!= min.length()+1; a++,b++) {
				String sub =min.substring(a, b);
				if (max.contains(sub)) {
					return sub;
				}
			}
		}
		return null;
	}

}

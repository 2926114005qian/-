package String.Demo;
/*һ���Ӵ��ڳ����г��ֵĴ�����
 * ˼·��
 * 1.Ҫ�ҵ��Ӵ��Ƿ���ڣ����ڣ���ȡ��λ�á�
 * 2.�ҵ�֮�󣬼�¼��λ�ã�������Ѱ�ң�����Ѱ�ҵ���ʼλΪ����λ�ü��Ӵ����ȡ�
 * 3.�Դ����ƣ�ͨ��ѭ����� ����鲻���ͷ���-1�����ü�������¼������
 * */
public class StringTest_2 {

	public static void main(String[] args) {
		String str ="nbaernbatynbauinbaopnba";
		String key ="nba";
		int x=getStringIndex(str,key);
		System.out.println(x);
	}

	public static int getStringIndex(String str, String key) {
		int count =0;
		int index=0;
		while ((index=str.indexOf(key,index))!=-1) {
			index=index+key.length();
			count++;
		}
		return count;
	}


}

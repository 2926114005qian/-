public class Game
{
	public static void main(String[] args) 
	{
		int numOfGuesses = 0;/*��¼��Ҳ²�����ı���*/
		GameHelper helper = new GameHelper();/*���������ȡ����Ҳ²������*/
		
		SimpleDotcom theDotcom = new SimpleDotcom();/*����dotcom�Ķ���*/
		int randomNum = (int) (Math.random()*5);
		int [] locations = {randomNum,randomNum+1,randomNum+2};/*����һ���������Ȼ���Դ���������*/
		theDotcom.setLocationCells(locations);/*��ֵλ��*/
		boolean isAlive = true;/*��û��������Ϸѭ���ı���*/
		while (isAlive==true)
		{
			String guess = helper.getUserInput("enter a number");/*ȡ����ҵ�����*/
			String result = theDotcom.checkYourself(guess);/*�����ҵĲ²Ⲣ������洢��result��*/
			numOfGuesses++;
			if (result.equals("kill"))
			{
				isAlive = false;/*������������Ϸ*/
				System.out.println("you took"+numOfGuesses+"guesses");
			}
		}
		
	}
}

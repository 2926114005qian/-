public class SimpleDotcom
{
	int [] locationCells;/*����һ���������ս��λ��*/
	int numOfHits = 0;/*��¼���д���*/
	public void setLocationCells(int[] locs)
	{
		locationCells = locs;
	}
	public String checkYourself(String StringGuess)
	{
		int guess = Integer.parseInt(StringGuess);
		String result = "miss";
		for (int cell : locationCells)/*��ѭ����ÿ��λ�ý����ظ��ȶ�*/
		{
			if (guess==cell)
			{
				result = "hit";
				numOfHits++;
				break;
			}
		}
		if (numOfHits==locationCells.length)
		{
			result = "kill";
		}
		System.out.println(result);
			return result;
	}
}  

	
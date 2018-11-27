public class SimpleDotcom
{
	int [] locationCells;/*创建一个数组放置战舰位置*/
	int numOfHits = 0;/*记录击中次数*/
	public void setLocationCells(int[] locs)
	{
		locationCells = locs;
	}
	public String checkYourself(String StringGuess)
	{
		int guess = Integer.parseInt(StringGuess);
		String result = "miss";
		for (int cell : locationCells)/*以循环对每个位置进行重复比对*/
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

	
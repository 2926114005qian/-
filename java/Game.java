public class Game
{
	public static void main(String[] args) 
	{
		int numOfGuesses = 0;/*记录玩家猜测次数的变量*/
		GameHelper helper = new GameHelper();/*用这个类来取得玩家猜测的数字*/
		
		SimpleDotcom theDotcom = new SimpleDotcom();/*创建dotcom的对象*/
		int randomNum = (int) (Math.random()*5);
		int [] locations = {randomNum,randomNum+1,randomNum+2};/*生成一个随机整数然后以此制作数组*/
		theDotcom.setLocationCells(locations);/*赋值位置*/
		boolean isAlive = true;/*若没猜中让游戏循环的保障*/
		while (isAlive==true)
		{
			String guess = helper.getUserInput("enter a number");/*取得玩家的输入*/
			String result = theDotcom.checkYourself(guess);/*检查玩家的猜测并将结果存储在result中*/
			numOfGuesses++;
			if (result.equals("kill"))
			{
				isAlive = false;/*若击沉结束游戏*/
				System.out.println("you took"+numOfGuesses+"guesses");
			}
		}
		
	}
}

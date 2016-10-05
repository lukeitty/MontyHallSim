/**
* Luke Ittycheria
* Mrs. Thuzar
* Monty Hall Simulator
*@return int return 1 if switch win, otherwise 0
*/

public class MontyHallSim
{
	public static void main(String[] args)
	{
		//System.out.println(args[0]);
		//Integer.parseInt("3"); //Type casts a string with integers in it into an int
		
		String input = args[0];
		int numSim = Integer.parseInt(input);
		System.out.println(numSim);
		
		int switchWin = 0;
		
		for(int i = 0; i < numSim; i++)
			switchWin += game();
		
		double percentSwitchWin = format ((double) switchWin / numSim * 100);
		double percentStayWin = format ((100 - percentSwitchWin));
		
		System.out.println("% switch_win: " + percentSwitchWin);
		System.out.println("% stay_win " + percentStayWin);
	}
	
	/**
	*This methods takes in a double and truncates its 2 decimal places
	* @param d the double input to be truncated
	* @return double formatted to 2 decimal places
	*/
	public static double format(double d)
	{
		int temp = (int) (d * 100);
		return temp /100.0;
		
	}
	/**
	*This method chooses the users pick and the door that the car is located
	*and then compares to see if they match
	*@return 0 or 1 depending on if the user's pick matches the car location
	*/
	
	public static int game()
	{
		int car = (int) (Math.random() * 3 + 1);
		int userPick = (int) (Math.random() * 3 + 1);
		
		if (car == userPick)
			return 0;
		else
			return 1;
		
	}





}
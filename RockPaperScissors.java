//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;
    private int compNumber;

	public RockPaperScissors(String player)
	{
        playChoice = player;
        compNumber = (int)((Math.random()*3)+1);
        if (compNumber==1)
        {
            compChoice="R";
        }
        else if (compNumber==2)
        {
            compChoice="P";
        }
        else if (compNumber==3)
        {
            compChoice="S";
        }
	}

	public String determineWinner()
	{
        String winner="";

        if (playChoice.equals("R"))
        {
            if (compChoice.equals("R"))
            {
                winner="tie";
            }
            if (compChoice.equals("P"))
            {
                winner="computer wins";
            }
            if (compChoice.equals("S"))
            {
                winner="player wins";
            }
        }

        if (playChoice.equals("P"))
        {
            if (compChoice.equals("R"))
            {
                winner="player wins";
            }
            if (compChoice.equals("P"))
            {
                winner="tie";
            }
            if (compChoice.equals("S"))
            {
                winner="computer wins";
            }
        }

        if (playChoice.equals("S"))
        {
            if (compChoice.equals("R"))
            {
                winner="computer wins";
            }
            if (compChoice.equals("P"))
            {
                winner="player wins";
            }
            if (compChoice.equals("S"))
            {
                winner="tie";
            }
        }

		return winner;
	}

	public String toString()
	{
		String output=determineWinner();
        return (String)("Computer had "+compChoice+" and Player had "+playChoice+". "+output);
	}
}

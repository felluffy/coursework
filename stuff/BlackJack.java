package stuff;

import java.io.*;
import java.util.concurrent.ThreadLocalRandom;
public class BlackJack 
{

	BlackJack()
	{
		player = false;
		playerWon = false;
		cMin = 2;
		cMax = 12;
		totalMax = 21;
	}
	
	public void run() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		pCurrentNum = ThreadLocalRandom.current().nextInt(cMin, cMax);
		pNextNum = ThreadLocalRandom.current().nextInt(cMin, cMax);
		plScore = pCurrentNum + pNextNum;
		System.out.println("You get a " + pCurrentNum + " and a " + pNextNum);
		System.out.println("Your total is " + plScore);
		deCurrentNum = ThreadLocalRandom.current().nextInt(cMin, cMax);
		deNextNum = ThreadLocalRandom.current().nextInt(cMin, cMax);
		deScore = deCurrentNum + deNextNum;
		System.out.println("The dealer has a " + deCurrentNum + " showing, and a hidden card\nHis total is hidden too");
		//move = "hit";
		while(true)
		{
//			if(player == false)
//			{
//				
//			}
			System.out.print("Would you like to \"hit\" or \"stay\"? ");
			move = br.readLine();
			if(move.equals("hit"))
			{
				pCurrentNum = pNextNum;
				pNextNum = ThreadLocalRandom.current().nextInt(cMin, cMax);
				System.out.println("You drew a " + pNextNum);
				plScore += pNextNum;
				System.out.println("Your total is " + plScore);
				if(plScore > 21)
				{
					playerWon = false;
					return;
				}
			}
			else if(move.equals("stay"))
				break;		
		}
		System.out.println("Okay, dealer's turn");
		System.out.println("His hidden card was a " + deNextNum + "\nHis total was " + deScore);
		while(true)
		{
			if(deScore <= 16)
			{
				System.out.println("Dealer chooses to hit");
				deCurrentNum = deNextNum;
				deNextNum = ThreadLocalRandom.current().nextInt(cMin, cMax);
				deScore += deNextNum;
				System.out.println("Dealer drew a " + deNextNum + "\nHis total score " + deScore);
				if(deScore > 21)
				{
					playerWon = true;
					return;
				}
			}
			else 
				break;
		}
		if(plScore < deScore)
			playerWon = false;
		else
			playerWon = true;
		return;
	}
	public static void main(String[] args)
	{
		BlackJack bl = new BlackJack();
		try
		{
			bl.run();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		if(bl.playerWon == false)
		{
			System.out.println("Dealer wins");
		}
		else
		{
			System.out.println("You win");
		}
		//plScore = ThreadLocalRandom.current().nextInt(cMin, cMax) + ThreadLocalRandom.current().nextInt(cMin, cMax);
//		bl.pCurrentNum = ThreadLocalRandom.current().nextInt(cMin, cMax);
//		bl.pNextNum = ThreadLocalRandom.current().nextInt(cMin, cMax);
//		bl.plScore = bl.pCurrentNum + bl.pNextNum;
//		System.out.println("You get a " + bl.pCurrentNum + " and a " + bl.pNextNum);
//		System.out.println("Your total is " + bl.plScore);
//		while(true)
//		{
//			if(bl.player == false)
//			{
//				
//			}
//		}
	}
	
	static int cMin;// = 2;
	static int cMax;// = 12;
	int totalMax;
	boolean player;
	int plScore;
	int deScore;
	int deCurrentNum;
	int deNextNum;
	int pNextNum;
	int pCurrentNum;
	boolean playerWon;
	String move;
}

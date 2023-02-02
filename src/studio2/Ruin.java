package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("How much money are you starting with?");
	int startAmountInput = in.nextInt();
	double rnd = Math.random();
	boolean winChance = true;
	int winLimit = 10;
	int games = 1;
	double winChance1 =0.6;
	int winSimu=0;
	int loseSimu=0;
	

	for (int totalSimulations = 1; totalSimulations<=500; totalSimulations++)
	{
		
		int startAmount=startAmountInput;
		games=1;
			

		while (startAmount <winLimit && startAmount >0 )
			{
			rnd = Math.random();
			if (rnd>winChance1)
			{
				winChance=true;
			}
				else {
				winChance=false;
			}
				
			
				if (winChance==true)
				{
					startAmount--;
					
		
				}
				else
				{
					startAmount++;
					
				}
					games++;
//					System.out.println(games);
					
			}
		
			if (startAmount == 0)
			{
				System.out.println("Simulation "+totalSimulations+": "+games+"Games YOU LOSE!");
				loseSimu++;
			}else 
			{
				System.out.println("Simulation "+totalSimulations+": "+games+" Games YOU WIN!");
				winSimu++;
			}
			
	
	
	}
//	System.out.println(w);

	}

}

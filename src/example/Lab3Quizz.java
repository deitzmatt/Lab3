package example;

import java.util.Random;

public class Lab3Quizz 
{

	private static String[] SHORT_NAMES = {"A","R","N","D","C","Q",
		"E","G","H","I","L","K","M","F","P","S","T","W","Y","V"};
	private static String[] FULL_NAMES = {"Alanine","Arginine",
		"Asparagine","Aspartic Acid","Cysteine","Glutamine","Glutamic Acid",
		"Glycine","Histidine","Isoleucine","Leucine","Lysine","Methionine",
		"Phenylalanine","Proline","Serine","Threonine","Tryptophan",
		"tyrosine","Valine"
	};
	
	public static void main(String[] args) 
	{
		
		long timeLimit = 30*1000;
		int score = 0;
		boolean flag = true;
		
		Random random = new Random();
		
		long startTime = System.currentTimeMillis();
		
		while((System.currentTimeMillis()-startTime) < timeLimit && flag)
		{
			int currentRandom = random.nextInt(FULL_NAMES.length);
			System.out.println(FULL_NAMES[currentRandom]);
			String aString = System.console().readLine().toUpperCase();
			String aChar = ""+aString.charAt(0);
			
			if(aChar.equals(SHORT_NAMES[currentRandom]))
			{
				score++;
				System.out.println("Correct! Score="+score+" ; Time= "+System.currentTimeMillis()/1000f+" seconds out of "+timeLimit/1000f);
			}
			else{
				flag = false;
				System.out.println("Incorrect, Score="+score+" ; Time= "+System.currentTimeMillis()/1000f+" seconds out of "+timeLimit/1000f);
			}
		}
		
	}

}

package example;

import java.util.Random;

public class Lab3QuizzNumberedQuestions 
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
		
		int score = 0;
		int numQuestions = 20;
		
		Random random = new Random();
		long startTime = System.currentTimeMillis();
		
		for (int x = 0; x<numQuestions;x++)
		{
			int currentRandom = random.nextInt(FULL_NAMES.length);
			System.out.println(FULL_NAMES[currentRandom]);
			String aString = System.console().readLine().toUpperCase();
			String aChar = ""+aString.charAt(0);
			
			if(aChar.equals(SHORT_NAMES[currentRandom]))
			{
				score++;
				System.out.println("Correct! Score="+score+" ; Time= "+(System.currentTimeMillis()-startTime)/1000f);
			}			
			else{
				System.out.println("Incorrect, Score="+score+" ; Time= "+(System.currentTimeMillis()-startTime)/1000f);
			}
		}
		
	}

}

package example;

import java.util.Random;

public class Lab3QuizzReportOnAnswers 
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
		int[] score = new int[SHORT_NAMES.length];
		int[] incorrect = new int[SHORT_NAMES.length];
		
		Random random = new Random();
		
		long startTime = System.currentTimeMillis();
		
		while((System.currentTimeMillis()-startTime) < timeLimit)
		{
			int currentRandom = random.nextInt(FULL_NAMES.length);
			System.out.println(FULL_NAMES[currentRandom]);
			String aString = System.console().readLine().toUpperCase();
			String aChar = ""+aString.charAt(0);
			
			if(aChar.equals(SHORT_NAMES[currentRandom])&&(System.currentTimeMillis()-startTime)<timeLimit)
			{
				score[currentRandom]++;
			}
			else if(System.currentTimeMillis()-startTime > timeLimit){
				System.out.println("Sorry you ran out of time.");
			}			
			else{
				incorrect[currentRandom]++;
			}
		}
		
		for(int x = 0;x<score.length;x++){
			System.out.println("Amino Acid: "+FULL_NAMES[x]+" "+SHORT_NAMES[x]);
			System.out.println("\tCorrect= "+score[x]);
			System.out.println("\tIncorrect= "+incorrect[x]);
		}
		
		
	}

}

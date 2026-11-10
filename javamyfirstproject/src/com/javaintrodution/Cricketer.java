package com.javaintrodution;

public class Cricketer {
	static String boardName;
	static String countryName;
	int jerseyNumber;
	String CricketerName;
	int highestScore;

	public static void main(String[] args) {
		boardName = "BCCI";
		countryName = "India";
		System.out.println("boardName:" + boardName);
		System.out.println("countryName:" + countryName);
		boardName = "slc";
		countryName = "sri lanka";
		System.out.println("boardName:" + boardName);
		System.out.println("countryName:" + countryName);
        //object 1
		Cricketer msd = new Cricketer();
		msd.jerseyNumber = 7;
		msd.CricketerName = "ms dhoni";
		msd.highestScore = 100;

		System.out.println("jerseyNumber:" +msd.jerseyNumber);
		System.out.println("CricketerName:" + msd.CricketerName);
		System.out.println("highestScore:" + msd.highestScore);
		//object 2
		
		Cricketer kohli= new Cricketer();
		kohli.jerseyNumber = 8;
		kohli.CricketerName = "kohli";
		kohli.highestScore = 100;
		System.out.println("jerseyNumber:"+ kohli.jerseyNumber);
		System.out.println("CricketerName:" + kohli.CricketerName);
		System.out.println("highestScore:" + kohli.highestScore);
		//object 3
		
		Cricketer rahul= new Cricketer();
		rahul.jerseyNumber = 9;
		rahul.CricketerName = "rahul";
		rahul.highestScore = 100;
		System.out.println("jerseyNumber:" +rahul.jerseyNumber);
		System.out.println("CricketerName:" + rahul.CricketerName);
		System.out.println("highestScore:" + rahul.highestScore);
		//object 4
		
		Cricketer rohith = new Cricketer();
		rohith.jerseyNumber = 5;
		rohith.CricketerName = "rohith";
		rohith.highestScore = 100;
		System.out.println("jerseyNumber:" +rohith.jerseyNumber);
		System.out.println("CricketerName:" + rohith.CricketerName);
		System.out.println("highestScore:" + rohith.highestScore);
		
		
		



	}

}

package Swing_Driver_Ed_Remastered;

import java.util.Scanner;

public class DriversTest 
{
	static char[] answers = new char[20];
	static char[] test = new char[20];
	public DriversTest(String temp)
	{
		for (int i = 0; i<20;i++)
			test[i] = temp.charAt(i);
			
	}
	
	public DriversTest(char[] temp)
	{
		 test = temp;
	}
	
	public boolean passed()
	{
		int wrong = 0;
		for(int i = 0; i < test.length; i++)
		{
			if(test[i] != answers[i])
				wrong++;
		}
		if(wrong <= 5)
			return true;
		else return false;
	}
	
	public int totalCorrect()
	{
		int right = 0;
		for(int i = 0; i < test.length; i++)
		{
			if(test[i] == answers[i])
				right++;
		}
		return right;
	}
	
	public int totalIncorrect()
	{
		int wrong = 0;
		for(int i = 0; i < test.length; i++)
		{
			if(test[i] != answers[i])
				wrong++;
		}
		
		return wrong;
	}
	
	public int[] questionsMissed()
	{
		int[] wrong = new int[this.totalIncorrect()];
		int f = 0;
		while (f < totalIncorrect())
		{
			for(int i = 0; i < test.length; i++)
			{
				if(test[i] != answers[i])
				{
					wrong[f] = i;
					f++;
				}
			}
		}
		return wrong;
	}
	
	public static void changeKey()
	{
		char[] newKey = new char[20];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the new answers");
		for(int i = 0; i < 20; i++)
		{
			System.out.print(i + 1 + ": ");
			String a = scan.next();
			newKey[i] = a.charAt(0);
		}
		System.out.println("\nNew answer key done");
		answers = newKey;
	}
	
	public static char[] getKey()
	{
		return answers;
	}
	public static char[] getAnswers()
	{
		return test;
	}
	
	public static void setKey(String key)
	{
		for(int i = 0; i < 20; i++)
		{
			answers[i] = key.charAt(i);
		}
	}
	}
	
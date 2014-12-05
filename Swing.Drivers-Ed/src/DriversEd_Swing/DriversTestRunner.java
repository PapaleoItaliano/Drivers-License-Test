package DriversEd_Swing;

import java.util.Arrays;

public class DriversTestRunner 
{
	public static void main(String[] args)
	{
		char[] arr1 = {'B','D','A','A','C','A','B','A','C','D','B','C','D','A','D','C','C','B','D','A'};
		DriversTest test1 = new DriversTest(arr1);
		char[] arr2 = {'A','B','C','D','E','B','B','A','C','D','B','C','D','A','D','C','C','B','D','A'};
		DriversTest test2 = new DriversTest(arr2);
		
		DriversTest.setKey("BDAACABACDBCDADCCBDA");
		
		System.out.println("Passed = " + test1.passed());
		System.out.println("Passed = " + test2.passed());
		System.out.println("Total correct = " + test1.totalCorrect());
		System.out.println("Total correct = " + test2.totalCorrect());
		System.out.println("Total incorrect = " + test1.totalIncorrect());
		System.out.println("Total incorrect = " + test2.totalIncorrect());
		System.out.println("Wrong answers = questions " + Arrays.toString(test1.questionsMissed()));
		System.out.println("Wrong answers = questions " + Arrays.toString(test2.questionsMissed()));
		
		DriversTest.changeKey();
		System.out.println(DriversTest.getKey());
	}
}

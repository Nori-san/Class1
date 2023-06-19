package MyProgram;

import java.util.Scanner;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//#1
		System.out.println("Hello\nMark Sumoba");
		
		//#2
		//System.out.println(74 + 36); //test data output: 110
		System.out.println(150 + 95);
	
		//#3
		//System.out.println(50/3); //test data data output: 16
		System.out.println(125/24);
		
		//#4
		System.out.println("    J     a    V     V  a");
		System.out.println("    J    a a    V   V  a a");
		System.out.println("J   J   aaaaa    V V  aaaaa");
		System.out.println(" JJ    a     a    V  a     a");
		
        
		//#6
		System.out.println("* * * * * * =================================="); //1
		System.out.println(" * * * * *  =================================="); //2
		System.out.println("* * * * * * =================================="); //3
		System.out.println(" * * * * *  =================================="); //4
		System.out.println("* * * * * * =================================="); //5
		System.out.println(" * * * * *  =================================="); //6
		System.out.println("* * * * * * =================================="); //7
		System.out.println(" * * * * *  =================================="); //8
		System.out.println("* * * * * * =================================="); //9
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		
		//#7 
		System.out.println(" +\"\"\"\"\"+");
		System.out.println("[| o o |]");
		System.out.println(" |  ^  |");
		System.out.println(" | '-' |");
		System.out.println(" +-----+");
		
		//#5
				Scanner input = new Scanner(System.in);

		        System.out.println("input 1st number: ");
		        int num1 = input.nextInt();
		        System.out.println("input 2nd number: ");
		        int num2 = input.nextInt();
		        System.out.println("input 3rd number: ");
		        int num3 = input.nextInt();

		        int sum = num1 + num2 + num3;

		        System.out.println("Sum of numbers = " + sum);
		        input.close();
	}
}
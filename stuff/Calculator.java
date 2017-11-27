//29
package stuff;

import java.io.*;
import java.math.*;
public class Calculator 
{
	public void run() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//while(true)
		System.out.print(">");
		while((expression = br.readLine()) != null)
		{
			String[] things = expression.split(" ");
			if (things.length != 3)
			{
				System.out.println("Invalid operation");
				System.out.print(">");
				continue;
			}
			try{
				constant1 = Integer.parseInt(things[0]);
			
			if(constant1 == 0)
				return;
			constant2 = Integer.parseInt(things[2]);
			operator = things[1];
			}catch(Exception e)
			{
				System.out.println("invalid input");
				System.out.print(">");
				continue;
			}
//			expression = br.readLine();
//			for(String things : expression.split(" "))
//			{
//				System.out.println(things);
//				if(pos == 0)
//				{
//					constant1 = Integer.parseInt(things);
//					if(constant1 == 0)
//						return;
//					pos++;
//				}
//				if(pos == 1)
//				{
//					operator = things;
//					pos++;
//				}
//				if(pos == 2)
//				{
//					constant2 = Integer.parseInt(things);
//					pos = 0;
//				}
//			}
//			expression = br.rea
			switch(operator)
			{
			case "+": evaluatedValue = constant1 + constant2;
			break;
			case "-": evaluatedValue = constant1 - constant2;
			break;
			case "*": evaluatedValue = constant1 * constant2;
			break;
			case "/": evaluatedValue = constant1 / constant2;
			break;
			case "%": evaluatedValue = constant1 % constant2;
			break;
			case "^": evaluatedValue = (int) Math.pow(constant1, constant2);
			break;
			default: System.out.println("Wrong input form");
			continue;
			}
			
			System.out.println(evaluatedValue);
			System.out.print(">");
		}
	}

	public static void main(String[] args)
	{
		System.out.println("Input form: constant operator constant");
		Calculator c = new Calculator();
		try
		{
			c.run();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		System.out.println("Exitting");
	}
	int evaluatedValue;
	String operator;
	String expression;
	int constant1;
	int constant2;
	int pos = 0;
}

/*
	Name: AMAAN SAJINA
	DOC: 04/02/2022
	ObJECTIVE:  Scientific Calculator
*/


import java.util.*;


class Calculator
{
	private int x,y;
	private double z;
	public void add()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x:");
		x=s.nextInt();
		System.out.println("Enter the value of y:");
		y=s.nextInt();
		
		z=x+y;
		System.out.println("The addition of given inputs is "+z);
	}//end of add
	
	public void sub()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x:");
		x=s.nextInt();
		System.out.println("Enter the value of y:");
		y=s.nextInt();
		
		z=x-y;
		System.out.println("The subsraction of given inputs is "+z);
	}//end of sub
	
	public void mul()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x:");
		x=s.nextInt();
		System.out.println("Enter the value of y:");
		y=s.nextInt();
		
		z=x*y;
		System.out.println("The multiplication of given inputs is "+z);
	}//end of mul
		
	public void div()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of x:");
		x=s.nextInt();
		System.out.println("Enter the value of y:");
		y=s.nextInt();
		
		z=x/y;
		System.out.println("The division of given inputs is "+z);
	}//end of div
	
	public void root()
	{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the value:");
			x=s.nextInt();
			
			System.out.println("The sqaure root for given value is "+Math.sqrt(x));
	}//end of root
	
	public void cmtoinch()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value(cm):");
		x=s.nextInt();
		
		z=x*0.3937;
		System.out.println("The answer(Inch): "+z);
	}//end of cmtoinch
	
	public void cmtofeet()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value(cm):");
		x=s.nextInt();
		
		z=x*0.0328;
		System.out.println("The answer(Feet): "+z);
	}//end of cmtofeet
	
	public void cmtoyards()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value(cm):");
		x=s.nextInt();
		
		z=x*0.0109;
		System.out.println("The answer(Yards): "+z);
	}//end of cmtoyards
	
	public void celtoF()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the temperature(celsius):");
		x=s.nextInt();
		
		z=(x*1.8)+32;
		System.out.println("The answer(Feranhit): "+z);
	}//end of celtoF
	
	public void celtoK()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the temperature(celsius):");
		x=s.nextInt();
		
		z=x+273.15;
		System.out.println("The answer(Kelvin): "+z);
	}//end of celtoK

	public void artoAC()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the area:");
		x=s.nextInt();
		
		z=x*0.0247;
		System.out.println("The answer(Acers): "+z);
	}//end of artoAC

	public void artoH()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the area:");
		x=s.nextInt();
		
		z=x*0.01;
		System.out.println("The answer(Hectares): "+z);
	}//end of artoH

	public void artoSF()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the area:");
		x=s.nextInt();
		
		z=x*1076.3910;
		System.out.println("The answer(Square feet): "+z);
	}//end of artoSF

}//end of calculator


public class Calc
{
	public static void main(String[] args)
	{
		int choice,lengthConversion,tempConversion,areaConversion;
		Scanner s1=new Scanner(System.in);
		
		Calculator obj=new Calculator();
		while(true)
		{
			System.out.println("1---Addition");
			System.out.println("2---Subtraction");
			System.out.println("3---Multiplication");
			System.out.println("4---Division");
			System.out.println("5---Square root");
			System.out.println("6---Length Conversion");
			System.out.println("7---Temperature Conversion");
			System.out.println("8---Area Conversion");
			System.out.println("9---Exit");

			System.out.println("Enter your choice:");
			choice=s1.nextInt();
			switch(choice)
			{
				case 1: obj.add();
				
				break;
				
				case 2: obj.sub();
				
				break;
				
				case 3: obj.mul();
				
				break;
				
				case 4: obj.div();
				
				break;
				
				case 5: obj.root();
				
				break;
				
				case 6: System.out.println("Select from below list!!");
						System.out.println("1---Cm to Inch");
						System.out.println("2---Cm to Feet");
						System.out.println("3---Cm to Yards");
						System.out.println("4---Exit");
						
						System.out.println("Enter your choice:");
						lengthConversion=s1.nextInt();
						
						switch(lengthConversion)
						{
							case 1: obj.cmtoinch();							
							break;
							
							case 2: obj.cmtofeet();
							
							break;
							
							case 3: obj.cmtoyards();
							
							break;
							
							case 4: System.exit(0);
							
							default: System.out.println("Invalid choice!!!");
						}//end of unitConversion

				break;

				case 7: System.out.println("Select from below list!!");
						System.out.println("1---Celsius to Fehrenheit");
						System.out.println("2---Celsius to Kelvin");
						System.out.println("3---Exit");
						
						System.out.println("Enter your choice:");
						tempConversion=s1.nextInt();
						
						switch(tempConversion)
						{
							case 1: obj.celtoF();							

							break;
							
							case 2: obj.celtoK();
							
							break;
							
							case 3: System.exit(0);
							
							default: System.out.println("Invalid choice!!!");
						}//end of tempConversion

				break;
				
				case 8: System.out.println("Select from below list!!");
						System.out.println("1---Area to Acers");
						System.out.println("2---Area to Hectares");
						System.out.println("3---Area to Square feet");
						System.out.println("4---Exit");
						
						System.out.println("Enter your choice:");
						tempConversion=s1.nextInt();
						
						switch(tempConversion)
						{
							case 1: obj.artoAC();							

							break;
							
							case 2: obj.artoH();
							
							break;
							
							case 3: obj.artoSF();
						
							break;
							
							case 4: System.exit(0);						
							
							default: System.out.println("Invalid choice!!!");
						}//end of tempConversion
				
				case 9: System.exit(0);
				
				default: System.out.println("Invalid choice!!!");
				
			}//end of switch
			
		}//end of while
		
	}//end of main static class

}//end of calc
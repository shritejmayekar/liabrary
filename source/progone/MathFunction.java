/******************************************************************************
 *  Compilation:  javac -d bin com/bridgelabz/util/MathFunction.java
 *  Execution:    java -cp bin com.bridgelabz.util.MathFunction
 *  
 *  Purpose: To Perform various operation like collinear check, square root ,
 *           harmonic,compound amount ,prime no.,factorial, minMax ,sine,cosine,
 *           and Binary.
 *
 *  @author  Shritej
 *  @version 1.0
 *  @since   10-08-2017
 *
 ******************************************************************************/
package progone;
import java.util.Scanner;

 class Compound
{
    public static double presentValue(double compound,double rate,double  time)
    {
        
        return compound*Math.pow(1+rate,time);
    }
	public static double FutureValue(double compound,double rate,double  time)
    {
        
        return compound*Math.pow(1+rate,time);
    }
    
}
 public class MathFunction {
	//Declaration for compound calculate
    public static double compound,rate,time,C;
	
	//Declaration for slope
    public static double slopeAB,slopeBC,slopeAC;
	
	//Declaration for points
    public static int x1,y1,x2,y2,x3,y3,choice,number,i,counter;
	
	//Declaration for factorial
    public static long fact=1;
	
	//Declaration for sine and cosine 
	public static double angleDegree,sum,angleRadian;
	
	//Declaration for binary 
	public static String binary="";
	
	//Declaration for array for minValue and maxValue
	public static int array[]={5,4,2,16,8};
	public static String stringArray[]={"sham","ram","ghansham","om"};
	
/*	Method returns to checkCollinearUsingSlope
* 	@param (x1,y1),(x2,y2) and (x3,y3) as input to check collinear
*	@return true if collinear else returns false
*/
    public static Boolean checkCollinearUsingSlope(int x1,int y1,int x2,int y2,int x3,int y3)
    {
        slopeAB=(y2-y1)/(x2-x1); //Slope of A and B
        
        slopeBC=(y3-y2)/(x3-x2); //slope of B and C
        
        slopeAC=(y3-y1)/(x3-x1); //slope of A and C
        if((slopeAB==slopeBC)&&(slopeAB==slopeAC)&&(slopeBC==slopeAC))
            return true;
     
        
        return false;
    }
/*	Method returns to checkCollinearUsingArea
* 	@param (x1,y1),(x2,y2) and (x3,y3) as input to check collinear
*	@return true if collinear else returns false
*/
    public static Boolean checkCollinearUsingArea(int x1,int y1,int x2,int y2,int x3,int y3)
    {
        int area;
        
        area=Math.abs(1/2*((x1-x2)*(y2-y3)-(x2-x3)*(y1-y2)));
        if(area==0)
            return true;
     
        
        return false;
    }
/*	Method returns to find squareroot using Newtons method
* 	@param c as velocity input
*	@return t as an squareroot
*/
    public static double sqrt(double c)
    {
        double epsilon=1e-15;
        double t=c;
        t=(c/t+t)/2;
        while(Math.abs(t-c/t)>epsilon*t)
        {
            t=(c/t+t)/2;
        }
        return t;
    }
/*	
*	Method overloaded returns to find squareroot using Newtons method
* 	@param c as velocity input
*	@return t as an squareroot
*/
     public static double sqrt(double c,double epsilon)
    {
        double t=c;
        t=(c/t+t)/2;
        while(Math.abs(t-c/t)>epsilon*t)
        {
            t=(c/t+t)/2;
        }
        return t;
    }
/*	
*	factorial method to find factorial of number n
*	@param n as number
*	@return fact as factorial
*/
     public static long factorial(int n)
     {
         while(n>0)
         {
             fact=fact*n;
             n--;
         }
         return (fact);
     }
/*	
*	Harmonic method to find Harmonic of number n
*	@param number as number
*	@return sum as harmonic number
*/
     public static double Harmonic(int number)
    {
        double sum=0.0;
        for (int i = 1; i <= number; i++) {
            System.out.print("1/"+i);
            if(i<number)
        	System.out.print("+");
			
            sum=sum+Math.pow(i, -1);
        }
        return sum;
    }
	public static double sine(int number,double angleDegree)
	{
		//angle to radian
		angleRadian=angleDegree * (Math.PI/180);
		i=1;
		int sign=1;
		while(i<number)
		{
			sum+=Math.pow(angleRadian, i)/factorial(i);
			sign=-sign;
			i=i+2;
		}
		return sum;
	}
/*
*	Number is prime or not
*	@param number as number
*	@return boolean true or fale
*/
	public static boolean isPrime(int number)
	{
		counter=0;
		if(number==1)
			return true;
		else
		{
			for(int i=1;i<=number;i++)
			{
				if(number%i==0)
					counter++;
			}
			if(counter==2)
				return true;
		}
		return false;
	}
/*
*	Consine angle calculate
*	@param number terms and angleDegree
*	@return sum
*/
	public static double cosine(int number,double angleDegree)
	{
		//angle to radian
        angleRadian=angleDegree * (Math.PI/180);
        i=1;
        int sign=1;
        while(i<number)
        {
            sum+=Math.pow(angleRadian, i)/factorial(i);
            sign=-sign;
            i=i*2;
        }
		return sum;
	}
/*
*	Decimal to Binary conversion 
*	@param number of which  converted to binary
*	@returns binary number
*/
	public static String binary(int number)
	{
		while(number>0)
		{	
			//if remainder is zero than 0
			if(number%2==0)
				binary=0+binary;
			//if remainder is one than 1
			if(number%2==1)
				binary=1+binary;
			//Taking quotient of Number
			number/=2;
		}
		return binary;
	}
/*
*	Find min of element
*	@param array[] 
*	@returns min
*/
	public static int minValue(int array[])
	{
		int min;
		min=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(min>array[i])
				min=array[i];
		}
		return min;
	}
/*
*	Find max of element
*	@param array[]  
*	@returns max
*/
	public static int maxValue(int array[])
	{
		int max;
		max=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(max<array[i])
				max=array[i];
		}
		return max;
	}
/*
*	Find min of element
*	@param stringArray[] 
*	@returns min
*/
	public static int minValue(String stringArray[])
	{
		int min;
		min=stringArray[0].length();
		for(int i=1;i<stringArray.length;i++)
		{
			if(min>stringArray[i].length())
				min=stringArray[i].length();
		}
		return min;
	}
/*
*	Find max of element
*	@param stringArray[]  
*	@returns max
*/
	public static int maxValue(String stringArray[])
	{
		int max;
		max=stringArray[0].length();
		for(int i=1;i<stringArray.length;i++)
		{
			if(max<stringArray[i].length())
				max=stringArray[i].length();
		}
		return max;
	}
	
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);
		System.out.println("\nPlease enter choice\n1.To find Compound rate of presentValue\n2.Collinear using slope"+
			"\n3.Collinear using area\n4.Find squareroot\n5.Factorial\n6.Harmonic\n7.Sine\n8.isPrime"
			+"\n9.cosine\n10.Binary\n11.Find minValue int\n12.Find maxValue int"
			+"\n13.Find minValue string\n14.Find maxValue string ");
		choice=in.nextInt();
        switch(choice)
		{
/*
*	Find compound interest rate
*/
			case 1:
			System.out.println("please enter the compound invest ,time and rate of interest");
			C=in.nextDouble();
			time=in.nextDouble();
			rate=in.nextDouble();
			System.out.println("Compound="+Compound.presentValue(C, rate, time));
			break;
			
			case 2:       
/*
*   Check the collinear using slope
*/
			x1=2;y1=4;x2=4;y2=6;x3=6;y3=8;
			if(checkCollinearUsingSlope(x1, y1, x2, y2, x3, y3))
				System.out.println("Collinear");
			else
				System.out.println("Not an collinear");
			break;
			
			case 3:
/*
*   Check the collinear using Area
*/        
			if(checkCollinearUsingArea(x1, y1, x2, y2, x3, y3))
				System.out.println("Collinear");
			else
				System.out.println("Not an collinear");
			break;
			
			case 4:
/*
*   Find squareroot of number c using Newtons's method
*/        
			System.out.println("Please enter an C:");
			C=in.nextDouble();
			System.out.println("sqrt="+sqrt(C));
			System.out.println("sqrt="+sqrt(C,1e-15));
			break;
			
			case 5:
/*
*   Find factorial of number
*/      	System.out.print("Enter the number:");
			number=in.nextInt();
			System.out.println("fact="+factorial(number));
			break;
			
			case 6:
/*
*	Find harmonic of number
*/			System.out.println("Enter the nth number:");
			number=in.nextInt();
			System.out.println("\nThe sum of Harmonic:"+Harmonic(number));
			break;
			
			case 7:
/*
*	Find sine of number
*/
			System.out.println("Enter the angle and terms:");
			angleDegree=in.nextInt();
			number=in.nextInt();
		   
			System.out.println("\nsinx="+sine(number,angleDegree));
			
			break;
/*
*	isPrime number
*/			case 8:
			System.out.print("Enter no.:");
			number=in.nextInt();
			if(isPrime(number))
				System.out.println("Number is prime");
			else
				System.out.println("Number is not prime");
			break;
			
			case 9:
			System.out.print("Enter the angle and terms:");
			angleDegree=in.nextInt();
			number=in.nextInt();
			System.out.println("\ncosx="+cosine(number,angleDegree));
			
			break;
			
/*
*	To convert decimal to binary
*/			case 10:
			System.out.print("Enter no.:");
			number=in.nextInt();
			System.out.println("Binary of "+number+" is a "+binary(number));
			break;
/*
*	To find min of number
*/			
			case 11:
			System.out.println("The min value is "+minValue(array));
			break;
/*
*	To find max of number
*/			
			case 12:
			System.out.println("The max value is "+maxValue(array));
			break;
/*
*	To find min of string
*/			
			case 13:
			System.out.println("The min value is "+minValue(stringArray));
			break;
/*
*	To find max of string
*/			
			case 14:
			System.out.println("The max value is "+maxValue(stringArray));
			break;

			default:
			System.out.print("Invalid choice");
			break;
		}
    }
    
}

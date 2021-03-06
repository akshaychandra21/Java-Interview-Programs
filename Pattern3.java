/*
Write a java program to print the following pattern.
Example:
Input	: 	5
Output	:	1*2*3*4*5
			11*12*13*14*15
			21*22*23*24*25
			20*19*18*17*16
			10*9*8*7*6


Input	:	4
Output	:	1*2*3*4
			9*10*11*12
			16*15*14*13
			8*7*6*5
 */

import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in 	   = sc.nextInt();
		sc.close();
		getPattern(in);
	}
	public static void getPattern(int in)
	{
		int T = 0,B = in-1;
		int num  = 1;
		int dir  = 0;
		int[][]o = new int[in][in];
		while(T <= B)
		{
			if(dir == 0)
			{
				for(int i=0; i<in; i++)
				{
					o[T][i] = num++;
				}
				if(T == B) break;
				dir = 1;
				T++;
			}
			
			if(dir == 1)
			{
				for(int i=in-1; i>=0; i--)
				{
					o[B][i] = num++;
				}
				B--;
				dir = 0;
			}
		}
		for(int i=0; i<in; i++)
		{
			for(int j=0;j<in;j++)
			{
				System.out.print(o[i][j]);
				if(j != in-1)
					System.out.print("*");
			}
			System.out.println();
		}
		
	}

}

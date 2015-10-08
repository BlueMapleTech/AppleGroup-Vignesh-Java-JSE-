package com.blumapletech.vigneshjava.programs;

import java.util.Scanner;

public class DiamondProgram {

	public static void main(String args[])throws Exception{
		Scanner s=new Scanner(System.in);    
        System.out.println("Enter you First Name");   
		String a=s.nextLine();
		//char[] aInCharArray=a.toCharArray();
		//for(char temp:passwordInCharArray)
		int t=a.length();
		int d=t;
		int e=d;
		for(int i=0;i<a.length();i++) {
			
			for(int k=t;k>0;k--) {
			    System.out.print(" ");
			}
			
			d=d-1;
			t=d;
			
			for(int j=0;j<=i;j++) {
				System.out.print(" "+a.charAt(j));
			}
			System.out.println("");
		}
		
		int n=e+e;
		int p=1;
		for(int l=e;l<=n;l++) {
			p=p+1;
			for(int m=0;m<p;m++) {
				System.out.print(" ");
			}
			int g=e;
			int b=e;
			g=g-1;
			for(int x=0;x<g;x++) {
				System.out.print(" "+a.charAt(x));
			}
			b=b-1;
			e=b;
			System.out.println("");
		}
	}
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compound;

import java.util.Scanner;
public class Compound {
    
public static void main(String[] args) {
Scanner tshedza=new Scanner(System.in);

double A,P,I,N;
System.out.println("Enter the principal amount:");//display

P=tshedza.nextDouble();//receive the input

System.out.println("Enter the annual interest rate:");

I=tshedza.nextDouble();

System.out.println("Enter the period:");

N=tshedza.nextDouble();

  A=P*Math.pow(1+I,N);
  
  System.out.println("The final answer is"+A);



















    }
    
}

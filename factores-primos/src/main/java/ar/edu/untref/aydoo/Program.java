package ar.edu.untref.aydoo;

import java.util.Scanner; 

public class Program 
{
   
	public static void main (String [ ] args) 
    {
        
		Scanner objEntrada = new Scanner(System.in);
        System.out.print("Escribe un numero para descomponerlo en sus factores primos");
        int numero = objEntrada.nextInt();
        claseFactor.factorizar(numero);
    }
		
		

		}   
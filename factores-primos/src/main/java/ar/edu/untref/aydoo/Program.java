package ar.edu.untref.aydoo;

public class Program 
{
   
	public static final void factorizarNumeroEnPrimos(int numero)
    {
        

		System.out.print("\nLos factores primos del numero ingresado son " + numero + ": ");

		
		int numeroNuevo = numero;
		int n = 2;

		while(numeroNuevo != 1)
		{

			if(numeroNuevo % n == 0)
		{
				System.out.print(n + " ");
				numeroNuevo = numeroNuevo /n;
			}
		else{
				n++;

	          	}

		}   

	}


}

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

			while(numeroNuevo % n == 0){

				numeroNuevo = numeroNuevo / n;
				System.out.print(n + " ");
			}
		else{
				n++;

	          	}

		}   

	}


}

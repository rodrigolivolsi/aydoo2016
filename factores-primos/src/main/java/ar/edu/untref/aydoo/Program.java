package ar.edu.untref.aydoo;

public class Program 
{
   
	public static final void descomponerNumero(int numero)
    {
        

		System.out.print("\nLos factores primos del numero ingresado son " + numero + ": ");

		
		int numeroNuevo = numero;
		int n = 2;

		while(numeroNuevo >= 2){

			if(numeroNuevo % n == 0){

				numeroNuevo = numeroNuevo / n;
				System.out.print(n + " ");

			}else{

				n++;

			}

		}   

	}


}

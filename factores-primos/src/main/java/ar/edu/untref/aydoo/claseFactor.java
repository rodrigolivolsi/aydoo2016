package ar.edu.untref.aydoo;
/**
* @Pre: El número ingresado tiene que ser natural.
* @Post: Entrega al numero ingresado descompuesto en sus factores primos.
*/
public class claseFactor {

	public static void factorizar(int numero){
		int n = 2;

        while(numero!=1)
        {
             while(numero%n==0)
             {
                  System.out.print(n + " ");
                  numero /= n;
             }
        }
	}
}

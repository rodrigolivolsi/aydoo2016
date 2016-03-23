package ar.edu.untref.aydoo;

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

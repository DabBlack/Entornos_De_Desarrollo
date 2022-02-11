package examen_01_12_21;

public class Ejercicio03 {
	public static void main(String[] args) {
		//Declaro un arrays de 10 elementos.
		int[] numeros=new int[10];
		//Recorro el arrays
		for(int i=0; i<numeros.length; i++){
			//Compruebo si es un número par.
			if (esPar(i)) {
				numeros[i]=i;
			}
			else
				//Si es impar, lo cambio a par sumando 1.
			{
				numeros[i]=i+1;
			}
			System.out.println(numeros[i]);
		}
	}

	//Método para comprobar si es par un valor.
	public static boolean esPar(int num) {
		boolean resultado=false;
		if(num%2==0) {
			resultado=true;
	}
		else
		{
			resultado=false;
		}
		return resultado;
	}
}

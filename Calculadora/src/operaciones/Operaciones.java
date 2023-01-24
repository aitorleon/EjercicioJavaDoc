package operaciones;
public class Operaciones{
	/**
	 * Este metodo suma los dos numeros introducidos en la calculadora
	 * @return devuelve la suma de los numeros introducidos
	 */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    /**
     * Este metodo resta los dos numeros introducidos por el usuario
     * @return devuelve el numero (suma de los valores 1 y 2)
     */
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    /**
     * Este metodo devolvera la multiplicacion de los dos valores introducidos
     * @return devuelve el numero (multiplicacion de los valores 1 y 2)
     */
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    /**
     * Este metodo devolvera la division de los dos valores introducidos
     * @return devuelve el numero (division de valoren 1 y 2)
     */
    public int dividir (int valor1, int valor2) throws ArithmeticException{
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    /**
     * Este metodo devolvera el resto de los dos valores introducidos
     * @return devuelve el numero (resto de valores 1 y 2)
     */
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}
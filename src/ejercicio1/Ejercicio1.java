package ejercicio1;

import java.util.Scanner;
/**
 *
 * @author isc_arae
 */
public class Ejercicio1 {

    int valor = 0, valor1, valor2, valor3;
    
    //pide al usuario ingresar los valores
    public void inicializar()
    {
        Scanner leer = new Scanner(System.in);//se crea el objeto leer de tipo Scanner para poder usar lo que ingresa el usuario
	
        System.out.println("Ingrese el primer valor:");//pedimos un valor al usuario
	valor1 = leer.nextInt();//asignamos el valor ingresado a la variable

        System.out.println("Ingrese el segundo valor:");
	valor2 = leer.nextInt();

	System.out.println("Ingrese el tercer valor:");
	valor3 = leer.nextInt();
    }
    
    //calcula cual es el valor mayor ingresado
    public void calcularMayor(){
        if(valor1 > valor)
            valor = valor1;
        if(valor2 > valor)
            valor = valor2;
        if(valor3 > valor)
            valor = valor3;
	if(valor1 == valor2 & valor2 == valor3)
	    System.out.println("No hay Valor Mayor ya que todos los Valores son Iguales a " + valor);
        else
	    System.out.println("El Valor Mayor es: " + valor);
    }
    
    //calcula cual es el valor menor ingresado
    public void calcularMenor(){
        if(valor1 < valor)
            valor = valor1;
        if(valor2 < valor)
            valor = valor2;
        if(valor3 < valor)
            valor = valor3;
	if(valor1 == valor2 & valor2 == valor3)
	    System.out.println("No hay Valor Menor ya que todos los Valores son Iguales a " + valor);
        else
    	    System.out.println("El Valor Menor es: " + valor);
    }
    
    public static void main(String[] args) {
        Ejercicio1 llamarMetodo = new Ejercicio1();//se crea el objeto llamarMetodo para poder utulizar los metodos de la clase
        llamarMetodo.inicializar();
        llamarMetodo.calcularMayor();
        llamarMetodo.calcularMenor();
    }
}
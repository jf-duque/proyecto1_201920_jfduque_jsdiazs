package model.data_structures;

import java.util.Iterator;
import java.util.NoSuchElementException;


/**
 * 2019-01-23
 * Estructura de Datos Arreglo Dinamico de Strings.
 * El arreglo al llenarse (llegar a su maxima capacidad) debe aumentar su capacidad.
 * @author Fernando De la Rosa
 *
 */
@SuppressWarnings("unchecked")
public class DinamicArray <T extends Comparable <T>> implements IDinamicArray<T> 
{
	/**
	 * Capacidad maxima del arreglo
	 */
	private int tamanoMax;
	/**
	 * Numero de elementos presentes en el arreglo (de forma compacta desde la posicion 0)
	 */
	private int tamanoAct;
	/**
	 * Arreglo de elementos de tamaNo maximo
	 */
	private T elementos[ ];

	/**
	 * Construir un arreglo con la capacidad maxima inicial.
	 * @param max Capacidad maxima inicial
	 */
	public DinamicArray( )
	{
		elementos = (T[]) new DinamicArray[tamanoMax];
		tamanoMax = 0;
		tamanoAct = 0;
	}

	/**
	 * Retornar el numero de elementos maximo en el arreglo
	 * @return
	 */
	public int darCapacidad( )
	{
		return tamanoMax;

	}

	/**
	 * Retornar el numero de elementos presentes en el arreglo
	 * @return
	 */
	public int darTamano( ) 
	{
		return tamanoAct;
	}

	/**
	 * Retornar el elemento en la posicion i
	 * @param i posicion de consulta
	 * @return elemento de consulta. null si no hay elemento en posicion.
	 */
	public T darElemento( int i ) 
	{
		return null;
	}

	/**
	 * Agregar un vaje de forma compacta (en la primera casilla disponible) 
	 * Caso Especial: Si el arreglo esta lleno debe aumentarse su capacidad, agregar el nuevo dato y deben quedar multiples casillas disponibles para futuros nuevos datos.
	 * @param dato nuevo elemento
	 */
	public void agregar( T dato )
	{
		if ( tamanoAct == tamanoMax )
		{  // caso de arreglo lleno (aumentar tamaNo)
			tamanoMax = 2 * tamanoMax;
			T [ ] copia = (T[]) elementos;
			elementos = (T[]) new DinamicArray[tamanoMax];
			for ( int i = 0; i < tamanoAct; i++)
			{
				elementos[i] = copia[i];
			} 
			System.out.println("Arreglo lleno: " + tamanoAct + " - Arreglo duplicado: " + tamanoMax);
		}	
		elementos[tamanoAct] = dato;
		tamanoAct++;
	}

	/**
	 * Buscar un viaje en el arreglo.
	 * @param dato Objeto de busqueda en el arreglo
	 * @return elemento encontrado en el arreglo (si existe). null si no se encontro el dato.
	 */
	public T buscar( T dato ) 
	{
		
		return null;
	}

	/**
	 * Eliminar un viaje del arreglo.
	 * Los datos restantes deben quedar "compactos" desde la posicion 0.
	 * @param T dato de eliminacion en el arreglo
	 */
	public void eliminar( T dato ) 
	{
	}

	/**
	 * Cambia viaje en la respectiva posicion ingresada por el usuario por otro viaje
	 * @param index posicion del viaje del arreglo que sera cambiado
	 * @param  dato que reemplazara al anterior
	 */
	public void set(int index, T dato)
	{
		
	}

	/**
	 * Consulta si el arreglo esta vacio
	 * @return true o false dependiendo si el arreglo esta vacio
	 */
	public boolean isEmpty()
	{
		return false;
		
	}

	@Override
	public T buscar(String dato) {
		// TODO Auto-generated method stub
		return null;
	}

}

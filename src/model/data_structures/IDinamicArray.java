package model.data_structures;

public interface IDinamicArray<T extends Comparable <T>>{

	/**
	 * Retornar el numero de elementos maximo en el arreglo
	 * @return
	 */
	int darCapacidad( );

	/**
	 * Retornar el numero de elementos presentes en el arreglo
	 * @return
	 */
	int darTamano( );
	
	/**
	 * Retornar el elemento en la posicion i
	 * @param i posicion de consulta
	 * @return elemento de consulta. null si no hay elemento en posicion.
	 */
	T darElemento( int i );

	/**
	 * Agregar un vaje de forma compacta (en la primera casilla disponible) 
	 * Caso Especial: Si el arreglo esta lleno debe aumentarse su capacidad, agregar el nuevo dato y deben quedar multiples casillas disponibles para futuros nuevos datos.
	 * @param dato nuevo elemento
	 */
	 void agregar( T dato );
		
	/**
	 * Buscar un viaje en el arreglo.
	 * @param dato Objeto de busqueda en el arreglo
	 * @return elemento encontrado en el arreglo (si existe). null si no se encontro el dato.
	 */
	T buscar( String dato );
	
	/**
	 * Eliminar un viaje del arreglo.
	 * Los datos restantes deben quedar "compactos" desde la posicion 0.
	 * @param T dato de eliminacion en el arreglo
	 */
	void eliminar( T dato );
	
	/**
	 * Cambia viaje en la respectiva posicion ingresada por el usuario por otro viaje
	 * @param index posicion del viaje del arreglo que sera cambiado
	 * @param  dato que reemplazara al anterior
	 */
	void set(int index, T dato);
	
	/**
	 * Consulta si el arreglo esta vacio
	 * @return true o false dependiendo si el arreglo esta vacio
	 */
	boolean isEmpty();
	
	
	
	

}

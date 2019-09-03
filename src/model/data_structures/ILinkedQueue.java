package model.data_structures;

import java.util.Iterator;

public interface ILinkedQueue<Item> {
	
	public boolean isEmpty();
	
	public int size();
	
	public Item peek();
	
	public void enqueue(Item item);
	
	public Item dequeue();
	
	public String toString();
	
	abstract boolean check();
	
	public Iterator<Item> iterator();

}

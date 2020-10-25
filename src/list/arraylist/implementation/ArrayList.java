package list.arraylist.implementation;

public class ArrayList {
	private int size=0;
	private Object[] elementData = new Object[100];
	
	public boolean addFirst(int element) {
		return add(0, element);
	}
	
	public boolean addLast(Object element) {
		elementData[size] = element;
		size+=1;
		return true;
		
	}
	public boolean add(int index, int element) {
		
		for(int i=size-1;i>=index;i--) {
			elementData[i+1] = elementData[i];
		}
		elementData[index] = element;
		size++;
		
		return true;
	}
	
	public String toString() {
		String str = "[";
		for(int i =0;i<size;i++) {
			str += elementData[i];
			if(i < size-1) {
				str += ",";
			}
		}
		return str+ "]";
	}

	public Object get(int index) {
		
		return elementData[index];
	}
	public int size() {
		return size;
	}
	public int indexOf(Object o) {
		for(int i=0;i<size;i++) {
			if(o.equals(elementData[i])) {
				return i;
			}
		}
		return -1;
	}
	public ListIterator listIterator() {
		return new ListIterator();
	}
	
	class ListIterator{
		private int nextIndex=0;
		
		public boolean hasNext() {
			return nextIndex<size;
		}
		public Object next() {
			return elementData[nextIndex++];
		}
		public boolean hasPrevious() {
			return nextIndex>0;
		}
		public Object previous() {
			return elementData[--nextIndex];
		}
	}
	
}

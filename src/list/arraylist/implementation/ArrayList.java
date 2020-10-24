package list.arraylist.implementation;

public class ArrayList {
	private int size=0;
	private Object[] elementData = new Object[100];
	public boolean addLast(Object element) {
		elementData[size] = element;
		size+=1;
		return true;
		
	}
	public boolean add(int i, int j) {
		
		
		elementData[i] = j;
		
		return true;
	}
	

}

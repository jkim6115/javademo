package java017_collection;

/*
 *	선형리스트(Liner List)
 *	1. 순서리스트(Ordered List)
 *	2. 자료들 간에 순서를 갖는 리스트
 *	3. 선형 리스트에서 원소를 나열한 순서는 원소들의 순서가 된다.
 */

public class UserList {
	private Object[] sale = new Object[3];
	private int pointer = 0;

	public UserList() {

	}

	public void add(Object element) {
		if (sale.length == pointer) {
			Object[] arr = new Object[sale.length * 2];
			System.arraycopy(sale, 0, arr, 0, sale.length);
			sale = arr;
		}
		sale[pointer++] = element;
	}

	public Object get(int index) {
		if(index < pointer)
			return sale[index];
		else
			throw new ArrayIndexOutOfBoundsException(index);
	}

	public int size() { // 요소개수
		return pointer;
	}

	public Object remove(int index) {
		Object obj = sale[index];
		for (int i = index; i < pointer; i++) {
			sale[i] = sale[i + 1];
		}

		pointer--;
		return obj;
	}
}

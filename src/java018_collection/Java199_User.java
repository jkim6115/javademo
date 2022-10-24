package java018_collection;

/*
 *	1. 와일드카드<?>를 제공하는 이유
 *		: 컬렉션에 저장되는 요소들이 특정한 객체로 정해진 상태에서 다른 객체형은
 *		저장할 수 없는 상태였다. 하지만 기존과 같이 모든 객체들을 저장해야 할 곳이 있다.
 *		Vector v = new Vector();
 *		v.add(new Integer(20));
 *		v.add(new String("java"));
 *
 *	2. 와일드 카드의 구성
 *		<?> : 모든 객체자료형에 대한 배치를 의마한다.
 *		<? super 객체자료형> : 명시된 객체자료형이나 객체 자료형의 상위 객체들의 배치를 의미한다.
 *		<? extends 객체자료형> : 명시된 객체자료형이나 객체 자료형으로 부터 상속받은 하위객체들의 배치를 의미
 */

class Seoul {
	public void showyou() {
		System.out.println("Seoul");
	}
}

class Fruit extends Seoul {
	public void showyou() {
		System.out.println("Fruit");
	};
}

class Apple extends Fruit {
	@Override
	public void showyou() {
		System.out.println("Apple");
	}
}

class Orange extends Fruit {
	@Override
	public void showyou() {
		System.out.println("Orenge");
	}
}

class FruiteBox<T> {
	private T item;

	public FruiteBox() {

	}

	public void store(T item) {
		this.item = item;
	}

	public T pullout() {
		return item;
	}
}

public class Java199_User {
	public static void main(String[] args) {
		FruiteBox<Orange> fOrange = new FruiteBox<>();
		fOrange.store(new Orange());
		openAndAllBox(fOrange);
		openAndExtendsBox(fOrange);
//		openAndsuperbox(fOrange);

		FruiteBox<Seoul> fseoul = new FruiteBox<>();
		fseoul.store(new Seoul());
		openAndAllBox(fseoul);
//		openAndExtendsBox(fseoul);
		openAndsuperbox(fseoul);
	}

	public static void openAndAllBox(FruiteBox<?> param) {
		System.out.println(param.pullout());
		((Seoul) param.pullout()).showyou();
	}

	public static void openAndExtendsBox(FruiteBox<? extends Fruit> param) {
		param.pullout().showyou();
	}

	public static void openAndsuperbox(FruiteBox<? super Fruit> param) {
		((Seoul) param.pullout()).showyou();
	}
}

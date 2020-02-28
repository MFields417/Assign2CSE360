package assign1;

public class TestMain {

	public static void main(String[] args) {
		SimpleList list = new SimpleList();
//		for (int i = 0; i < 10; i++) {
//			list.add(i);
//		}
//		for (int i = 0; i < 3; i++) {
//			list.remove(i);
//		}
		list.add(1);
		list.add(2);
		System.out.println(list.search(6));
		System.out.println(list.toString());
		System.out.println(list.count());

	}

}

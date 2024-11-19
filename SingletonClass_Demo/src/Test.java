
public class Test {
	public static void main(String[] args) {
		DateUtils object1 = DateUtils.getObject();
		DateUtils object2 = DateUtils.getObject();
		DateUtils object3 = DateUtils.getObject();
//		System.out.println(object1.hashCode());
//		System.out.println(object2.hashCode());
//		System.out.println(object3.hashCode());

		if (object1.hashCode() == object2.hashCode() && object2.hashCode() == object3.hashCode()) {
			System.out.println("Three objects are pointing to the same memory location on the heap");
		} else {
			System.out.println("Three objects are not pointing to the same memory location in heap");
		}
	}
}

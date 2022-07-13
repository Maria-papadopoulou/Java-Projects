public class WalkerTest {

	public static void main(String args[]) {
		Walker walkerA = new Walker();
		Walker walkerB = new Walker();

		walkerA.walk(80, 5);
		walkerB.walk(70, 5);

		walkerA.changeDefault(20);
		walkerA.walk(70);

		walkerB.walk(75);

		System.out.println("walker A distance: " + walkerA.getDistanceCovered());
		System.out.println("walker B distance: " + walkerB.getDistanceCovered());
	}
}
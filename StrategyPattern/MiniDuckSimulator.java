public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		// now we change the behavior 
		mallard.setFlyBehavior(new FlyNoWay());
		System.out.println("My wing is broken.");
		mallard.performFly();
	}
}
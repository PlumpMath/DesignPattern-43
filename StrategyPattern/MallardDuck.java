public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWing();
	}
	public void display() {
		System.out.println("I am really a mallard Duck, who can quack and fly with my wing.");
	}
}
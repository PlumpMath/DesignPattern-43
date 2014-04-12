public abstract class Duck {
	// Favor composition over inheritance
	// program to interface not implementation
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public Duck() {
	}
	public abstract void display();
	public void performFly() {
		flyBehavior.fly();
	}
	public void performQuack() {
		quackBehavior.quack();
	}
	public void swim() {
		System.out.println("All ducks float! No matter what kinds of duck you are.");
	}
	// set the behevior at the runtime
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
}
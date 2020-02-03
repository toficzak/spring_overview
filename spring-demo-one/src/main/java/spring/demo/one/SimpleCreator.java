package spring.demo.one;

public class SimpleCreator implements Creator {

	private Publishable publicator;

	public SimpleCreator(Publishable publishable) {
		this.publicator = publishable;
	}

	@Override
	public void create() {
		System.out.println("Simple creation of presentation.");
	}

	@Override
	public void creareAndPublish() {
		System.out.println(publicator.publish());
	}

	@Override
	public void info() {
	}

}

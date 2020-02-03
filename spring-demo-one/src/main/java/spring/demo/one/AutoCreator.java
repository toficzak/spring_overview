package spring.demo.one;

public class AutoCreator implements Creator {
	private Publishable publicator;

	public AutoCreator(Publishable publishable) {
		this.publicator = publishable;
	}

	@Override
	public void create() {
		System.out.println("Auto-creation of presentation.");
	}

	@Override
	public void creareAndPublish() {
		System.out.println(this.publicator.publish());
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
	}

}

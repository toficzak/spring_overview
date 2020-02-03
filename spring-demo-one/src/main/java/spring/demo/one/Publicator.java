package spring.demo.one;

public class Publicator implements Publishable {

	@Override
	public String publish() {
		return "Presentation published.";
	}

}

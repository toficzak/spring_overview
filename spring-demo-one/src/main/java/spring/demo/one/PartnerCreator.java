package spring.demo.one;

public class PartnerCreator implements Creator {

	private Publishable publicator;
	private String partnerName;
	private String secretKey;

	public PartnerCreator() {
		System.out.println("PartnerCreator: inside constructor");
		System.out.println(this.partnerName + " " + this.secretKey);
	}

	@Override
	public void create() {
		System.out.println("Partner creation of presentation.");
	}

	@Override
	public void creareAndPublish() {
		System.out.println(publicator.publish());
	}

	public void setPublicator(Publishable publicator) {
		this.publicator = publicator;
		System.out.println("PartnerCreator: inside setter");
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
		System.out.println("PartnerCreator: inside name setter");
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
		System.out.println("PartnerCreator: inside key setter");
	}

	@Override
	public void info() {
		System.out.println(this.partnerName + " " + this.secretKey);
	}

	private void init() {
		System.out.println("init method!");
	}

	private void destroy() {
		System.out.println("destroy method!");
	}

}

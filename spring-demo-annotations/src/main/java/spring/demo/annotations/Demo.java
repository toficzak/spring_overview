package spring.demo.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			Presentation autoPresentation = context.getBean("autoPresentation", Presentation.class);
			autoPresentation.publish();
			autoPresentation.edit();

			NiftyPresentation niftyPresentation = context.getBean("niftyPresentation", NiftyPresentation.class);
			niftyPresentation.publish();
			niftyPresentation.edit();
			niftyPresentation.showName();

			Presentation simplePresentation = context.getBean("simplePresentation", Presentation.class);
			simplePresentation.publish();
			simplePresentation.edit();
		}

	}
}

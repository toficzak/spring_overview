package spring.demo.one;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			Creator bean = context.getBean("creator", Creator.class);
			bean.create();
			bean.creareAndPublish();

			Creator bean2 = context.getBean("partnerCreator", Creator.class);
			bean2.create();
			bean2.creareAndPublish();
			bean2.info();

			Creator bean3 = context.getBean("partnerCreatorFromPropertyFile", Creator.class);
			bean3.create();
			bean3.creareAndPublish();
			bean3.info();
		}
	}
}

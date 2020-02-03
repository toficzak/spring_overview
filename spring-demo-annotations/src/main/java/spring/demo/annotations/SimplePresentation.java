package spring.demo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("simplePresentation")
public class SimplePresentation implements Presentation {

	@Autowired
	@Qualifier("easyEditor")
	private Editor editor;

	@Override
	public void publish() {
		System.out.println("Published simple presentation.");
	}

	@Override
	public void edit() {
		editor.edit();
	}

}

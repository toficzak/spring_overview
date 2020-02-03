package spring.demo.annotations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AutoPresentation implements Presentation {

	private Editor editor;

	public AutoPresentation(@Qualifier("oldEditor") Editor editor) {
		super();
		this.editor = editor;
	}

	@Override
	public void publish() {
		System.out.println("Published auto-presentation.");
	}

	@Override
	public void edit() {
		this.editor.edit();
	}

}

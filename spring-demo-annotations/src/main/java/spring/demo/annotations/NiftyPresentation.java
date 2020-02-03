package spring.demo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NiftyPresentation implements Presentation {

	private Editor editor;

	@Value("${presentation.name}")
	private String name;

	@Override
	public void publish() {
		System.out.println("Published nifty presentation.");
	}

	@Override
	public void edit() {
		editor.edit();
	}

	@Autowired
	@Qualifier("oldEditor")
	public void setEditor(Editor editor) {
		this.editor = editor;
	}

	public void showName() {
		System.out.println(name);
	}

}

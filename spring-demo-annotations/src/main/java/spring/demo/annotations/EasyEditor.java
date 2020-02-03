package spring.demo.annotations;

import org.springframework.stereotype.Component;

@Component
public class EasyEditor implements Editor {

	@Override
	public void edit() {
		System.out.println("Edited by Easy Editor.");
	}

}

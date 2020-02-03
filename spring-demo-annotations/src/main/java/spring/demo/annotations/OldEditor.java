package spring.demo.annotations;

import org.springframework.stereotype.Component;

@Component
public class OldEditor implements Editor {

	@Override
	public void edit() {
		System.out.println("Edited by old editor.");
	}

}

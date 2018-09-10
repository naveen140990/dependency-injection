package com.naveen.examples.di.injector;


import com.naveen.examples.di.person.PersonImpl;
import com.naveen.examples.di.service.PenWritingService;

/**
 * @author naveen on 10/9/18
 */
public class PenWritingServiceInjector implements WritingServiceInjector {

	@Override
	public PersonImpl getPerson() {
		PersonImpl person = new PersonImpl();
		//setter based dependency injection
		person.setWritingService(new PenWritingService());
		return person;
	}

}

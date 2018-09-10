package com.naveen.examples.di.injector;


import com.naveen.examples.di.person.PersonImpl;
import com.naveen.examples.di.service.ComputerWritingService;
import com.naveen.examples.di.service.PenWritingService;

/**
 * @author naveen on 10/9/18
 */
public class ComputerWritingServiceInjector implements WritingServiceInjector {

	@Override
	public PersonImpl getPerson() {
		//constructor based dependency injection
		PersonImpl person = new PersonImpl(new ComputerWritingService());
		return person;
	}

}

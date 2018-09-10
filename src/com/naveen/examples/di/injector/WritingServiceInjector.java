package com.naveen.examples.di.injector;


import com.naveen.examples.di.person.PersonImpl;

/**
 * @author naveen on 10/9/18
 */
public interface WritingServiceInjector {

    public PersonImpl getPerson();
}

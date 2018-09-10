package com.naveen.examples.di;

import com.naveen.examples.di.injector.PenWritingServiceInjector;
import com.naveen.examples.di.injector.WritingServiceInjector;

import com.naveen.examples.di.person.PersonImpl;

/**
 * @author naveen on 10/9/18
 */
public class Main {

    public static void main(String[] args) {
        WritingServiceInjector injector = null;
        injector = new PenWritingServiceInjector();
        final PersonImpl person = injector.getPerson();

        person.writeToFriend();
    }
}

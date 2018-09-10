
package com.naveen.examples.di.service;
/**
 * @author naveen on 10/9/18
 */
public class PenWritingService implements WritingService {

  public void write(String message) {
    System.out.printf("Pen: %s%n ", message);
  }
}


package com.naveen.examples.naive;

public class Person {
  private final PenWriting penWriting = new PenWriting();

  public void writeToFriend() {
    penWriting.write("Hello my friend :)");
  }
}

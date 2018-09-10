
package com.naveen.examples.di.person;


import com.naveen.examples.di.service.WritingService;

public class PersonImpl implements Person{

  WritingService writingService;

  public PersonImpl() {
  }

  public PersonImpl(WritingService writingService) {
    this.writingService = writingService;
  }

  public WritingService getWritingService() {
    return writingService;
  }

  public void setWritingService(WritingService writingService) {
    this.writingService = writingService;
  }

  @Override
  public void writeToFriend() {
    writingService.write("Hello my friend :)");
  }
}

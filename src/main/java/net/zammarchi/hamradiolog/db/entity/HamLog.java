package net.zammarchi.hamradiolog.db.entity;

import org.springframework.data.annotation.Id;


public class HamLog {

  @Id
  public String id;

  public String firstName;
  public String lastName;

  public HamLog() {}

  public HamLog(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return String.format(
        "Customer[id=%s, firstName='%s', lastName='%s']",
        id, firstName, lastName);
  }

}
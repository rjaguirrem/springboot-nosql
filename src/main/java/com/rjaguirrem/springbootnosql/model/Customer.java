package com.rjaguirrem.springbootnosql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "customer")
public class Customer {
  @Transient
  public static final String SEQUENCE_NAME = "user_sequence";

  @Id
  private Integer id;
  private String name;
  private String phone;
  private String address;
  private String birthday;
  private String date;
}

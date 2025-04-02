package vn.com.leaseLink.entity;

import lombok.*;

import java.io.Serializable;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Person implements Serializable {
    protected String id;
    protected String name;
    protected String phone;

}

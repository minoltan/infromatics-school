package io.informatics.school.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Minoltan Issack on 07/09/2022
 */

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String msisdn;
    private String firstName;
    private String lastName;
    private String email;

    // Todo: Handle class room relationship


}

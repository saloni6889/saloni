package com.student.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.*;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class StudentData {

    @Id
    private int id;
    
    private String name;
    private String email;
    private String password;

    @ElementCollection
    private List<String> address;
    @ElementCollection
    private Set<Long> contact;

    @ElementCollection
    @MapKeyColumn(name = "acc_no")
    @Column(name = "acc_holder_name")
    private Map<Long, String> bankAccount = new HashMap<>();

    @Temporal(TemporalType.DATE)
    private Date dateOfRegi;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rayner;

/**
 *
 * @author Rayner
 */


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Rayner
 */
@Entity
@Table(schema = "TM_TEMP", name = "PERSON")
public class Person {
 
    @Id
    @GeneratedValue
    private Long id;
 
    @Column(name="FIRSTNAME")
    private String firstName;

    @Column(name="LASTNAME")
    private String lastName;
 
    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "person")
    private Set<BlogPost> blogPosts = new HashSet<>(0);
 
    // getters and setters
 
}


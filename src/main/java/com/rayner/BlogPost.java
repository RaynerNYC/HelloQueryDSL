/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rayner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Rayner
 */
@Entity
@Table(schema = "TM_TEMP", name = "BLOGPOST")
public class BlogPost {
 
    @Id
    @GeneratedValue
    private Long id;
 
    @Column(name="TITLE")
    private String title;
 
    @Column(name="BODY")
    private String body;
 
    @ManyToOne
    private Person person;
 
    // getters and setters
 
}

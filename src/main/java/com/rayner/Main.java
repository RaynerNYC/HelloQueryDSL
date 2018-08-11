/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rayner;

import com.querydsl.jpa.impl.JPAQueryFactory;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Rayner
 */
public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello QueryDSL");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myOracleDB");
        EntityManager em = emf.createEntityManager();
        JPAQueryFactory queryFactory = new JPAQueryFactory(em);
        
//        QPerson person = QPerson.person;
//        Person c = queryFactory.selectFrom(person)
//                .where(person.lastName.eq("Ali"))
//                .fetchOne();

//        QUser user = QUser.user;
//        User c = queryFactory.selectFrom(user)
//                .where(user.login.eq("David"))
//                .fetchOne();
        
    }
    
}

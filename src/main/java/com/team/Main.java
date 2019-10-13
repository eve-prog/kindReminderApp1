package com.team;

import com.team.model.Event;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        Event event = new Event(1, "party", "Epic Saturday", null);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("kindReminderApp");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        System.out.println("Connected succesfully");
    }
}

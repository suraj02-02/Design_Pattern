package observer_Design;

import observer_Design.observer.Mentees;
import observer_Design.subject.Mentor;

/**
 * This ia a demonstration of <code>Observer Design Pattern</code>
 */

public class Client {

    public static void main(String[] args) {

        /**
         *  The Observer Design Pattern is a behavioral design pattern that allows you to define a subscription mechanism to notify multiple observers when a particular state  of subject changes.
         *  It established a one-to-many relationship between the subject and the observers.
         *  This pattern is particularly useful for implementing distributed event handling systems, where multiple components need to react to changes in another component without being tightly coupled.
         *
         *   Components Involved :
         *     1. Subject : @see {@link observer_Design.subject.Mentor}
         *     2. Observer : @see {@link observer_Design.observer.IMentee}
         *     3. Concrete Observer : @see {@link observer_Design.observer.Mentees}
         *
         *   Use cases :
         *      1. Event handling system
         *      2. Real time monitoring system
         *      3. Real time notification system
         *      4. Social Media updates
         *
         *    Note : Often time Observer pattern is confused with publish subscribe pattern. Although they  are similar , they are not the same.
         *     1.Observer design pattern is object oriented design pattern while publish subscribe pattern is network oriented.
         *     2. In observer design pattern both the subject and the observer are in the same namespace whereas in publish subscribe pattern they are in different namespaces.
         *
         *    Problem Statement :  We have an online education platform where mentor can post a session on a topic and student should receive a notification about the session.
         *    Solution :  Here we will be using <code>Observer Pattern</code>
         *
         */

        // subject
        Mentor mentor = new Mentor();

        // observers
        Mentees mentees = new Mentees("Suraj");
        Mentees mentees1 = new Mentees("Shubham");
        Mentees mentees2 = new Mentees("Divyanshu");

        // attach observers
        mentor.attach(mentees);
        mentor.attach(mentees1);
        mentor.attach(mentees2);

        final String sessionDetails1 = "Session on Multithreading with Java on 10th of July By Krishna";
        // mentor posting for new session
        mentor.postSession(sessionDetails1);

        // detach observers
        mentor.detach(mentees1);

        final String sessionDetails2 = "Session on pandas with python on 11th of July By Krishna";
        // mentor posting for new session
        mentor.postSession(sessionDetails2);

    }

}

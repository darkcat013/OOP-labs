package lab6.hospital;

import lab6.Person;

import java.util.Date;

public class Patient extends Person
{
    String id;
    int age;
    Date accepted;
    String[] sickness;
    String[] prescriptions;
    String[] allergies;
    String[] specialReqs;
}

package service;

import dominio.Person;

import java.util.Objects;

public class PersonService {
    public boolean isAdult(Person person){
    Objects.requireNonNull(person,"Person can't be null");
       return person.getAge() >= 21;
    }
}

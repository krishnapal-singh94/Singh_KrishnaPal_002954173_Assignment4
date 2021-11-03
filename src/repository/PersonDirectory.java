/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
import model.Person;

/**
 *
 * @author kpsingh
 */
public class PersonDirectory {
//    private static ArrayList<Person> personRepo;
//    public PersonDirectory() {
//        this.personRepo = new ArrayList<Person>();
//    }
//    
//    public void saveData(Person person){
//        personRepo.add(person);
//    }
//    
//    public Person getData(){
//        return personRepo.get(0);
//    }
    private ArrayList<Person> personRepo;
    public PersonDirectory() {
        this.personRepo = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonDirectory() {
        return personRepo;
    }

    public void setPersonDirectory(ArrayList<Person> personRepo) {
        this.personRepo.addAll(personRepo);
    }
    
    public Person addPersonToPersonRepo(Person person){
        personRepo.add(person);
        return person;
    }
}

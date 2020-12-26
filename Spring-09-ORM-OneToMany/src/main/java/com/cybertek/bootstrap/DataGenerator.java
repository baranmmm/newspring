package com.cybertek.bootstrap;

import com.cybertek.entity.Address;
import com.cybertek.entity.Person;
import com.cybertek.repository.AddressRepository;
import com.cybertek.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataGenerator implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void run(String... args) throws Exception {

        Person person1=new Person("Mehmet", "Baran");
        Person person2=new Person("Sati", "Baran");
        Person person3=new Person("Sedat Emre", "Baran");
        Person person4=new Person("Selcen Azra", "Baran");
        Person person5=new Person("Fatma", "Baran");

        Address address1=new Address("Normanton Road", "DE1 2GR");
        Address address2=new Address("Hartington Street", "DE2 2GS");
        Address address3=new Address("London Road", "DE1 2SQ");
        Address address4=new Address("Burton Road", "DE2 5GD");
        Address address5=new Address("Pear Tree Road", "DA3 5AR");

        personRepository.save(person1);

        address1.setPerson(person1);
        address2.setPerson(person1);
        addressRepository.save(address1);
        addressRepository.save(address2);


        personRepository.save(person2);

        address3.setPerson(person2);
        address4.setPerson(person2);

        addressRepository.save(address3);
        addressRepository.save(address4);

    }
}

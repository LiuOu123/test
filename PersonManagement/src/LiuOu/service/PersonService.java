package LiuOu.service;

import java.util.List;

import LiuOu.entity.Person;

public interface PersonService {
	List<Person> chaPerson();
	int add(Person p);
	int del(int id);
}

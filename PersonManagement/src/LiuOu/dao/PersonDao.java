package LiuOu.dao;

import java.util.List;

import LiuOu.entity.Person;

public interface PersonDao {
List<Person> chaPerson();
int add(Person p);
int del(int id);
}

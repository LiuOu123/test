package LiuOu.service.impl;

import java.util.List;

import LiuOu.dao.impl.PersonDaoImpl;
import LiuOu.entity.Person;
import LiuOu.service.PersonService;

public class PersonServiceImpl implements PersonService{
PersonDaoImpl pdi=new PersonDaoImpl();
	@Override
	public List<Person> chaPerson() {
		// TODO Auto-generated method stub
		return pdi.chaPerson();
	}
	@Override
	public int add(Person p) {
		// TODO Auto-generated method stub
		return pdi.add(p);
	}
	@Override
	public int del(int id) {
		// TODO Auto-generated method stub
		return pdi.del(id);
	}
	
}

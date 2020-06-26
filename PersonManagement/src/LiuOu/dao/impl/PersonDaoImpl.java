package LiuOu.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;

import LiuOu.dao.BaseDao;
import LiuOu.dao.PersonDao;
import LiuOu.entity.Person;

public class PersonDaoImpl implements PersonDao{
QueryRunner qr=new QueryRunner(BaseDao.getDs());
	@Override
	public List<Person> chaPerson() {
		try {
			String sql="select * from person order by id desc";
			return qr.query(sql, new BeanListHandler<>(Person.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	@Test
	public void Test01() {
		System.out.println(chaPerson().size());
	}

	@Override
	public int add(Person p) {
		try {
			String sql="insert into person values(null,?,?,?,?,?)";
			return qr.update(sql,p.getName(),p.getSex(),p.getAge(),p.getRank(),p.getDepartment());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int del(int id) {
		try {
			String sql="delete from person where id=?";
			return qr.update(sql,id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}

}

package LiuOu.entity;

public class Person {
private int id;
private String name;
private String sex;
private int age;
private String rank;
private String department;
public Person() {

}
public Person(String name, String sex, int age, String rank, String department) {
	this.name = name;
	this.sex = sex;
	this.age = age;
	this.rank = rank;
	this.department = department;
}
public Person(int id, String name, String sex, int age, String rank, String department) {
	this.id = id;
	this.name = name;
	this.sex = sex;
	this.age = age;
	this.rank = rank;
	this.department = department;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getRank() {
	return rank;
}
public void setRank(String rank) {
	this.rank = rank;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}

}

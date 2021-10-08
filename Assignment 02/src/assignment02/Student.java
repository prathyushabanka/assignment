package assignment02;

public class Student {
private int rollno;
private String name;
private String stream;
Student next;
Student prev;
public Student(int rollno, String name, String stream) {
	super();
	this.rollno = rollno;
	this.name = name;
	this.stream = stream;
	next  = null;
	prev = null;
}
public Student()
{
}

public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStream() {
	return stream;
}
public void setStream(String stream) {
	this.stream = stream;
}
public Student getNext() {
	return next;
}
public void setNext(Student next) {
	this.next = next;
}
@Override
public String toString() {
	   return "Student [rollno=" + rollno + ", name=" + name + ", stream=" + stream + "]";
	
}

}

package idh.java;

import java.util.Iterator;

public class Course implements Iterable<Student> {
    Student[] members;

    int nextPosition = 0;
    String name;

    public Course(String name, int numberOfStudents) {
	this.members = new Student[numberOfStudents];
	this.name = name;
    }

    public void addMember(String name) throws Exception {
	if (nextPosition < members.length)
	    members[nextPosition++] = new Student(name);
	else
	    throw new Exception("Class full");
    }

    public int size() {
	return members.length;
    }

    public Student getMember(int member) {
	return members[member];
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getDescription() {
	StringBuilder buf = new StringBuilder();
	buf.append(this.getName()).append('\n');
	for (int i = 0; i < this.name.length(); i++) {
	    buf.append('-');
	}
	buf.append('\n');
	buf.append("Students: ");
	buf.append(members);
	buf.append('\n');
	return buf.toString();
    }

    public static void main(String[] args) throws Exception {
	Course java2 = new Course("Fortgeschrittene Programmierung (Java 2)", 5);
	java2.addMember("Liraz Lucinde");
	java2.addMember("Floro Mehrnaz");
	java2.addMember("Emmanuelle Dinesh");
	java2.addMember("Reshma Vera");
	java2.addMember("Isaac Sumire");
	System.out.println(java2.getDescription());

	StudentIterator iter = new StudentIterator(java2);

	while (iter.hasNext()) {
	    System.out.println(iter.next().getName());
	}
	System.out.println();

	iter = new StudentIterator(java2);
	while (iter.hasNext()) {
	    System.out.println(iter.next().getName());
	}
	System.out.println();

	for (Student student : java2) {
	    System.out.println(student.getName());

	    for (Student student2 : java2) {
		System.out.println(student2.getName());
	    }

	}

    }

    @Override
    public Iterator<Student> iterator() {
	return new StudentIterator(this);
    }
}

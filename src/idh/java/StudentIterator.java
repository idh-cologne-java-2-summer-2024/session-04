package idh.java;

import java.util.Iterator;

public class StudentIterator implements Iterator<Student> {

    Course course;
    int currentPosition = -1; // i

    public StudentIterator(Course course) {
	this.course = course;
    }

    @Override
    public boolean hasNext() {
	return currentPosition < course.size() - 1;
    }

    @Override
    public Student next() {
	currentPosition++;
	return course.getMember(currentPosition);
    }

}

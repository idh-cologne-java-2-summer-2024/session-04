package idh.java;

public class Main {

    public static void main(String[] args) throws Exception {
	Course course = new Course("Java 2", 3);
	course.addMember("Maria");
	course.addMember("Hans");
	course.addMember("Emil");

	StudentIterator iter = new StudentIterator(course);
	while (iter.hasNext()) {
	    System.out.println(iter.next());
	}
    }

}

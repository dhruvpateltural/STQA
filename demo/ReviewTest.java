package demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReviewTest {
	 	@Test
	    @Parameters({"marks1", "marks2"})
	    public void testShortlisting(double marks1, double marks2) {
	        double average = (marks1 + marks2) / 2.0;
	        System.out.println("Average marks awarded: " + average);

	        if (average > 4) {
	            System.out.println("Writer is shortlisted.");
	        } else {
	            System.out.println("Writer is not shortlisted.");
	        }
	    }
}

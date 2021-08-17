package de.janreuteringimp2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestStart {
	public static void main(String []arhs) {
		 Result result = JUnitCore.runClasses(CaesarTest.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result.wasSuccessful());
	      result = JUnitCore.runClasses(DatenspeicherTest.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result.wasSuccessful());
	      result = JUnitCore.runClasses(ErgebnisTest.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result.wasSuccessful());
	      result = JUnitCore.runClasses(ErgebnislisteTest.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println(result.wasSuccessful());
	}
}

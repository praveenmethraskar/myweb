package in.javahome.myweb.controller;

import junit.framework.Assert;
import junit.framework.TestCase;
import java.util.*;

public class CalculatorTest extends TestCase {
	Calculator cal = new Calculator();
	public void testAdd(){
		Assert.assertEquals(cal.add(10, 20), 30);
	}
	public void testMultiply(){
		Assert.assertEquals(cal.multiply(10, 20), 200);
	}
	public static void main( String[] args )
	{
	List<String> stringList = new ArrayList<String>();
	}
}

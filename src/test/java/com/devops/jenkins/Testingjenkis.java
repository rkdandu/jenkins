package com.devops.jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testingjenkis {

	@Test
	public void test() {
		App.sayHello();
		int num =App.sayNumber(3);
		System.out.println(num);
		System.out.println("just adding line chumma");
	}

}

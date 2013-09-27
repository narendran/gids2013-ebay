package com.naren.projects.gids;

import java.util.ArrayList;
import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class DemoTest {
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void testIndexOutOfBoundsException(){
		
		List<String> names = new ArrayList<String>();
		//String name1 = names.get(2);
		names.add("Narendran");
//		What I want to check
		exception.expect(IndexOutOfBoundsException.class);
		String name = names.get(0);
		
			
		
	}

}

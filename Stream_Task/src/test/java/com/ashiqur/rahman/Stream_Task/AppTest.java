package com.ashiqur.rahman.Stream_Task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import com.ashiqur.rahman.Stream_Task.App;;

public class AppTest {

	@Test
	public void test() {
		
		App a  = new App();
		
		//Object empList;
		int actual = a.streamTest();
		
        assertEquals(160000, actual);
	}
	
}

package com.algo.performa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.algo.performa.easy.ReverseAnArrayGeneral;

class ArrayUtilsTest {

	@Test
	  public void testReverse_emptyArray() {
	    int[] array = {};
	    ReverseAnArrayGeneral.reverse(array);
	    assertArrayEquals(new int[] {}, array);
	    
	  }
	
	@Test
	public void testReverse_oneElementArray() {
		int[] array= {1};
		 ReverseAnArrayGeneral.reverse(array);
		assertArrayEquals(new int[] {1}, array);
		
	}

	@Test
	public void testReverse_oddLengthArray() {
		int[] array= {1,2,3};
		 ReverseAnArrayGeneral.reverse(array);
		 assertArrayEquals(new int[] {3,2,1}, array);
		
	}
	
	@Test
	public void testReverse_evenLengthArray() {
		int[] array= {1,2,3,4};
		 ReverseAnArrayGeneral.reverse(array);
		 assertArrayEquals(new int[] {4,3,2,1}, array);
		
	}
}

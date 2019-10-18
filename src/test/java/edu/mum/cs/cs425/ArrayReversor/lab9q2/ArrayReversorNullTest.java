package edu.mum.cs.cs425.ArrayReversor.lab9q2;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.mum.cs.cs425.ArrayReversor.lab9q2.service.ArrayFlattenerService;

public class ArrayReversorNullTest {
	   private ArrayReversor arrayReversor;

	    private ArrayFlattenerService arrayFlattenerService = mock(ArrayFlattenerService.class);

	    @Before
	    public void setUp() throws Exception {
	        this.arrayReversor = new ArrayReversor(arrayFlattenerService);
	    }

	    @After
	    public void tearDown() throws Exception {
	        this.arrayReversor = null;
	    }

	    @Test
	    public void testReverseArrayNull() {
	    	
	        Integer[][] inputArray = null;
	        
	        when(arrayFlattenerService.flattenArray(inputArray)).thenReturn(null);
	        
	        Integer[] actual = arrayReversor.reverseArray(inputArray);
	        Integer[] expected = null;
	        assertArrayEquals(expected, actual);
	        verify(arrayFlattenerService).flattenArray(inputArray);
	    }
}

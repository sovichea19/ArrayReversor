package edu.mum.cs.cs425.ArrayReversor.lab9q2;

import static org.junit.Assert.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.mum.cs.cs425.ArrayReversor.lab9q2.service.ArrayFlattenerService;

public class ArrayReversorTest {
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
    public void testReverseArray() {
    	
        Integer[][] inputArray = new Integer[][]{{1,3}, {0}, {4,5,9}};
        
        when(arrayFlattenerService.flattenArray(inputArray)).thenReturn(new Integer[]{1,3,0,4,5,9});
        
        Integer[] actual = arrayReversor.reverseArray(inputArray);
        Integer[] expected = new Integer[]{9,5,4,0,3,1};
        assertArrayEquals(expected, actual);
        verify(arrayFlattenerService).flattenArray(inputArray);
    }
}

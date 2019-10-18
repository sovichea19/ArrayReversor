package edu.mum.cs.cs425.ArrayReversor.lab9q2;

import edu.mum.cs.cs425.ArrayReversor.lab9q2.service.ArrayFlattenerService;

public class ArrayReversor {
    private ArrayFlattenerService arrayFlattenerService;

    public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
        this.arrayFlattenerService = arrayFlattenerService;
    }

    public Integer[] reverseArray(Integer[][] inputArray) {
        Integer[] flattenArray = arrayFlattenerService.flattenArray(inputArray);

        if(flattenArray == null)
            return null;
        int i = 0;
        int j = flattenArray.length - 1;
        
        while(i < j) {
            int temp = flattenArray[i];
            flattenArray[i] = flattenArray[j];
            flattenArray[j] = temp;
            i++;
            j--;
        }
        return flattenArray;
    }
}

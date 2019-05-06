/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea11;

/**
 *
 * @author Hugo
 */
public class ordenamientos 
{
   
    public  void quickSort(int[] arreglo, int abajo, int arriba) {
        
		if (arreglo == null || arreglo.length == 0)
                    
			return;
 
		if (abajo >= arriba)
			return;
 
		
		int middle = abajo + (arriba - abajo) / 2;
		int pivote = arreglo[middle];
                
		
		int i = abajo, j = arriba;
		while (i <= j) {
			while (arreglo[i] < pivote) {
				i++;
			}
 
			while (arreglo[j] > pivote) {
				j--;
			}
 
			if (i <= j) {
				int temp = arreglo[i];
				arreglo[i] = arreglo[j];
				arreglo[j] = temp;
				i++;
				j--;
			}
		}
 
		
		if (abajo < j)
			quickSort(arreglo, abajo, j);
 
		if (arriba > i)
			quickSort(arreglo, i, arriba);
               
                
	}
    
    
    /////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////
    
    public void mergeSort(int[] arreglodentrada) 
    {
        int tamano = arreglodentrada.length;
        if (tamano < 2)
            return;
        int mid = tamano / 2;
        int leftSize = mid;
        int rightSize = tamano - mid;
        int[] left = new int[leftSize];
        int[] right = new int[rightSize];
        for (int i = 0; i < mid; i++) {
            left[i] = arreglodentrada[i];

        }
        for (int i = mid; i < tamano; i++) {
            right[i - mid] = arreglodentrada[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, arreglodentrada);
    }

    public void merge(int[] left, int[] right, int[] arr) 
    {
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
                k++;
            } else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }
        while (i < leftSize) {
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < leftSize) {
            arr[k] = right[j];
            k++;
            j++;
        }
    }
}

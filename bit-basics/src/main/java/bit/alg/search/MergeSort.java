package bit.alg.search;

/**
 * 
 * @author phanidhar
 * Merge sort is one of the good algorithm,its running time is [n(lgn)], this is faster than selection sort and insertion sort.
 * This is a classical exmaple of dividing the task and performing the task , adding those task results [which is divide and conquer ]
 */
public class MergeSort {
	public void sort(int[] a){
		int[] aux = new int[a.length];
		sort(a,aux,0,a.length-1);
	}
	
	public void sort(int[]a,int[] aux,int low, int high){
		if(high<=low)return;
		int mid  = low+((high-low)/2);
		sort(a,aux,low,mid);
		sort(a,aux,mid+1,high);
		merge(a,aux,low,mid,high);
	}
	
	/**
	 * 
	 * @param a
	 * @param aux
	 * @param low
	 * @param mid
	 * @param high
	 * carefully look this logic
	 *TODO explanation
	 */
	public void merge(int[]a,int[]aux,int low, int mid, int high){
		for(int k=low;k<=high;k++){
			aux[k] = a[k];
		}
		int i = low; int  j = mid+1;
		for(int k=low;k<=high;k++){
			if(i>mid){a[k]=aux[j++];}
			else if(j>high){a[k] = aux[i++];}
			else if(less(aux[j],aux[i])){a[k]=aux[j++];}
			else{a[k]=aux[i++];}
		}
		
	}
	
	public static void printArray(int[] a){
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	public boolean less(int p, int q){
		return p<q;
	}
	public static void main(String[] args) {
		MergeSort msort = new MergeSort();
		int[]a = new int[]{2,3,7,15,17,18,13,4,0,8,14,1,5,10,19,16,6,11,9,12};
		printArray(a);
		msort.sort(a);
		printArray(a);
	}
}

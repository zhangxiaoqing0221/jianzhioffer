
public class QuickSort {
	public int partition(int[] array,int i, int j) {
		int pivot = array[i];
		while(i<j) {
			while(i<j&&array[j]>=pivot) j--;
			if(i<j) array[i++] = array[j];
			while(i<j&&array[i]<=pivot) i++;
			if(i<j) array[j--] = array[i];
		}
		array[i] = pivot;
		return i;
	}
	
	public void sort(int[] array,int i,int j) {
		int part = 0;
		if(i<j) {
			part = partition(array,i,j);
			sort(array,i,part-1);
			sort(array,part+1,j);
		}
		
	}

	public static void main(String[] args) {
		int[] array = new int[] {1,3,5,7,2,4,6,8};
		QuickSort is = new QuickSort();
		is.sort(array,0,array.length-1);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}

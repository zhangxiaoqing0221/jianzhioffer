
public class BubbleSort {
	public void sort(int[] array) {
		int i,j;
		int n = array.length;
		for(i=0;i<n;i++) {
			for(j=n-1;j>i;j--) {
				if(array[j]<array[j-1]) {
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] array = new int[] {1,3,5,7,2,4,6,8};
		BubbleSort is = new BubbleSort();
		is.sort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

}

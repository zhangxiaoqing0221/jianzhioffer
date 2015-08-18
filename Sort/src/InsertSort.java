
public class InsertSort {
	
	public void sort(int[] array) {
		for(int i=0;i<array.length;i++) {
			int temp = array[i];
			int j=i-1;
			for(;j>=0;j--) {
				if(temp<array[j]) {
					array[j+1] = array[j];
				}else {
					break;
				}
			}
			array[j+1] = temp;
		}
		
	}

	public static void main(String[] args) {
		int[] array = new int[] {1,3,5,7,2,4,6,8};
		InsertSort is = new InsertSort();
		is.sort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}

	}

}

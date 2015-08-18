
public class SelectSort {
	
	public void sort(int[] array) {
		int i,j,temp,flag;
		for(i=0;i<array.length;i++) {
			temp = array[i];
			flag = i;
			for(j=i+1;j<array.length;j++) {
				if(temp>array[j]) {
					temp = array[j];
					flag = j;
				}
			}
			if(flag!=i) {
				array[flag] = array[i];
				array[i] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] array = new int[] {1,3,5,7,2,4,6,8};
		SelectSort is = new SelectSort();
		is.sort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}

	}

}

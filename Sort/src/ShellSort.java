
public class ShellSort {

	public void shellInsert(int[] array,int dk) {
		for(int i=dk+1;i<array.length;i++) {
			int temp = array[i];
			int j=i-dk;
			for(;j>=0;j-=dk) {
				if(temp<array[j]) {
					array[j+dk] = array[j];
				}else {
					break;
				}
			}
			array[j+dk] = temp;
		}
		
	}
	
	public void sort(int array[],int[] dks) {
		for(int i =0;i<dks.length;i++) {
			shellInsert(array,dks[i]);
		}
	}
	
	public static void main(String[] args) {
		ShellSort ss = new ShellSort();
		int[] array = new int[] {1,3,5,7,2,4,6,8};
		int[] dks = new int[] {5,3,1};
		ss.sort(array, dks);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}

	}

}

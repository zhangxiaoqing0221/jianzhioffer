
public class HeapSort {
	public void HeapAdjust(int[] array,int start,int end) {
		int temp = array[start];
		for(int i=start*2+1;i<=end;i*=2) {
			if(i<end&&array[i]<array[i+1]) ++i;
			if(array[i]< temp) break;
			array[start] = array[i];
			start = i;
		}
		array[start] = temp;
	}
	
	public void sort(int[] array) {
		//初始建堆
		for(int i=array.length/2;i>=0;i--) {
			HeapAdjust(array,i,array.length-1);
		}
		
		for(int i = array.length-1;i>0;i--) {
			//交换array[0]和array[i]
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			HeapAdjust(array,0,i-1);//从0到i-1进行调整
		}

		
	}

	public static void main(String[] args) {
		int[] array = new int[] {1,3,5,7,2,4,6,8};
		HeapSort hs = new HeapSort();
		hs.sort(array);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		

	}

}

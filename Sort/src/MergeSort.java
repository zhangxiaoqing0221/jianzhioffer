
public class MergeSort {
	
	void merge(int[] array,int p,int q, int r) {
		int i,j,k,n1,n2;
		n1 = q-p+1;
		n2 = r-q;
		int[] L = new int[n1];
		int[] R = new int[n2];
		for(i=0,k=p;i<n1;i++,k++) L[i] = array[k];
		for(i=0,k=q+1;i<n2;i++,k++) R[i] = array[k];
		for(k=p,i=0,j=0;i<n1&&j<n2;k++) {
			if(L[i]<R[j]) {
				array[k] = L[i];
				++i;
			}else {
				array[k] = R[j];
				++j;
			}
		}
		
		if(i<n1) {
			for(j=i;j<n1;j++,k++) array[k] = L[j];
		}
		
		if(j<n2) {
			for(i=j;i<n2;i++,k++) array[k] = R[i];
		}
	}
	
	public void sort(int[] array,int p ,int r) {
		if(p<r) {
			int q = (p+r)/2;
			sort(array,p,q);
			sort(array,q+1,r);
			merge(array,p,q,r);
		}
	}

	public static void main(String[] args) {
		int[] array = new int[] {1,3,5,7,2,4,6,8};
		MergeSort is = new MergeSort();
		is.sort(array,0,array.length-1);
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}

	}

}

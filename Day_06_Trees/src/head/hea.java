/**
* @Developer : Sagar_Pokale
* 06-Nov-2022 10:24:16 AM
**/

package head;
public class hea {
	public static void printArray(int[] arr) {
		for (int i = 1; i < arr.length; i++)
			System.out.print(arr[i] + ", ");
		System.out.println();
	}
	public static void heapSort(int arr[]) {
		Heap h = new Heap(arr);
		h.makeMaxHeap();
		for(int i=arr.length-1; i>=1; i--) {
			int max = h.delMax();
			arr[i] = max;
		}
	}
	public static void main(String[] args) {
		int[] arr = { 0, 20, 12, 35, 15, 10, 80, 30, 17, 2, 1 };
		heapSort(arr);
		printArray(arr);
		/*
		Heap h = new Heap(arr);
		printArray(arr);
		h.makeMaxHeap();
		printArray(arr);
		while(!h.isEmpty()) {
			int ele = h.delMax();
			System.out.println("Deleteted: " + ele);
		}
		*/
	}
}



class Heap {
	private int[] arr;
	private int size;
	public Heap(int[] arr) {
		this.arr = arr;
		this.size = arr.length - 1;
	}
	public void makeMaxHeap() {
		size = arr.length - 1;
		System.out.println("Size = "+size);
		for(int i=size/2; i>=1; i--) {
			System.out.println("Start of for loop  i = "+i);
			int temp = arr[i];
			System.out.println("Temp = "+temp);
			int ci = i * 2;
			System.out.println("Ci = "+ci);
			while(ci <= size) {
				// find index of greater child
				if((ci+1) <= size && arr[ci+1] > arr[ci])
					{
					ci = ci + 1;
					System.out.println("CI + 1 = "+ci);
					}
				// if temp is greater than child
				if(temp > arr[ci]) {
					System.out.println("Breaking " );
					break;
				}
				// promote child to its parent location
				arr[ci/2] = arr[ci];
				// go to its child
				ci = ci * 2;
				System.out.println("Last Ci = "+ci);
			}
			// insert temp at its parent position
			arr[ci/2] = temp;
		}
	}
	public int delMax() {
		int max = arr[1]; // root is max
		int temp = arr[size]; // need to find appropriate pos for last element
		size--; // after deleting max, heap size will reduce by 1
		int i = 1; // start finding appropriate pos for temp from the 1st pos (root)
		int ci = i * 2; 
		while(ci <= size) {
			// find index of greater child
			if((ci+1) <= size && arr[ci+1] > arr[ci])
				ci = ci + 1;
			// if temp is greater than child
			if(temp > arr[ci])
				break;
			// promote child to its parent location
			arr[ci/2] = arr[ci];
			// go to its child
			ci = ci * 2;
		}
		// insert temp at its parent position
		arr[ci/2] = temp;
		return max;
	}
	public boolean isEmpty() {
		return size == 0;
	}
}

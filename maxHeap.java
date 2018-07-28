import java.util.Scanner;
import java.util.Arrays;


public class maxHeap {

	
	private int[] heap;
	private int size;
	private int maxSize;
	

	private static final int FRONT = 1;
	
	
	public maxHeap(int maxSize) {
		this.maxSize = maxSize;
		this.size = 0;
		heap = new int[this.maxSize +1];
		heap[0] = Integer.MAX_VALUE;
	}
	
	
	private int parent(int position) {
		return position/2;
	}
	
	
	
	
	private int leftChild(int position) {
		return (position * 2);
	}
	
	
	private int rightChild(int position) {
		return (position * 2) + 1;
	}
	
	private boolean isLeaf(int position) {
		if (position >= (size / 2) && position <= size) {
			return true;
		}
		return false;
	}
	
	private void swap (int from, int to) {
		int tmp;
		tmp = heap[from];
		heap[from] = heap[to];
		heap[to] = tmp;
	}
	
	
	private void maxHeapify(int position) {
		if (!isLeaf(position)) {
			if (heap[position] < heap[leftChild(position)] || heap[position] < heap[rightChild(position)]) {
				if (heap[leftChild(position)] > heap[rightChild(position)]) {
					swap(position, leftChild(position));
					maxHeapify(leftChild(position));
				} else {
					swap(position, rightChild(position));
					maxHeapify(rightChild(position));
				}
					
			}
		}
	}
	
	
	public void insert(int element) {
		heap[++size] = element;
		int current = size;
				
		while (heap[current] > parent(current)) {
			swap(current, parent(current));
			current = parent(current);
		}
	}
	
	
	public void print() {
		for (int i = 0; i <= size/2; i++) {
			 System.out.print(" PARENT : " + heap[i] + " LEFT CHILD : " + heap[2*i]
	                  + " RIGHT CHILD :" + heap[2 * i  + 1]);
	            System.out.println();
		}
	}
	
	
	public void maxHeap() {
		for (int position = (size/2); position >= 1; position--) {
			maxHeapify(position);
		}
	}
	
	
	public int remove() {
		int popped = heap[FRONT];
		heap[FRONT] = heap[size--];
		maxHeapify(FRONT);
		return popped;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

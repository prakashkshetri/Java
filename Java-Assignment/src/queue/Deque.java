package queue;
import java.util.*;
public class Deque {

		private List<Integer> deque = new ArrayList<Integer>();
		
		public void insertFront(int val) {
			System.out.println("Adding at Front: "+ val);
			deque.add(0, val);
			System.out.println(deque);
		}
		
		public void insertRear(int val) {
			System.out.println("Adding at Rear: "+ val);
			deque.add(val);
			System.out.println(deque);
		}

		public int peekFront() {
			int val = deque.get(deque.size()-1);
			System.out.println("Element at Rear: "+ val);
			return val;
		}
		
		public int peekRear() {
			int val = deque.get(0);
			System.out.println("Element at First: "+ val);
			return val;
		}
		
		public void removeFront() {
			if(deque.isEmpty()) {
				System.out.println("Deque underflow!! unable to remove");
				return;
			}
			int rem = deque.remove(0);
			System.out.println("removed from front: "+ rem);
			System.out.println(deque);
		}
		
		public void removeRear() {
			if(deque.isEmpty()) {
				System.out.println("Deque underflow!! unable to remove");
				return;
			}
			int rem = deque.remove(deque.size()-1);
			System.out.println("removed from front: "+ rem);
			System.out.println(deque);
		}
		
		
		public static void main(String[] args) {
			Deque deq = new Deque();
			deq.insertFront(90);
			deq.insertRear(56);
			deq.insertRear(33);
			deq.insertFront(12);
			deq.peekFront();
			deq.peekRear();
			deq.removeFront();
			deq.peekFront();
			deq.removeRear();
			deq.peekFront();
			deq.insertFront(44);
			deq.insertFront(88);
		}
}
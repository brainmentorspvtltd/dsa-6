import java.util.Scanner;

class OldNode{
	int data;
	OldNode next; // Store Node reference (default is null)
	OldNode(int data){
		this.data = data;
		//this.next = null;
	}
}
class Node<T>{
	T data;
	Node<T> next;
	Node(T data){
		this.data = data;
	}
}

class LinkedListOperation<T>{
	Node<T> start;
	 void addAtEnd(Node<T> node){
		
		if(start == null) { // LL Empty
			start = node;
		}
		else {
			Node<T> temp = start;
			while(temp.next!=null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	 
	 void addAtBeg(Node<T> node){
			
			if(start == null) { // LL Empty
				start = node;
			}
			else {
				node.next = start;
				start = node;
				
			}
		}
	 
	 void addByPos(Node<T> node, int pos){
			
			if(pos == 0) { // add at start
				node.next = start;
				start = node;
			}
			int i = 1;
			Node<T> temp = start;
			while(i<=pos) {
				temp = temp.next;
				i++;
			}
			node.next = temp.next;
			temp.next  = node;
		}
	 
	 void deleteAtEnd() {
		 if(start  == null) {
			 System.out.println("LL is Empty");
			 return;
		 }
		 if(start.next== null) {
			 start = null;
			 System.out.println("Node Deleted");
			 return ;
		 }
		 Node<T> temp = start;
		 Node<T> temp2 = start;
		 while(temp.next!= null) {
			 temp2 = temp;
			 temp = temp.next;
		 }
		 temp = null;
		 temp2.next = null;
	 }
	 
	 void midPoint() {
		 Node<T> slow = start;
		 Node<T> fast = start;
		 if(start!=null) {
			 while(fast!=null && fast.next!=null) {
				 slow = slow.next;
				 fast = fast.next.next;
			 }
			 System.out.println(slow.data);
		 }
	 }
	 
	 void kthPoint(int kth) {
		 Node<T> p , q;
		 p = q = start;
		 for(int i = 1; i<=kth; i++) {
			 q = q.next;
		 }
		 while(q!=null) {
			 p = p.next;
			 q = q.next;
		 }
		 System.out.println(p.data);
	 }
	 
	 int size(){
		 int count = 0;
		 Node<T> temp = start;
		 while(temp!=null) {
			 temp = temp.next;
			 count++;
		 }
		 return count;
	 }
	 
	 Node<T> get(int index){
		 int size = this.size();
		 if(size==0) {
			 throw new RuntimeException("LL is Empty");
		 }
		 if(index<0 || index>=size) {
			 throw new RuntimeException("Invalid Index");
		 }
		 Node<T> temp = start;
		 for(int i = 1; i<=index; i++) {
			 temp  = temp.next;
		 }
		 return temp;
	 }
	 
	 void reverseByData() {
		 int left = 0;
		 int right = size() -1;
		 while(left<right) {
			 Node leftNode = get(left);
			 Node rightNode = get(right);
			 Object temp = leftNode.data;
			 leftNode.data = rightNode.data;
			 rightNode.data = temp;
			 left++;
			 right--;
		 }
	 }
	 
	 void reversePointors() {
		 if(start == null) {
			 System.out.println("LL is Empty");
			 return ;
		 }
		 if(start.next == null) {
			 System.out.println("One Node so can't reverse");
			 return ;
		 }
		 Node<T> previous = start;
		 Node<T> current = previous.next;
		 while(current!=null) {
			 Node<T> ahead = current.next;
			 current.next = previous;
			 previous = current;
			 current = ahead;
		 }
		 start = previous;
	 }
	 
	 void detectLoop() {
		 // Floyd Algo
		 Node<T> slow = start;
		 Node<T> fast = start;
		 if(start!=null) {
			 while(fast!=null && fast.next!=null) {
				 slow = slow.next;
				 fast = fast.next.next;
				 if(slow == fast) {
					 System.out.println("Cycle Present");
					 return;
				 }
			 }
			 System.out.println("No Cycle Present");
			 //System.out.println(slow.data);
		 }
	 }
	 
	 void deleteAtBeg() {
		 
	 }
	 void deleteByPos() {
		 
	 }
	 
	 void searchInLL() {
		 
	 }
	 
	 void updateLL() {
		 
	 }
	 
	 void print() {
		 Node<T> temp = start;
		 // temp.next !=null // reach to last one
		 while(temp!=null) { // cross last one
			 System.out.println(temp.data);
			 temp  = temp.next;
		 }
	 }
}

public class LinkedListOperations {

	public static void main(String[] args) {
		//OldNode old = new OldNode(100);
		//Node<String> node = new Node<>("Amit");
		
		Scanner scanner = new Scanner(System.in);
		LinkedListOperation<Integer> opr = new LinkedListOperation<>();
		while(true) {
			System.out.println("1. Add At End");
			System.out.println("2. Print");
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter the Data");
				int data= scanner.nextInt();
				Node<Integer> node = new Node<>(data);
				opr.addAtEnd(node);
				break;
			case 2:
				opr.print();
				break;
			
				
			}
		}

	}

}

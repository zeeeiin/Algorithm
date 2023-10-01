//package Study08;
//
//import java.util.*;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class arrQueue {
//
//	private int front;
//	private int rear;
//	private int size;
//	private Object[] arrQueue;
//
//	public arrQueue(int size){
//		this.front = 0;
//		this.rear = -1;
//		this.size = size;
//		this.arrQueue = new Object[this.size];
//	}
//
//
//	//Queue 배열이 꽉 차있는지 확인
//	public boolean isFull(){
//		if(rear >= size-1) return true;
//		else return false;
//	}
//
//
//
//	//Queue 배열이 비어있는지 확인
//	public boolean isEmpty(){
//
//		if(rear < front) return true;
//		else return false;
//	}
//
//
//
//	//원하는 데이터를 추가하는 메소드
//	public void enQueue(Object item){
//
//		if(isFull()) throw new ArrayIndexOutOfBoundsException();
//		this.rear++;
//		arrQueue[rear] = item;
//	}
//
//
//
//	//front에 위치한 데이터가 무엇인지 확인하는 메소드
//	public Object peek(){
//		return arrQueue[front];
//	}
//
//	//Queue의 front에 위치한 데이터 삭제
//	public Object deQueue(){
//
//		if(isEmpty()) throw new ArrayIndexOutOfBoundsException();
//
//		Object backUpItem = peek();
//		this.front++;
//		return backUpItem;
//	}
//
//	public static void main(String[] args) {
//
//		public int[] solution(int[] arr) {
//			int[] answer = {};
//
//			arrQueue arrQueue = new arrQueue(4);
//
//			while(!arrQueue.isEmpty()){
//				System.out.println(arrQueue.deQueue());
//			}
//
//			for(int i = 0; i < arr.length; i++) {
//				if(!arrQueue.isEmpty()) { //비어있지않다면				
//					if(arr[i] != answer[i]) {
//						arrQueue.enQueue(arr[i]);
//					}
//				}
//			}
//		
//		}
//	}	
//}

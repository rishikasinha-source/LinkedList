package com.assignment;

public class LinkedList<K> {
	public INode head;
	public INode tail;

	public LinkedList() {

		this.head = null;
		this.tail = null;
	}

	public void add(INode newNode) {
		if (head == null)
			this.head = newNode;
		if (tail == null)
			this.tail = newNode;
		else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	
	
	public void append(INode newNode)
	{
		if(head==null)
			this.head=newNode;
		if(tail==null)
			this.tail=newNode;
		else {
			this.tail.setNext(newNode);
			this.tail=newNode;
			
		}
	}
	
	private INode setNext(INode newNode) {
		return null;
	}
	
	
	public void insert(INode myNode,INode newNode)
	{
		INode tempNode=myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	

	public INode pop() {
		INode tempNode = this.head;
		this.head = head.getNext();
		return tempNode;
	}
	
	public void printMyNodes() {
		StringBuffer myNode = new StringBuffer("My Nodes");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			myNode.append(tempNode.getKey());
			if (!tempNode.equals(tail))
				myNode.append("->");
			tempNode = tempNode.getNext();
		}
		myNode.append(tempNode.getKey());
		System.out.println(myNode);
	}

	public INode popLast() {
		INode tempNode = head;
		while (!tempNode.getNext().equals(tail)) {
			tempNode = tempNode.getNext();
		}
		this.tail = tempNode;
		 tempNode= tempNode.getNext();
		return tempNode;
	}
	
	public INode Search(K Key) {
		int flag = 0;
		INode tempNode = head;
		while (tempNode != null) {
			if (tempNode.getKey() == Key) {
				System.out.println("Key is present");
				flag = 1;
				break;
			}
			tempNode = tempNode.getNext();
		}
		if (flag == 0)
			System.out.println("Key is not present");
		return null;

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Linked List Program");
		LinkedList linkedList=new LinkedList();
		
		MyNode<Integer> myFirstNode=new MyNode<Integer>(56);
		MyNode<Integer> mySecondNode=new MyNode<Integer>(30);
		MyNode<Integer> myThirdNode=new MyNode<	Integer>(70);	
		
		linkedList.append(myFirstNode);
		linkedList.append(myThirdNode);
		linkedList.insert(myFirstNode,mySecondNode);
		linkedList.popLast();
		linkedList.printMyNodes();
		linkedList.Search(30);

	}

}

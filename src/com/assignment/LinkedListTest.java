package com.assignment;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

	@Test
	public void given3NumberWhenAddedToTheLinkedListShouldBeAddedOnTop() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		LinkedList linkedList = new LinkedList();
		linkedList.add(myFirstNode);
		linkedList.add(mySecondNode);
		linkedList.add(myThirdNode);
		boolean result = myThirdNode.getNext().equals(mySecondNode)
				&& myThirdNode.getNext().getNext().equals(myFirstNode);
		Assert.assertTrue(result);
	
	}
	
	@Test
	public void given3NumberWhenAppendToTheLinkedListShouldBeAddedOnLast() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		LinkedList linkedList = new LinkedList();
		linkedList.append(myFirstNode);
		linkedList.append(mySecondNode);
		linkedList.append(myThirdNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode)
				&& myFirstNode.getNext().getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void given3NumberWhenInsertingSecondToTheLinkedListShouldPassLinkListResult() {
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		LinkedList linkedList = new LinkedList();
		linkedList.append(myFirstNode);
		linkedList.append(myThirdNode);
		linkedList.insert(myFirstNode, mySecondNode);
		boolean result = myFirstNode.getNext().equals(mySecondNode)
				&& myFirstNode.getNext().getNext().equals(myThirdNode);
		Assert.assertTrue(result);
	}

}

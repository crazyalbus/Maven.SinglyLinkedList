package com.zipcodewilmington.singlylinkedlist;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void listConstructorTest() {

        //Given
        Object element = "this element";

        //When
        SinglyLinkedList testList = new SinglyLinkedList(element);

        //Then
        Assert.assertTrue(testList instanceof SinglyLinkedList);
        Assert.assertNotNull(testList.startingNode);
    }

    @Test
    public void updateNextNodeTest() {
        //Given
        Object element1 = "this element";
        SinglyLinkedList testList = new SinglyLinkedList(element1);
        SinglyLinkedList.Node testNode = testList.startingNode;

        //When
        testList.startingNode.updateNextNode(testNode);

        //Then
        Assert.assertEquals(testList.startingNode, testList.startingNode.getNextNode());
    }

        @Test
    public void addTest() {

        //Given
        Object element1 = "this element";
        Object element2 = "new element";
        SinglyLinkedList testList = new SinglyLinkedList(element1);

        //When
        testList.add(element2);

        //Then
        Assert.assertTrue(testList.startingNode.getNextNode() instanceof Object);
    }

    @Test
    public void removeTest() {
        //Given
        Object element1 = "this element";
        Object element2 = "new element";
        SinglyLinkedList testList = new SinglyLinkedList(element1);
        testList.add(element2);

        //When
        Assert.assertNotNull(testList.startingNode.getNextNode());
        testList.remove(1);
        SinglyLinkedList.Node secondIndex = testList.startingNode.getNextNode();

        //Then
        Assert.assertNull(secondIndex.getElement());
    }

    @Test
    public void containsTestReturnsTrue() {
        //Given
        Object element0 = "this element";
        Object element1 = "new element";
        Object element2 = "another element";
        SinglyLinkedList testList = new SinglyLinkedList(element0);
        testList.add(element1);
        testList.add(element2);

        //When
        boolean result = testList.contains(element2);

        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void containsTestReturnsFalse() {
        //Given
        Object element0 = "this element";
        Object element1 = "new element";
        Object element2 = "another element";
        SinglyLinkedList testList = new SinglyLinkedList(element0);
        testList.add(element1);

        //When
        boolean result = testList.contains(element2);

        //Then
        Assert.assertFalse(result);
    }


    @Test
    public void findTestReturnsPositive() {
        //Given
        Object element0 = "this element";
        Object element1 = "new element";
        Object element2 = "another element";
        SinglyLinkedList testList = new SinglyLinkedList(element0);
        testList.add(element1);
        testList.add(element2);

        //When
        int result = testList.find(element2);

        //Then
        Assert.assertEquals(2, result);
    }

    @Test
    public void findTestReturnsNegative() {
        //Given
        Object element0 = "this element";
        Object element1 = "new element";
        Object element2 = "another element";
        SinglyLinkedList testList = new SinglyLinkedList(element0);
        testList.add(element1);

        //When
        int result = testList.find(element2);

        //Then
        Assert.assertEquals(-1, result);
    }

    @Test
    public void sizeTest() {
        //Given
        Object element0 = "this element";
        Object element1 = "new element";
        Object element2 = "another element";
        SinglyLinkedList testList = new SinglyLinkedList(element0);
        testList.add(element1);
        testList.add(element2);

        //When
        int result = testList.size();

        //Then
        Assert.assertEquals(3, result);
    }

    @Test
    public void getTest() {
        //Given
        Object element1 = "this element";
        Object element2 = "new element";
        SinglyLinkedList testList = new SinglyLinkedList(element1);
        testList.add(element2);

        //When
        Object result = testList.get(1);


        //Then
        Assert.assertEquals(element2, result);
    }

    //    @Test
//    public void nodeConstructorTest() {
//
//
//
//    }
}

package test.anh3h;

import java.util.LinkedList;

/**
 * Created by anh3h on 01/03/2018.
 */
/*
    Design an int type singly linkedlist class, and then implement some functions below using the self designed class.
    Can not use Java built in List interface
    1. Append an element into the linkedlist
    2. Remove the tail element from a linkedlist
    3. Remove all element in the linkedlist that is great than a target value
    ****
    Please be advised that this Quiz is only for testing purpose, it will not be used for our project and it also will not be paid.
    ****
     */
public class SinglyLinkedList {
    /*
    Data structure for element
     */
    class Node {
        int data;
        Node next;
        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    };
    private Node head;
    private int size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    /*
     1. Append an element into the linkedlist
     */
    public Node append(int value) {
        Node n = new Node(value, null);
        if (head == null) {
            head = n;
        } else {
            Node tmpNode = head;
            while (tmpNode.next != null) {
                tmpNode = tmpNode.next;
            }
            tmpNode.next = n;
        }
        size++;
        return head;
    }

    /*
    Remove the tail element from a linkedlist
     */
    public void removeTail() {
        if (size == 0 || head == null) {
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
        } else {
            Node tmp1 = head;
            Node tmp2 = null;
            while (tmp1.next != null) {
                tmp2 = tmp1;
                tmp1 = tmp1.next;
            }
            tmp2.next = null;
        }
    }

    /*
    Remove all element in the linkedlist that is great than a target value
     */
    public void removeAllElementsGreaterThanCurrentValue(int value) {
        int index = 0;
        while (size > 0 && index < size) {
            if(get(index) > value) {
                remove(index);
                index = 0;
            }
            index++;
        }
    }

    /*
    Get value at a specified position
     */
    public int get(int index) {
        if (index >= 0 && index < size) {
            Node tmp = head;
            for (int i = 1; i <= index; i++) {
                tmp = tmp.next;
            }
            return tmp.data;
        } else {
            throw  new IndexOutOfBoundsException("Index out of bound");
        }
    }

    /*
    Remove element at a specified position
     */
    public void remove(int index) {
        if (index >= 0 && index < size) {
           if (index == 0) {
               head = head.next;
               size--;
           } else if (index == size - 1) {
               removeTail();
           } else {
               Node tmp1 = head;
               Node tmp2 = null;
               for (int i = 1; i <= index; i++) {
                   tmp2 = tmp1;
                   tmp1 = tmp1.next;
               }
               tmp2.next = tmp1.next;
               size--;
           }

        } else {
            throw  new IndexOutOfBoundsException("Index out of bound");
        }
    }

    /*
        Get size of linkedlist
     */
    public int size() {
        return this.size;
    }


}
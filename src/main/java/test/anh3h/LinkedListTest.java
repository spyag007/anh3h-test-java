package test.anh3h;

import java.util.LinkedList;

/**
 * Created by anh3h on 01/03/2018.
 */
public class LinkedListTest {

    public static void main(String[] args) {
       SinglyLinkedList s = new SinglyLinkedList();
        s.append(10);
        s.append(23);
        s.append(34);
        s.append(56);
        s.append(45);

        s.removeAllElementsGreaterThanCurrentValue(33);
        for(int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }
        s.removeTail();
        s.removeTail();
        s.removeTail();
    }
}

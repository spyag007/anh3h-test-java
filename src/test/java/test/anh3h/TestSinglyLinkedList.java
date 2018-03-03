package test.anh3h;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anh3h on 03/03/2018.
 */
public class TestSinglyLinkedList {

    @Test
    public void testAppend() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        Assert.assertEquals("size=3", 3, linkedList.size());
        Assert.assertEquals("index=0", 1, linkedList.get(0));
        Assert.assertEquals("index=1", 2, linkedList.get(1));
        Assert.assertEquals("index=2", 3, linkedList.get(2));
    }

    @Test
    public void testRemoveTail() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);

        Assert.assertEquals("size=3", 3, linkedList.size());

        linkedList.removeTail();
        Assert.assertEquals("size=2", 2, linkedList.size());

        linkedList.removeTail();
        Assert.assertEquals("size=1", 1, linkedList.size());

        linkedList.removeTail();
        Assert.assertEquals("size=0", 0, linkedList.size());
    }

    @Test
    public void testRemoveAllElementsGreaterThanCurrentValue() {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.append(10);
        linkedList.append(23);
        linkedList.append(56);
        linkedList.append(34);
        linkedList.append(45);

        Assert.assertEquals("Before testing: size=5", 5, linkedList.size());
        linkedList.removeAllElementsGreaterThanCurrentValue(34);
        Assert.assertEquals("After testing: size=3", 3 , linkedList.size());
        Assert.assertEquals("After testing: index=0", 10 , linkedList.get(0));
        Assert.assertEquals("After testing: index=1", 23 , linkedList.get(1));
        Assert.assertEquals("After testing: index=2", 34 , linkedList.get(2));
    }


}

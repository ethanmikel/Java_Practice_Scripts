//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import static java.lang.System.*;

public class ListFunHouseTwo {
    private ListNode theList;

    public ListFunHouseTwo() {
        theList = null;
    }

    public void add(Comparable data) {
        theList = new ListNode(data, theList);
    }
    public int nodeCount() {
        int count = 0;

        if (theList != null) {
            ListNode curNode = theList;

            while (curNode != null) {
                curNode = curNode.getNext();
                ++count;
            }
        }

        return count;
    }
    public void doubleFirst() {
        if (theList == null) {
            return;
        }

        theList = new ListNode(theList.getValue(), theList);
    }
    public void doubleLast() {
        if (theList == null) {
            return;
        }

        ListNode curNode = theList;

        while (curNode.getNext() != null) {
            curNode = curNode.getNext();
        }

        curNode.setNext(new ListNode(curNode.getValue(), null));
    }
    public void skipEveryOther() {
        if (theList == null) {
            return;
        }

        ListNode curNode = theList, prevNode = null;

        int count = 0;

        while (curNode != null) {
            count++;

            if (count == 2) {
                prevNode.setNext(curNode.getNext());
                count = 0;
            }

            if (count != 0)
                prevNode = curNode;

            curNode = prevNode.getNext();
        }
    }
    public void setXthNode(int x, Comparable value) {
        ListNode curNode = theList;
        int i = 0;

        while (curNode != null) {

            if ((i + 1) % x == 0) {
                curNode.setValue(value);
            }
            curNode = curNode.getNext();
            ++i;
        }
    }
    public void removeXthNode(int x) {

        if (theList == null || x == 1) {
            theList = null;
            return;
        }

        ListNode curNode = theList, prevNode = null;

        int count = 0;

        while (curNode != null) {

            count++;

            if (x == count) {
                prevNode.setNext(curNode.getNext());
                count = 0;
            }

            if (count != 0)
                prevNode = curNode;

            curNode = prevNode.getNext();
        }
    }
      public String toString() {
        StringBuilder output = new StringBuilder();

        ListNode curNode = theList;

        while (curNode != null) {
            output.append(curNode.getValue()).append(" ");
            curNode = curNode.getNext();
        }

        return output.toString();
    }
}
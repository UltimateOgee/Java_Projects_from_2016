
package nodelinklistpractice;

public class LinkedIntList{
    
    public ListNode front;
    //constructor
    public LinkedIntList() {

    }
    //add sorted
    public void addSorted(int value) {
        if (front == null || value <= front.data) {
            front = new ListNode(value, front);
        } else {
            ListNode current = front;
            while (current.next != null
                    && current.next.data < value) {
                current = current.next;
            }
            current.next = new ListNode(value, current.next);
        }
    }
}

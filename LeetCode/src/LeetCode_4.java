class LinkList {
    Node head = null;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("Null");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public boolean isCycleList(Node head) {
        Node fast, slow;
        slow = fast = head;
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return false;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}

public class LeetCode_4 {
    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.addFirst(40);
        ll.addFirst(40);
        ll.addFirst(40);
        ll.addFirst(30);
        ll.addFirst(30);
        ll.addFirst(20);
        ll.addFirst(20);
        ll.addFirst(20);
        ll.addFirst(10);
        ll.printList();

        ll.printList();
        // System.out.println(ll.isCycleList(ll.head));
    }
}
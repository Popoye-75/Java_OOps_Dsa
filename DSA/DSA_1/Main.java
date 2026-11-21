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
            System.out.println("null");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public Node merge(Node l1 , Node int val) {
        if (head == null) {
            return null;
        }
        while (head.data == val && head.next != null) {
            head = head.next;
        }
        if (head.data == val && head.next == null) {
            head = null;
        } else {
            Node currNode = head;
            while (currNode != null && currNode.next != null) {
                if (currNode.next.data == val) {
                    currNode.next = currNode.next.next;
                } else {
                    currNode = currNode.next;
                }
            }
        }
        return head;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkList list = new LinkList();
        LinkList list2 = new LinkList();
        // list.addFirst(3);
        // list.addFirst(3);
        // list.addFirst(6);
        // list.addFirst(3);
        list.printList();
        // list.removeVal(3);
        list.head = list.merge(list.head,list2.head);
        list.printList();
    }
}
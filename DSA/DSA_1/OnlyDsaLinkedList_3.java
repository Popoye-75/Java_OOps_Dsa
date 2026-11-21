public class OnlyDsaLinkedList_3 {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // /* Question 1 --> Create and Display <-------- */
    public void printList() {
        Node currNode = head;
        if (head == null) {
            System.out.println("Null");
            return;
        }
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    // /* Question 2 --> Add element at begining <------ */
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // /* Question 3 --> Add element at last <------ */
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        newNode = currNode;
    }

    // /* Question 4 --> Remove first <------ */
    public void delete() {
        if (head == null) {
            return;
        }
        head = head.next;
    }

    // /* Question 5 --> Remove from last <------- */
    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
    }

    // /* Question 6 --> Insert at position <-------- */
    public void addAtPosition(int i, int data) {
        Node newNode = new Node(data);
        if (head == null || i == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        int count = 0;
        Node currNode = head;
        while (currNode != null) {
            if (count == i - 1) {
                newNode.next = currNode.next;
                currNode.next = newNode;
                return;
            }
            currNode = currNode.next;
            count++;
        }
    }

    // /* Question 7 --> Search for element in list <------- */
    public boolean search(int x) {
        if (head == null) {
            return false;
        }
        Node currNode = head;
        while (currNode != null) {
            if (currNode.data == x) {
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }

    // /* Question 8 --> Reverse linked list <------- */
    public void reverseList() {

    }

    // /* Question 9 --> Find middle node <------- */
    public Node middleNode(Node head) {
        return head;
    }

    // /* Question 10 --> Detect Cycle <------- */
    public boolean isCycle() {
        if (head == null) {
            return !true;
        }
        if (head.next == null) {
            return !true;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return !false;
            }
        }
        return !true;
    }

    // /* Question 11 --> Merge two sorted list <--------- */
    public Node mergeList(Node list1, Node list2) {
        Node l1 = list1, list = list1;
        Node l2 = list2;
        while (l1.next != null && l2.next != null) {
            if (l1.data <= l2.data) {
                l1.next = l2;
                // l1 = l2;
            }
            // l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            l1.next = l2;
        }
        while (l2 != null) {
            l2.next = l1;
        }
        return list;
    }

    // /* Question 12 --> Remove given node of given value */
    public Node removeVal(Node head, int val) {
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

    public static void main(String[] args) {
        // OnlyDsaLinkedList_3 list = new OnlyDsaLinkedList_3();
        // list.addFirst(6);
        // list.addFirst(5);
        // list.addFirst(4);
        // list.addFirst(3);
        // list.addFirst(2);
        // list.addFirst(1);
        // list.addAtPosition(4, 5);
        // list.printList();
        // list.delete();
        // list.printList();
        // list.deleteLast();
        // list.printList();
        // System.out.println("X is found : " + list.search(90));

        // /* Merge two sorted list */
        // OnlyDsaLinkedList_3 list1 = new OnlyDsaLinkedList_3();
        // OnlyDsaLinkedList_3 list2 = new OnlyDsaLinkedList_3();
        // list2.addFirst(6);
        // list1.addFirst(5);
        // list2.addFirst(4);
        // list1.addFirst(3);
        // list2.addFirst(2);
        // list1.addFirst(1);
        // list1.printList();
        // list2.printList();
        // System.out.println("List after merging ...!");
        // list1.mergeList(list1, list2);

        // OnlyDsaLinkedList_3 list = new OnlyDsaLinkedList_3();
        // list.addFirst(5);
        // list.addFirst(6);
        // list.addFirst(4);
        // list.addFirst(6);
        // list.addFirst(6);
        // list.printList();
        // list.head = list.removeVal(list.head, 6);
        // list.printList();
    }
}

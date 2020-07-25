package circularLinkedList;

public class CircularList {
    Node head;
    Node queue;
    public static CircularList insert (CircularList list, int data) {
        Node newNode = new Node(data);
        newNode.previous = null;
        newNode.next = null;

        if (list.head == null){
            list.head = newNode;
            list.queue = newNode;
        } else {
            Node lastNode = list.head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
            lastNode.previous = lastNode;
        }
        return list;
    }
    public static CircularList deleteByKey (CircularList list, int key) {
        System.out.println();
        System.out.println("Delete Element " + key + " from Linked List ");
        Node currentNode = list.head, previousNode = null;

        if (currentNode != null && currentNode.data == key) {
            list.head = currentNode.next;
            System.out.println(key + " found and deleted");
            return list;
        }
        while (currentNode != null && currentNode.data != key) {
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        if (currentNode != null) {
            previousNode.next = currentNode.next;
            System.out.println(key + " found and deleted");
        }
        if (currentNode == null) {
            System.out.println(key + " not found"); }
        return list;
    }
    public static void printList (CircularList list) {
        Node currentNode = list.head;
        System.out.print("Doubly List Elements: ");

        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
    public static void main(String[] args) {
        CircularList list = new CircularList();
        list = insert(list, 4);
        list = insert(list, 1);
        list = insert(list, 3);
        list = insert(list, 8);

        printList(list);
        deleteByKey(list, 1);
        printList(list);
    }

}

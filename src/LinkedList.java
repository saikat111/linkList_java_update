public class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        public Node(int d) {
           data = d;
           next = null;
        }
    }
    void push(int new_data){
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    void printList(){
        Node tnode = head;
        while (tnode != null){
            System.out.println(tnode.data);
            tnode = tnode.next;
        }
    }
    void deleteNode(int key){
        Node temp = head , prev = null;
        if(temp != null && temp.data == key){
            head = temp.next;
            return;
        }
        while (temp != null && temp.data !=key){
            prev = temp;
            temp = temp.next;
        }
        if(temp == null){
            return;
        }
        prev.next = temp.next;
    }
    public Boolean search(Node head , int x){
        Node current = head;
        while (current != null){
            if(current.data == x)
                return true;
                current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.push(2);
        llist.push(7);
        llist.push(3);
        llist.printList();
        System.out.println("delete");
        llist.deleteNode(2);
        llist.printList();
        if(llist.search(llist.head,3)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

    }
}

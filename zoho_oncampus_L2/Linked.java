class Linked {
    static Node head;

    public static void main(String[] args) {
        Linked llis = new Linked();
        llis.push(14);
        llis.push(10);
        llis.push(4);
        llis.push(15);
        llis.push(6);
        //llis.head.next.next.next = llis.head;
        if (detectLoop(head)) {
            System.out.println("Loop");
        } else {
            System.out.println("No Loop");
        }
    }
    static void push(int i) {
        Node new_node = new Node(i);
        new_node.next = head;
        head = new_node;
    }
    static  boolean detectLoop(Node head) {
        if (head == null || head.next == null) {
            return false;
        }
        Node slow = head;
        Node fast = head.next;
        while ((fast.next != null) && (fast.next.next != null)) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
            //System.out.println(slow + " " + fast);
        }
        //System.out.println((slow + " " + fast));
        return slow == fast;
    }

}
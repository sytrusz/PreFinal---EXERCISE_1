class TestQueue{
    public static void main(String[] args){
        Queue queue = new QueueArray(10);
        queue.enqueue(1);
        queue.enqueue("two");
        queue.enqueue(new Integer(3));
        System.out.println(queue.getFront());
        queue.dequeue();
        System.out.println(queue.getFront());
        queue.dequeue();
        System.out.println(queue.getFront());
        queue.dequeue();

        queue = new QueueLinkedList();
        queue.enqueue(1);
        queue.enqueue("two");
        queue.enqueue(new Integer(3));
        System.out.println(queue.getFront());
        queue.dequeue();
        System.out.println(queue.getFront());
        queue.dequeue();
        System.out.println(queue.getFront());
    }
}
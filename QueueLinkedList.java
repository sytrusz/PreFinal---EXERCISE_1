class QueueLinkedList extends Queue{

    private QueueNode queueHead;

    public QueueLinkedList(){
        queueHead = null;
    }

    public void enqueue(Object item){
        QueueNode newNode = new QueueNode(item);
        if (queueHead == null){
            queueHead = newNode;
        } else {
            QueueNode current = queueHead;
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void dequeue(){
        if (queueHead != null) {
            queueHead = queueHead.getNext();
        }
    }

    public Object getFront(){
        if (queueHead != null) {
            return queueHead.getItem();
        } else {
            return null;
        }
    }

    private class QueueNode{
        private Object item;
        private QueueNode next;

        public QueueNode(Object item){
            this.item = item;
            this.next = null;
        }

        public void setItem(Object item){
            this.item = item;
        }

        public Object getItem(){
            return item;
        }

        public void setNext(QueueNode next){
            this.next = next;
        }

        public QueueNode getNext(){
            return next;
        }
    }
}
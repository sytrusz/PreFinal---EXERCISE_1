class QueueArray extends Queue{
    private int size;
    private Object[] queueArray;

    public QueueArray(){
        this.size = 10;
        this.queueArray = new Object[size];
    }

    public QueueArray(int size){
        this.size = size;
        this.queueArray = new Object[size];
    }

    public void enqueue(Object item){
        if (queueArray[size - 1] != null){
            System.out.println("Queue is Full!");
        }else{
            int i;
            for (i = size - 1; i >= 0; i--){
                if (queueArray[i] == null){
                    queueArray[i] = item;
                    break;
                }
            }
        }
    }

    public void dequeue(){
        if (queueArray[0] == null){
            System.out.println("Queue is Empty!");
        }else{
            int i;
            for (i = 0; i < size - 1; i++){
                queueArray[i] = queueArray[i+1];
            }
            queueArray[i] = null;
        }
    }

    public Object getFront(){
        if (queueArray[0] == null){
            System.out.println("Queue is Empty!");
            return null;
        } else {
            return queueArray[0];
        }
    }
}
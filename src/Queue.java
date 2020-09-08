public class Queue {

        private int maxSize; //initializes a set numuber of slots
       // private long[] queueArray; //slots to maintain the data;
    private long[] queueArray; //slots to maintain the data;
        private int front; //index position for the eement in the front
        private int rear; //index position for the element at the back for the queue
        private int kelements; //counter to maintain the number of ites in the queue;

        //constructor to initialise the size of the array
        public Queue(int size){
            this.maxSize=size;
            this.queueArray= new long[size];
            this.front = 0;
            this.rear = -1;
            kelements=0;
        }

        public void insert(int j){
            if (rear==maxSize-1){
                rear=-1;
            }
            rear++;
            queueArray[rear]=j;
            kelements++;//should be increamented as well
        }
        //remove item from the front of the queue
        public long remove(){

          long temp =  queueArray[front];
          queueArray[front]=0;
          front++;
         if (front==maxSize) { //this means we've removed everything from the queue
             front = 0;
         }
              kelements--;
          return temp;
        }

        //front is a pointer just pointing to the front of the queue

        public  long peekFront(){
            return queueArray[front];
        }

    //view method for showing items in the list and also sorting it in ascending order
        public void view(){
            System.out.print("[ ");
            for (int i=0;i<queueArray.length;i++){
                //sort in ascending
                for (int j=i+1;j<queueArray.length;j++)
                    if (queueArray[i]>queueArray[j]){
                        long t= queueArray[i];
                        queueArray[i]=queueArray[j];
                        queueArray[j]=t;
                    }
                System.out.print(queueArray[i]+ " ");
            }
            System.out.print("]");


        }

    //handy methods to provide feedback and preventing arrayIndex out of bounds exception
    public boolean isEmpty(){
        return(kelements==0);
    }
    //prevent inserting too many items beyond queue capacity
    public boolean isFull(){
        return(kelements==maxSize);
    }
    }



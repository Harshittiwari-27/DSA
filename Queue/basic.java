public class basic {
    static class Queue
    {
         static int arr[];
         static int size;
         static int rear;   // ye to chnage hota rahega 
         static int front ;

        Queue(int n) // array ka size ....made a constructor
        {
            arr=new int[n];
            size =n;
            rear=-1;
            front=-1;
        }

        public static boolean isEmpty()

        {
              return rear ==-1 && front ==-1; // agr que empty hai  then it is -1 then it will return false                      
        }

        public static boolean isFull()
        {
            return (rear+1)% size == front;
        }


        public static void add(int data)
        {
            // if(rear ==size-1)
            if(isFull())
            {
                System.out.println("Queue is full");
                return ;
            }
            // condoton while adding the first element 
            if(front ==-1)
            {
                front=0;
            }

            // rear =rear+1;
            rear=(rear+1) % size;
            arr[rear]=data;
        }
  
          

        // remove 
        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("empty queue");
                return -1;
            }

            int result =arr[front];
            front=(front+1)%size;

            // ladt element delete or remove
            if(rear==front)
            {
                rear=front-1;
            }
            else{
                front=(front+1)%size;

            }


            return result;

            
                    // int front =arr[0];
            //      O(n) this fxn was and now we are  implementing ut in hte fxn of O(1)
            //      for(int i=0;i<rear;i++){
            //     arr[i]=arr[i+1];

            }
            rear=rear-1;

            return front ;
        }
         

        // peek
        public static int peek(){
            if(isEmpty())
            {
                System.out.println("empty queue");
                return -1;
            }
            // return arr[0];
            return arr[front];                    
        }




    }

    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}

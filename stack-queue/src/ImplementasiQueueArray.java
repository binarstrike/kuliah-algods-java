public class ImplementasiQueueArray {
  public static void main(String[] args) {
    QueueWithArray  q = new QueueWithArray();

    q.enqueue(16);
    q.enqueue(24);
    q.enqueue(32);
    q.display();

    q.dequeue();
    q.display();

    q.enqueue(64);
    q.enqueue(127);
    q.enqueue(48);
    q.display();

    q.front();

    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.display();
  }
}

class QueueWithArray {
  private static final int MAX_SIZE = 5;
  private final int[] queueArray;
  private int front, rear, size;

  public QueueWithArray() {
    this.queueArray = new int[MAX_SIZE];
    this.front = 0;
    this.rear = -1;
    this.size = 0;
  }

  // Method untuk menambah elemen ke dalam antrian (enqueue)
  public void enqueue(int item) {
    if (size == MAX_SIZE) {
      System.out.println("Queue is full. Cannot enqueue. ");
      return;
    }
    rear = (rear + 1) % MAX_SIZE;
    queueArray[rear] = item;
    size++;
    System.out.println("Enqueued: " + item);
  }

  // Method untuk menghapus elemen dari antrian (dequeue)
  public void dequeue() {
    if (size == 0) {
      System.out.println("Queue is empty. Cannot dequeue.");
      return;
    }
    int removedItem = queueArray[front];
    front = (front + 1) % MAX_SIZE;
    size--;
    System.out.println("Dequeued: " + removedItem);
  }

  // Method untuk mendapatkan elemen yang ada di depan antrian
  public void front() {
    if (size == 0) {
      System.out.println("Queue is empty. ");
      return;
    }
    System.out.println("Front element: " + queueArray[front]);
  }

  // Method untuk menampilkan seluruh elemen dalam antrian
  public void display() {
    if (size == 0) {
      System.out.println("Queue is empty.");
      return;
    }
    System.out.print("Queue elements: ");
    int i = front;
    for (int count = 0; count < size; count++) {
      System.out.print(queueArray[i] + " ");
      i = (i + 1) % MAX_SIZE;
    }
    System.out.println();
  }
}
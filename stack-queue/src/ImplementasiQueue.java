import java.util.Scanner;

public class ImplementasiQueue {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan ukuran antrian: ");
    int size = scanner.nextInt();

    Queue queue = new Queue(size);
    int choice;
    do {
      System.out.println("\nMenu:");
      System.out.println("1. Enqueue");
      System.out.println("2. Dequeue");
      System.out.println("3. Display");
      System.out.println("0. Keluar");
      System.out.print("Pilihan Anda: ");
      choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.print("Masukkan elemen yang akan ditambahkan: ");
          int enqueueValue = scanner.nextInt();
          queue.enqueue(enqueueValue);
          break;
        case 2:
          queue.dequeue();
          break;
        case 3:
          queue.display();
          break;
        case 0:
          System.out.println("Keluar dari program. ");
          break;
        default:
          System.out.println("Pilihan tidak valid. Silakan coba lagi. ");

      }
    } while (choice != 0);

    scanner.close();
  }
}

class Queue {
  private final int maxSize;
  private final int[] queueArray;
  private int front;
  private int rear;

  public Queue(int size) {
    maxSize = size;
    queueArray = new int[maxSize];
    front = 0;
    rear = -1;
  }

  public void enqueue(int value) {
    if (rear == maxSize - 1) {
      System.out.println("Antrian penuh. Tidak dapat menambahkan elemen. ");
    } else {
      queueArray[++rear] = value;
      System.out.println("Elemen " + value + " ditambahkan ke dalam antrian.");
    }
  }

  public void dequeue() {
    if (isEmpty()) {
      System.out.println("Antrian kosong. Tidak dapat menghapus elemen. ");
    } else {
      int removedValue = queueArray[front++];
      System.out.println("Elemen " + removedValue + " dihapus dari antrian. ");
    }
  }

  public boolean isEmpty() {
    return front > rear;
  }

  public void display() {
    if (isEmpty()) {
      System.out.println("Antrian kosong.");
    } else {
      System.out.print("Isi antrian: ");
      for (int i = front; i <= rear; i++) {
        System.out.print(queueArray[i] + " ");
      }
      System.out.println();
    }
  }
}
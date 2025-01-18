import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Node {
  public int id;
  public String data;
  public Node leftChild;
  public Node rightChild;

  public Node() {
  }

  public void displayNode() {
    System.out.printf("{ %d, %s }", this.id, this.data);
  }
}

class Tree {
  private Node root;

  public Tree() {
    root = null;
  }

  public Node find(int key) {
    Node current = root;
    while (current.id != key) {
      if (key < current.id) {
        current = current.leftChild;
      } else {
        current = current.rightChild;
      }

      if (current == null) {
        return null;
      }
    }
    return current;
  }

  public void insert(int id, String data) {
    Node newNode = new Node();
    newNode.id = id;
    newNode.data = data;

    if (root == null) {
      root = newNode;
    } else {
      Node current = root;
      Node parent;
      while (true) {
        parent = current;
        if (id < current.id) {
          current = current.leftChild;
          if (current == null) {
            parent.leftChild = newNode;
            return;
          }
        } else {
          current = current.rightChild;
          if (current == null) {
            parent.rightChild = newNode;
            return;
          }
        }
      }
    }
  }

  public boolean delete(int key) {
    Node current = root;
    Node parent = root;
    boolean isLeftChild = true;

    while (current.id != key) {
      parent = current;

      if (key < current.id) {
        isLeftChild = true;
        current = current.leftChild;
      } else {
        isLeftChild = false;
        current = current.rightChild;
      }
      if (current == null) {
        return false;
      }
    }

    if (current.leftChild == null && current.rightChild == null) {
      if (current == root) {
        root = null;
      } else if (isLeftChild) {
        parent.leftChild = current.leftChild;
      } else {
        parent.rightChild = current.leftChild;
      }
    } else if (current.rightChild == null) {
      if (current == root) {
        root = current.leftChild;
      } else if (isLeftChild) {
        parent.leftChild = current.leftChild;
      } else {
        parent.rightChild = current.leftChild;
      }
    } else if (current.rightChild == null) {
      if (current == root) {
        root = current.rightChild;
      } else if (isLeftChild) {
        parent.leftChild = current.rightChild;
      } else {
        parent.rightChild = current.rightChild;
      }
    } else {
      Node successor = getSuccessor(current);
      if (current == root) {
        root = successor;
      } else if (isLeftChild) {
        parent.leftChild = successor;
      } else {
        parent.rightChild = successor;
      }

      successor.leftChild = current.leftChild;
    }

    return true;
  }

  private Node getSuccessor(Node delNode) {
    Node successorParent = delNode;
    Node successor = delNode;
    Node current = delNode.rightChild;

    while (current != null) {
      successorParent = successor;
      successor = current;
      current = current.leftChild;
    }

    if (successor != delNode.rightChild) {
      successorParent.leftChild = successor.rightChild;
      successor.rightChild = delNode.rightChild;
    }

    return successor;
  }

  public void traverse(int type) {
    switch (type) {
      case 1:
        System.out.println("Preorder traversal: ");
        preOrder(root);
        break;
      case 2:
        System.out.println("Inorder traversal: ");
        inOrder(root);
        break;
      case 3:
        System.out.println("Postorder traversal: ");
        postOrder(root);
        break;
      default:
        System.out.println("Invalid type");
    }

    System.out.println();
  }

  private void preOrder(Node localRoot) {
    if (localRoot != null) {
      System.out.println(localRoot.id + " ");
      preOrder(localRoot.leftChild);
      preOrder(localRoot.rightChild);
    }
  }

  private void inOrder(Node localRoot) {
    if (localRoot != null) {
      inOrder(localRoot.leftChild);
      System.out.println(localRoot.id + " ");
      inOrder(localRoot.rightChild);
    }
  }

  private void postOrder(Node localRoot) {
    if (localRoot != null) {
      postOrder(localRoot.leftChild);
      postOrder(localRoot.rightChild);
      System.out.println(localRoot.id + " ");
    }
  }

  public void displayTree() {
    Stack<Node> globalStack = new Stack<>();
    globalStack.push(root);
    int nBlanks = 32;
    boolean isRowEmpty = false;

    System.out.println(".".repeat(30));

    while (isRowEmpty == false) {
      Stack<Node> localStack = new Stack<>();
      isRowEmpty = true;

      System.out.print(" ".repeat(nBlanks));

      while (globalStack.isEmpty() == false) {
        Node temp = globalStack.pop();

        if (temp != null) {
          System.out.print(temp.id);
          localStack.push(temp.leftChild);
          localStack.push(temp.rightChild);

          if (temp.leftChild != null || temp.rightChild != null) {
            isRowEmpty = false;
          }
        } else {
          System.out.println("--");
          localStack.push(null);
          localStack.push(null);

          System.out.print(" ".repeat(nBlanks * 2 - 2));
        }
      }

      System.out.println("");
      nBlanks /= 2;

      while (localStack.isEmpty() == false) {
        globalStack.push(localStack.pop());
      }
    }
    System.out.println(".".repeat(30));
  }
}

public class TreeApp {
  private static final InputStreamReader isr = new InputStreamReader(System.in);
  private static final BufferedReader buffR = new BufferedReader(isr);

  public static void main(String[] args) throws IOException, NumberFormatException {
    int value;
    String data;
    Tree myTree = new Tree();

    myTree.insert(1, "Binar Nugroho");
    myTree.insert(12, "Ucup");
    myTree.insert(16, "Dika");
    myTree.insert(24, "Otong");
    myTree.insert(32, "Asep");
    myTree.insert(48, "Ujang");
    myTree.insert(64, "Ani");
    myTree.insert(128, "Fufu Fafa");
    myTree.insert(192, "Rize");
    myTree.insert(224, "Aoyama");
    myTree.insert(240, "Midori");

    while (true) {
      System.out.print("Masukan huruf pertama dari pilihan aksi berikut.\ninsert, find, delete, traverse: ");
      int pilihan = 0;

      try {
        pilihan = getString().charAt(0);
      } catch (Exception _) {
        continue;
      }

      switch (pilihan) {
        case 's':
          myTree.displayTree();
          break;
        case 'i':
          System.out.println("Masukan nilai dan data");
          System.out.print("value: ");
          value = Integer.parseInt(getString());
          System.out.print("data: ");
          data = getString();
          myTree.insert(value, data);
          break;
        case 'f':
          System.out.print("Masukan nilai yang akan dicari: ");
          value = Integer.parseInt(getString());
          Node found = myTree.find(value);

          if (found != null) {
            System.out.print("Data ditemukan: ");
            found.displayNode();
            System.out.println("");
          } else {
            System.out.printf("Data tidak ditemukan dengan nila: %d\n", value);
          }
          break;
        case 'd':
          System.out.print("Masukan nilai yang akan dihapus: ");
          value = Integer.parseInt(getString());
          boolean dihapus = myTree.delete(value);
          if (dihapus) {
            System.out.printf("Data telah dihapus dengan nilai: %d\n", value);
          } else {
            System.out.printf("Data tidak dapat dihapus dengan nilai: %d\n", value);
          }
          break;
        case 't':
          System.out.print("Masukan tipe 1, 2 atau 3: ");
          value = Integer.parseInt(getString());
          myTree.traverse(value);
          break;
        case 'q':
          System.out.println("Bye!");
          return;
        default:
          System.out.println("Pilihan yang dimasukan salah");
      }
    }
  }

  private static String getString() throws IOException {
    String str = buffR.readLine();
    return str;
  }
}

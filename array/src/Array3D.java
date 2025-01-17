public class Array3D {
  public static void main(String[] args) {
    // deklarasi array 3 dimensi
    int[][][] cube = {
        { { 4, 6 }, { 5, 8 } },
        { { 2, 3 }, { 5, 9 } },
        { { 2, 7 }, { 9, 4 } }
    };

    // menampilakan elemen-elemen dari array 3 dimensi menggunakan perulangan
    for (int i = 0; i < cube.length; i++) {
      for (int j = 0; j < cube[i].length; j++) {
        for (int k = 0; k < cube[i][j].length; k++) {
          System.out.print(cube[i][j][k] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}

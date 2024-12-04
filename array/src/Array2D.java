public class Array2D {
  public static void main(String[] args) {
    int[][] matrix = {
        { 4, 5, 7 },
        { 3, 8, 6 },
        { 6, 2, 9 }
    };

    // menampilkan elemen-elemen dari array matrix dengan perulangan
    for (int i = 0; i < matrix.length; i++) {
      System.out.println("baris "+(i+1));
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.println(matrix[i][j]);
      }
    }
  }
}
